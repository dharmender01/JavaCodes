
public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }
   public void add(ComplexNumber cp2){
       this.real = this.real + cp2.real;
       this.imaginary = this.imaginary +cp2.imaginary;
   }
   public void product(ComplexNumber cp2){
        int temp = this.real;
        this.real = (this.real* cp2.real)-(this.imaginary* cp2.imaginary);
        this.imaginary = (temp*cp2.imaginary)+(this.imaginary*cp2.real);

   }
   public void print(){
       System.out.println(this.real+"+"+this.imaginary+"i");
   }
}
