package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    public static double PoleKwad(double r) {
        return Math.pow(r, 2);

    }

    public static double ObKwa(double r) {
        return 4 * r;

    }

    public static double PolPros(double r, double s) {
        return r * s;
    }

    public static double ObPros(double r, double s) {
        return 2 * s + 2 * r;
    }

    public static double PoleWalc(double r, double H) {
        return 2 * Math.PI * Math.pow(r, 2) + 2 * Math.PI * r * H;
    }

    public static double ObjWalc(double r, double H) {
        return Math.PI * Math.pow(r, 2) * H;

    }

    public static double polestozka(double r, double b) {
        return Math.PI * r * (r + b);

    }

    public static double obwodstozka(double r, double h) {
        return 1 / 3 * Math.PI * (2 * r) * h;
    }
}
