import java.util.*;

class PrefixSumArray{

    public static ArrayList<Integer> PrefixSum(int[] arr){
        ArrayList<Integer> prefsum=new ArrayList<Integer>();
        prefsum.add(arr[0]);

        for(int i=1;i<arr.length;i++){
            prefsum.add(prefsum.get(i-1)+arr[i]);
        }
        return prefsum;

    }

    public static void main(String[] args){
        int[] arr={3,12,53,9,10};
        ArrayList<Integer> PrefixSumm=PrefixSum(arr);
        for (int i : PrefixSumm) {
            System.out.print(i + " ");
        }
    }
}