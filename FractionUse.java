
public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,8);
        f1.print();
       // f1.increment(2);
        f1.print();
        Fraction f2 = new Fraction(4,4);
        Fraction f3 = Fraction.add(f1,f2);
        f3.print();
    }



}
