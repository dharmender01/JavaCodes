
public class ComplexNumberUse {
    public static void main(String[] args) {
        ComplexNumber cp = new ComplexNumber(4,5);
        ComplexNumber cp2 = new ComplexNumber(4,5);
        cp.setImaginary(6);
        cp.print();
        cp.add(cp2);
        cp.print();
    }
}
