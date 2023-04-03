public class Semesta extends RasiBintang{
    public Semesta(){
    }

    public String findRasiBintang(int BintangBesar, int BintangKecil, int NodeLepas){
        for (int i = 0 ; i < this.getRasiBintang().size() ; i++) {
            if (this.getRasiBintang().get(i).getBintangBesar() == BintangBesar && this.getRasiBintang().get(i).getBintangKecil() == BintangKecil && this.getRasiBintang().get(i).getNodeLepas() == NodeLepas){
                return this.getRasiBintang().get(i).getNama();
            }
        }
        return "Bintang tidak ditemukan!";
    }
}
