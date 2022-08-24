
public class RSL_Practice {
    public static int strToInt(String str){
        if (str.length()==0) return -1;
        int digit = 0;
        for (int i = 0; i< str.length(); i++){
            digit = digit*10 + (str.charAt(i)-'0');
        }
        return digit;
    }
    public static boolean powerOfTow(int n){
        if (n<2) return false;
        return ((n&n-1)==0);
    }
    public static int binaryStringToDecimal(String str){
        if (str.length() ==0) return 0;
        int decimal = 0;
        int j = 0;
        for (int i = str.length()-1; i>=0; i--){
           int  digit = str.charAt(i)-'0';
            decimal += (int)(digit*Math.pow(2,j++));
        }
        return decimal;
    }
    public static int binaryStringTODecimalRecursive(String str ,int n){
        if (str.length()==0) return 0;
        int decimal = (int)((str.charAt(str.length()-1)-'0')*Math.pow(2,n));
        return decimal + binaryStringTODecimalRecursive(str.substring(0,str.length()-1),n+1);
    }
    public static void main(String[] args) {
        System.out.println(strToInt("46562"));
        System.out.println(powerOfTow(16));
        System.out.println(binaryStringTODecimalRecursive("10000",0));
    }
}
