
import java.util.Arrays;

public class Solution {
    public static int tripletSum(int[] A, int sum) {
        Arrays.sort(A);
        int n=A.length;
        int numTriplets=0;

        for(int i=0;i<n;i++){
            int pairSumFor=sum-A[i];
            int numPairs=pairSum(A,(i+1),(n-1),pairSumFor);
            numTriplets+=numPairs;
        }
        return numTriplets;
    }

    private static int pairSum(int[] arr, int SI,int EI, int num){
        int numPair=0;
        while(SI<EI){
            if(arr[SI]+arr[EI]<num){
                SI++;
            }
            else if(arr[SI]+arr[EI]>num){
                EI--;
            }else{
                int elementAtStart = arr[SI];
                int elementAtEnd=arr[EI];
                if(elementAtStart==elementAtEnd){
                    int totalElementsFromStartToEnd = (EI-SI)+1;
                    numPair+=(totalElementsFromStartToEnd*(totalElementsFromStartToEnd-1)/2);
                    return numPair;
                }
                int tempSI = SI+1;
                int tempEI=EI-1;
                while(tempSI<=tempEI && arr[tempSI]==elementAtStart){
                    tempSI+=1;
                }
                while(tempEI>=tempSI && arr[tempEI]==elementAtEnd){
                    tempEI-=1;
                }
                int totalElementsFromStart = (tempSI-SI);
                int totalElementsFromEnd =(EI-tempEI);

                numPair+=(totalElementsFromStart*totalElementsFromEnd);

                SI=tempSI;
                EI=tempEI;
            }
        }
        return numPair;
    }

}