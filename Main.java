
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[]={-4,2,4,1,11,3,0};
//        System.out.println(fabb(20));
        System.out.println(secondMaxDiff(arr,5));
        String str = "aabbhdssrfff";
        System.out.println(compressString(str));
        int[] arr1 = new int[]{4,8,5,7,9,2};
        int[] output = new int[7];
        int[][] arrt = new int[4][4];
        System.out.println(arrt);
        System.out.println("BDCHE".compareTo("BCDEF"));
        System.out.println(checkPalindrome("dhph"));
        String s = new String("hh");
        String r = "hh";
        System.out.println(r.equals(s));
        int a = 511709;
        int sum = 0;
        while (a!=0){
            int x = a%10;
            sum += x;
            a = a/100;
        }
        System.out.println(sum+ "sum");

//        System.out.println(secondLargest(arr));
//        int[] ans = sumOfTwoArray(arr,arr1,output);
//        for (int i = 0; i< ans.length; i++){
//            System.out.print(ans[i]+" ");
//        }
//     Br
//        int sum = 1;
//        for (int i = 0; i< arr.length; i++){
//            for (int j = i; j< arr.length; j++){
//             int sumSOFar = 1;
//                for (int k = i; k<=j; k++) {
//                    sumSOFar *= arr[k];
//                }
//                sum = Math.max(sum,sumSOFar);
//            }
//        }
//        System.out.println(sum);
//        int maxSum = Integer.MIN_VALUE;
//        int sum = 0;
//        for (int i : arr) {
//            sum = Math.max(sum, 0) + i;
//            maxSum = Math.max(maxSum, sum);
//        }
//        System.out.println(maxSum);
    }
    public static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            }
            if (j < largest && secondLargest < j) {
                secondLargest = j;
            }

        }
        return secondLargest;
    }
    public static int[] sumOfTwoArray(int[] arr1,int[] arr2, int[] output){
        int carry = 0;
        int n = arr1.length-1;
        int m = arr2.length-1;
        int k = output.length-1;
        while (k>=0){
            int d = carry;
            if(n>=0) d+= arr1[n];
            if (m>=0) d+= arr2[m];
            carry= d/10;
            d = d%10;
            output[k] = d;
            k--;
            n--;
            m--;
        }
        Arrays.sort(output);
        return output;
    }
    public static void reverse(int[] arr,int si,int ei){
        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void rotate(int[] nums,int k){
        reverse(nums,0,k);
        reverse(nums,k+1, nums.length-1);
        reverse(nums,0, nums.length-1);
    }
    public static int chocolateDistribution(int[] arr,int m){
        Arrays.sort(arr);
        int minDiff = Integer.MIN_VALUE;
        for (int i=0;i<arr.length-m-1; i++){
//            if(arr[m]-arr[i]<)
        }
        return 0;
    }
    public static String reverseString(String str){
        String s = "";
        for (int i = 0; i<str.length(); i++){
            s = str.charAt(i)+ s;
        }
        return s;
    }
    public static boolean checkPalindrome(String str){
        int si = 0;
        int ei = str.length()-1;
        boolean flag = true;
        while (si<ei){
            if(str.charAt(si++) != str.charAt(ei--)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public  static int[] secondMaxDiff(int[] nums,int target){
        if(nums.length == 0) return null;
        int[] arr = new int[2];
        Arrays.sort(nums);
        int j = nums.length-1;
        int i = 0;
        while(i<j){
            if(nums[i]+nums[j]> target){
                j--;
            }
            else if ((nums[i]+nums[j])<target) {
                i++;
            }
            else{
                arr[0] = i;
                arr[1] = j;
                break;
            }

        }
        return arr;
    }
    public static int fabb(int n){
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=1;
        int sum=0;
        int i=2;
        while(arr[i]<=n){
            arr[i]=  (arr[i-1] + arr[i-2]);
            if(arr[i]==n) return n;
            i++;
        }
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static boolean checkPermutation(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        boolean isPermutation = true;
        char[] str_1 = new char[str1.length()];
        char[] str_2 = new char[str2.length()];
        for (int i = 0; i<str1.length(); i++){
            str_1[i] = str1.charAt(i);
            str_2[i] = str2.charAt(i);
        }
        Arrays.sort(str_1);
        Arrays.sort(str_2);
        for (int k = 0; k<str_1.length; k++){
            if(str_1[k] != str_2[k]) return false;
        }
        return isPermutation;
    }
    public static String compressString(String str){
        String s = "";
        int count = 0;
        char ch =  str.charAt(0);
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ch ){
                ch = str.charAt(i);
                count++;
            }
            else{
               if(count != 1){
                   s = s+ch +""+count;
               }else{
                   s = s + ch;
               }
               count = 1;
            }
            ch = str.charAt(i);
        }
        if(count !=1){
            s = s + ch + count;
        }else{
            s = s+ch;
        }
        return s;
    }
}
