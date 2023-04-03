public class Main {
    public static void main(String[] args) {
        Semesta semesta = new Semesta();
        semesta.generate();

        System.out.println(semesta.findRasiBintang(2, 5, 0));
        System.out.println(semesta.findRasiBintang(2, 5, 9));
        System.out.println(semesta.findRasiBintang(4, 7, 4));
    }
}