
import static java.lang.Math.abs;

public class Project_Euler {
    public static void main(String[] args) {
//      System.out.println(sumOfMultipleOf_3_5(1000));
//      System.out.println(sumOfEvenValueOfFibonacci(0,1));
//      System.out.println(largestPalindromicNo(900,999));
//      System.out.println(smallestNumberEvenlyDivisible_1_20(20));
//      System.out.println(largestPrimeFactor(600851475143L));
//      System.out.println(diffOfSumOf_Square_OfSum(100 ));
//      System.out.println(nthPrimeNumber(10001));
//      System.out.println(pythagoreanTriplet(1000));
//      System.out.println(sumOfAllPrimeUpToN(2000000));
        int[] arr = new int[6];
//        System.out.println(findUnique(arr));
        arr(arr,6);
    }

    public static int sumOfMultipleOf_3_5(int n){
        int sumOfMultiple_3 = 0;
        int sumOfMultiple_5 = 0;
        int sumOfMultiple_3_5 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) sumOfMultiple_3 += i;
            if (i % 5 == 0) sumOfMultiple_5 += i;
            if (i % 3 == 0 && i % 5 == 0) sumOfMultiple_3_5 += i;
        }
         return sumOfMultiple_3+sumOfMultiple_5-sumOfMultiple_3_5;
    }
    public static int sumOfEvenValueOfFibonacci(int first, int second){
        int sum = 0;
       while (sum<4000000){
           int third = first + second;
           if (second % 2 == 0)sum += second;
           first = second;
           second = third;
       }
       return sum;
    }
    public static int reverseDigit(int n){
        int revDigit = 0;
        while(n!=0){
            int rem = n%10;
            revDigit = revDigit*10 + rem;
            n /= 10;
        }
        return revDigit;
    }
    public static boolean primeNumber(long n){
        if(n<=1)return false;
        if (n==2)return true;
        if (n%2==0)return false;
        for (int i = 3; i<=Math.sqrt(n); i=i+2){
            if (n%i==0)return false;
        }
        return true;
    }
    public static boolean primeNumber(int n){
        if(n<=1)return false;
        if (n==2 || n==3)return true;
        if (n%2==0 || n%3==0)return false;
        for (int i = 5; i<=Math.sqrt(n); i=i+6){
            if (n%i==0|| n%(i+2)==0)return false;
        }
        return true;
    }
    public static long largestPrimeFactor(long n){
        long max = 0;
       for (long i = 2; i<Math.sqrt(n); i++){
           if (n%i==0 && primeNumber(i)){
                   max = i;
           }
       }
       return max;
    }
    public static int largestPalindromicNo(int start, int end){
        int largest_No = 0;
        int product = 0;
        for (int i = start; i<=end; i++){
            for (int j = start; j<=end; j++) {
                product =  i * j;
                if(product == reverseDigit(product)){
                    largest_No = product;
                }
            }
        }
        return largest_No;
    }
    public static int smallestNumberEvenlyDivisible_1_20(int end){
        int temp = end +1;
        int count = 0;
        while(true){
            for (int i = 1; i<=20; i++){
                if(temp%i==0){
                    count++;
                }
            }
            if (count==20) break;
            temp++;
            count = 0;
        }
        return temp;
    }
    public static int diffOfSumOf_Square_OfSum(int n){
        int squareSum = 0;
        int sum = 0;
        for (int i = 1; i<=n; i++){
            squareSum += Math.pow(i,2);
            sum += i;
        }
        return (int) (Math.pow(sum,2)-squareSum);
    }
    public static int nthPrimeNumber(int n){
        int i = 2;
        while(n>0){
            if (primeNumber(i++))n--;
        }
        return i-1;
    }
    public static int pythagoreanTriplet(int n){
        int product = 0;
        for (int i = 1; i<=n/3; i++ ){
            for (int j = i+1; j<=n/2; j++){
                int k = n-i-j;
                if (i*i+j*j == k*k) {
                    product = i*j*k;
                    break;
                }
            }
        }
        return product;
    }
    public static long sumOfAllPrimeUpToN(int n){
        long sum = 0;
        for (int i = 2; i<n; i++){
            if (primeNumber(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static int findUnique(int[] arr){
        int element = arr[0];
        for (int i = 0; i<arr.length-1; i++){
              element = element^arr[i+1];
        }
        if (element==0)return element;
        return element;
    }
    public static void pattern(int n){
        for (int i=0; i<n; i++){
            for (int j = 0; j<n; j++ ){
                if((abs(i-n/2)+abs(j-n/2))>=n/2){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern_1(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void arr(int[] arr , int n){
        int m = 1;
        for (int i = 0; i< arr.length/2; i++){
            arr[i] = m;
            m +=2;
        }
        int k = n;
        for (int j = arr.length/2; j<arr.length; j++){
            arr[j] = k;
            k-=2;
        }
        for (int h = 0; h< arr.length; h++){
            System.out.print(arr[h]);
        }
    }
}