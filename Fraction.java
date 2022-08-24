
public class Fraction {
    int denominator;
    int numerator;

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    private void simplify(){
        int small = Math.min(numerator,denominator);
        int gcd = 1;
        for (int i = 1; i<=small; i++){
            if (numerator%i ==0 && denominator%i==0){
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public void increment(int n){
        numerator = numerator + n*denominator;
        simplify();
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
    public static Fraction add(Fraction f1 , Fraction f2){
        int newNum = f2.numerator* f1.denominator + f2.denominator*f1.numerator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }




}
