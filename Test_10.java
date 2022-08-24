

public class Test_10 {
    public static String MNEncounter(String str){
        String s = "";
        for(int i = 0; i<str.length(); i++){
            if (i==0 && str.charAt(i)=='M'){
                str = str.substring(1);
            }
            if (str.charAt(i)=='N'){

            }
        }
        return "h";
    }
    public static String compressString(String str){
        char temp =str.charAt(0);
        int count =0;
        String Str = "";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == temp) {
                temp = str.charAt(i);
                count++;
            }else {
                if (count!=1)
                    Str+= count + ""+temp;
                else Str+=temp;
                count=1;
            }
            temp = str.charAt(i);
        }
        if (count!=1)
            Str+= count+""+temp;
        else Str+=temp;
        return Str;

    }
    public static void main(String[] args) {
        System.out.println( compressString("aaabbbdddgg"));
    }
}
