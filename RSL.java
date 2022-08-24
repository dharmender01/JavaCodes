
import java.util.*;

public class RSL {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void nearestPrime(int n) {
        if (isPrime(n)) {
            System.out.println(n);
            return;
        }
        int i = 1;
        boolean found = false;
        while (!found) {
            if (isPrime(n - i)) {
                found = true;
                System.out.println(n - 1);
            }
            if (isPrime(n + i)) {
                found = true;
                System.out.println(n + 1);
            }
            i++;
        }
    }

    public static boolean anagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i);
            arr2[i] = str2.charAt(i);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] != arr2[j]) return false;
        }
        return true;
    }

    public static int calculateAngle(int hour, int minute) {
        if (hour > 12 || minute > 60 || hour < 0 || minute < 0) return -1;
        if (hour == 0) {
            if (minute == 60) {
                minute = 0;
                hour += 1;
                if (hour > 12) {
                    hour = hour - 12;
                }
            }
        }
        int hour_angle = (int) (0.5 * (hour * 60 + minute));
        int minute_angle = minute * 6;
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360 - angle, angle);
        return angle;
    }

    public static boolean anagram(char[] str1, char[] str2) {
        int no_of_char = 256;
        int[] count = new int[no_of_char];
        if (str1.length != str2.length) return false;
        for (int i = 0; i < str1.length; i++) {
            count[str1[i]]++;
            count[str2[i]]--;
        }
        for (int j = 0; j < no_of_char; j++) {
            if (count[j] != 0) return false;
        }
        return true;
    }

    public static int firstNonRepeating(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
//            map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);
        }
        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public static String replaceWithGivenChar(String str) {
        String s = "%?";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                String firstPart = "";
                String lastPart = "";
                for (int j = 0; j < i; j++) {
                    firstPart += str.charAt(j);
                }
                for (int j = i + 1; j < str.length(); j++) {
                    lastPart += str.charAt(j);
                }
                str = firstPart + s + lastPart;
            }
        }
        return str;
    }

    public int stockBuyAndSell(int[] arr) {
        int max = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (max < arr[i] - min) max = arr[i] - min;
        }
        return max;
    }

    public static void drawPattern(int n) {
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int strToInt(String str) {

        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + (str.charAt(i) - '0');
        }
        return number;
    }

    // {39,38,38,35,32,30,27,20}   marks: 36   ans :3
    public static int assignRank(int[] arr, int n) {
        int rank = 1;
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) return rank;
            if (arr[i] != last) rank++;
            last = arr[i];
        }
        return rank;
    }

    public static int rankUsingSet(int[] arr, int marks) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (i > marks) set.add(i);
        }
        return set.size() + 1;
    }

    public static void primeNumberUpToN(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        }
        return profit;
    }

    public static int minimumStepsClock(String start, String end) {
        String[] startTime = start.split(":");
        String[] endTime = end.split(":");
        int startHour = strToInt(startTime[0]);
        int startmin = strToInt(startTime[1]);
        int endHour = strToInt(endTime[0]);
        int endmin = strToInt(endTime[1]);
        int min = Math.min(Math.abs(endHour - startHour), 24 - endHour + startHour) +
                Math.min(Math.abs(endmin - startmin), 60 - endmin + startmin);
        return min;

    }

    public boolean twoNoEqualWithout(int a, int b) {
        return (a ^ b) == 0;
    }

    public boolean powerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }

    public static  void incDecOrSpecific(int n) {
        boolean inc = true;
        boolean dec = true;
        while (n/10 != 0) {
            if (n % 10 > (n / 10) % 10) dec = false;
            if (n % 10 < (n / 10) % 10) inc = false;
            n = n/10;
        }
        if (!inc && !dec) System.out.println("notspecific");
        if (dec) System.out.println("dec");
        if (inc) System.out.println("inc");
    }

    public boolean laepYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static int secMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int minElement = arr[0];
        for (int i = 1; i<arr.length; i++){
            int diff = Math.abs(arr[i]-minElement);
            if (arr[i]<minElement) minElement = arr[i];
            if (diff>max){
                secMax = max;
                max = diff;
            } else if (diff>secMax && diff != max) {
                secMax = diff;
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        //  System.out.println(assignRank(new int[]{39,38,38,36,35},38));
//        System.out.println(calculateAngle(9,60));
//        System.out.println(firstNonRepeating("asdfjdsagfh"));
////        nearestPrime(30);
//        System.out.println(replaceWithGivenChar("my name is dharmender"));
//        drowPattern(4);
       // System.out.println(rankUsingSet(new int[]{39, 38, 38, 35, 32, 30, 27, 20}, 37));
        incDecOrSpecific(123456);
        System.out.println(strToInt("03"));
//        System.out.println(minimumStepsClock("19:15","20:58"));
    }
}
