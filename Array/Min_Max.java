package Array;

public class Min_Max {

    public static void main(String[] args) {
        System.out.println(MinElement(new int[]{1,2,3,5,7,11,-1,54,6}));
        System.out.println(MaxElement(new int[]{1,2,3,5,7,11,-1,54,6}));
    }
    public static int MinElement(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if (i<min)min = i;
        }
        return min;
    }
    public static int MaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i>max) max = i;
        }
        return max;
    }
}
