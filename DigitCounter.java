
public class DigitCounter {
    public static void main(String[] args)throws java.lang.Exception {
        System.out.println(getDigitCount(04564540));
    }
    private static int getDigitCount(int number) {
        // your code goes here
        int count = 0;
        while(number>0){
            count++;
            number /= 10;
        }
         return count;
    }
    public static double getMax(double a, double b){
        return Math.max(a,b);
    }
    public static double findMedian(final double[] numbers){
        double median = -1;
        if(numbers.length==0) return median;
        if(numbers.length%2 == 0){
            median = (numbers[numbers.length/2]+ numbers[(numbers.length/2)+1])/2;
        }
        else{
            median = numbers[(numbers.length+1)/2];
        }
        return median;
    }
}
