package Complex;

public class LiczbaZespolona {
    public double re;
    public double im;
    //LiczbaZespolona c1 = new LiczbaZespolona(1,2);
    public LiczbaZespolona(){
        this.re = re;
        this.im = im;
    }
    public LiczbaZespolona(double re, double im){
        this.re = re;
        this.im = im;
    }
    public LiczbaZespolona suma(LiczbaZespolona c){
        return new LiczbaZespolona(this.re+c.re,this.im+c.im);
    }
    public LiczbaZespolona roznica(LiczbaZespolona c){
        return new LiczbaZespolona(this.re-c.re,this.im-c.im);
    }
    public LiczbaZespolona mnozenie(LiczbaZespolona c){
        return new LiczbaZespolona(this.re * c.re - this.im * c.im, this.re * c.im + this.im * c.re);
    }
    public LiczbaZespolona dzielenie(LiczbaZespolona c){
        double tmp = c.re * c.re + c.im * c.im;
        return new LiczbaZespolona((this.re*c.re+this.im*c.im)/tmp,(this.im*c.re-this.re*c.im)/tmp);
    }
    public double modul(LiczbaZespolona c){
        return Math.sqrt(c.re*c.re+c.im*c.im);
    }
    public String toString(){
         //return "( " + re + "," + im +")";
         return  re + "+" + im +"i";
    }
    public static void main(String [] argv){
        LiczbaZespolona c1 = new LiczbaZespolona(4,7);
        LiczbaZespolona c2 = new LiczbaZespolona(2,3);
        LiczbaZespolona suma = c1.suma(c2);
        LiczbaZespolona roznica = c1.roznica(c2);
        LiczbaZespolona mnozenie = c1.mnozenie(c2);
        LiczbaZespolona dzielenie = c1.dzielenie(c2);
        LiczbaZespolona m = new LiczbaZespolona();
        double modul = m.modul(c1);
        System.out.println(dzielenie); 
    }
 
}