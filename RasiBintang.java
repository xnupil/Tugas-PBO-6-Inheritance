import java.util.ArrayList;
import java.util.Arrays;

public class RasiBintang {
    private ArrayList<Bintang> rasiBintang = new ArrayList<Bintang>();

    public ArrayList<Bintang> getRasiBintang() {
        return rasiBintang;
    }

    public void generate(){
        Bintang Capricorn = new Bintang(1, 4, 0, "Capricorn");
        Bintang Scorpio = new Bintang(2, 7, 4, "Scorpio");
        Bintang Gemini = new Bintang(2, 5, 2, "Gemini");
        Bintang Sagittarius = new Bintang(3, 12, 5, "Sagittarius");
        Bintang Piesces = new Bintang(3, 6, 0, "Piesces");
        Bintang Leo = new Bintang(2, 7, 1, "Leo");
        Bintang Taurus = new Bintang(1, 5, 3, "Taurus");
        Bintang Libra = new Bintang(2, 5, 0, "Libra");
        Bintang virgo = new Bintang(4, 7, 4, "Virgo");
        Bintang Aries = new Bintang(1, 2, 2, "Aries");
        Bintang Aquarius = new Bintang(2, 7, 3, "Aquarius");
        Bintang Cancer = new Bintang(1, 5, 3, "Cancer");
        rasiBintang.addAll(Arrays.asList(Capricorn, Scorpio, Gemini, Sagittarius, Piesces, Leo, Taurus, Libra, virgo, Aries, Aquarius, Cancer));
    }

    public void display(){
        for (int i = 0 ; i < rasiBintang.size() ; i++) {
            System.out.println(rasiBintang.get(i));
        }
    }
}
