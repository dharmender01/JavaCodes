package Java;

import java.util.Arrays;

public class Main {
    public static int countDigit(int digit){
        int count = 0;
        while(digit != 0){
            count++;
            digit /= 10;

        }
        return count;
    }
    public static double grossPrice(double netPrice, double taxRate){
        return netPrice/(1+taxRate);
    }
    public static int maxNumber(int a, int b){
        return a >= b  ? a : b;
    }
    public static double median(double[] arr){
        if (arr.length == 0) return -1.0;
        double median = 0.0;
        int len = arr.length;
        if (len % 2 == 0){
            median = (arr[len/2-1] + arr[(len/2)])/2;
        }else{
            median = arr[(len)/2];
        }
        return median;
    }
    public static double incomeTax(double salary){
        if(salary <= 250000) return 0.0;
        double incomeTax = 0.0;
        if(salary>250000 && salary <= 500000){
            incomeTax = (salary -250000)*(0.1);
        }
        if(salary>500000 && salary <= 1000000){
            incomeTax =  250000*(0.1) + (salary-500000)*(0.2);
        }
        if(salary>1000000){
            incomeTax =  250000*(0.1) + 250000*(0.2)+(salary-750000)*(0.3);
        }
        return incomeTax;
    }
    public  static int countVowel(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static String strWithMaxVowel(String[] str){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i< str.length; i++){
            int count = countVowel(str[i]) ;
            if(max<count){
                max = count;
                index = i;
            }
        }
        return str[index];
    }
    public static double inflation(int rate, int year){
        int inflation = 0;
        double amount = 100;
        for(int i = 0; i<year; i++){
            amount = amount+ (amount*rate)/100;
        }
        return amount-100;
    }
    public static void daysCalculations(long sec){
        int noOfDays = 0;
        int noOfHour = 0;
        int noOfMin = 0;
        int noOfSec = 0;
        noOfDays = (int)sec/((86400));
        sec = sec%((24*60*60));
        noOfHour = (int)sec/((3600));
        sec = sec%((3600));
        noOfMin = (int) (sec/60);
        noOfSec = (int) (sec%60);
        System.out.println(noOfDays+" Days "+ noOfHour+" hours  "+noOfMin+" min " + noOfSec+" sec ");

    }
    public static boolean perfectNumber(int digit){
        return digit%10 == 9;
    }
    public static int secMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                secMax = max;
                max = arr[i];
            }
            if(arr[i]>secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void countDigitLeftAndRight(double digit){
        int count = 0;
        while(digit % 10.0 != 0.0){
            digit *=10;
            count++;
        }
        int totalDigits = 0;
        int newDigit = (int)digit;
        while(newDigit != 0){
            totalDigits++;
            newDigit /= 10;
        }
        System.out.println("LeftDigits "+ (totalDigits-count));
        System.out.println("RightDigits " + (count-1));

//        String str =String.valueOf(digit);
//        int index = 0;
//        for (int i = 0; i<str.length(); i++){
//            if (str.charAt(i) == '.') {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("LeftDigits "+ index);
//        System.out.println("RightDigits " + (str.length()-index-1));

    }
    
    public static void main(String[] args) {
//        System.out.println(countDigit(234));
//        System.out.println(grossPrice(49999,0.28));
//        System.out.println(maxNumber(4,4));
//        System.out.println(median(new double[] { -957.0, -493.0, -384.0, -268.0, -131.0}));
//        System.out.println(incomeTax(550000));
//        System.out.println(strWithMaxVowel(new String[]{"umbrella", "ant", "ball", "scratch"}));
 //       daysCalculations(353363);
//        System.out.println(perfectNumber(58));
//        System.out.println(secMax(new int[] {4,8,10,5,2,1,7,9,11}));
        System.out.println(inflation(20,5));
        countDigitLeftAndRight(1230.147);

    }
}