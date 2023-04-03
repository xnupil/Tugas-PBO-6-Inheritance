public class Bintang {
    private String nama;
    private int bintangBesar, bintangKecil, nodeLepas;

    Bintang(int bintangBesar, int bintangKecil, int nodeLepas, String nama){
        this.bintangBesar = bintangBesar;
        this.bintangKecil = bintangKecil;
        this.nodeLepas = nodeLepas;
        this.nama = nama;
    }

    public int getBintangBesar() {
        return bintangBesar;
    }

    public int getBintangKecil() {
        return bintangKecil;
    }

    public int getNodeLepas() {
        return nodeLepas;
    }

    public String getNama() {
        return nama;
    }

    public String toString() {
        return "Nama : " + nama + "\nBintang Besar : " + bintangBesar + "\nBintang Kecil : " + bintangKecil + "\nNode Lepas : " + nodeLepas;
    }
}
