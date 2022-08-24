
public class Interview3{
    public  static void Q1(int n){
        String str = "";
        int i = 1;
        while(n!=0){
            int digit = (n%10)*i;
            if(digit == 0){
                n/=10;

            }else {
                n/= 10;
                str = digit+"+"+str;

            }
            i*=10;
        }
        System.out.println(str.substring(0,str.length()-1));
    }
    public static int strToInt(String str){
        int digit = 0;
        for (int i= 0; i<str.length(); i++){
            digit = digit*10 + (str.charAt(i)-'0');
        }
        return digit;
    }
    public static int noOfWeek(String str1,String str2){
        String[] dateOne = str1.split("/");
        String[] dateTwo = str2.split("/");
        for (int i=0; i<dateOne.length; i++){
            System.out.println(dateOne[i]);
        }
        int d1 = strToInt(dateOne[0]);
        int m1 = strToInt(dateOne[1]);
        int y1 = strToInt(dateOne[2]);
        int d2 = strToInt(dateTwo[0]);
        int m2 = strToInt(dateTwo[1]);
        int y2 = strToInt(dateTwo[2]);
        System.out.println(d1+"+"+m1+"+"+y1+"+"+d2+"+"+m2+"+"+y2);
        int days1 = (12-m1)*30-d1;
        int days2 = m2*30+d2;
        int yDiff = Math.abs(y2-y1);
        int weeks = 0;
        if (yDiff==0 || yDiff==1){
            weeks = (days1+days2)/7;
        }else {
            weeks = ((days1+days2)+(yDiff-1)*365)/7;
        }
        return weeks;

    }

    public static void main(String[] args) {
        System.out.println(noOfWeek("03/07/2021","04/10/2022"));
    }

}
