//using Two Pointer Approach
import java.util.*;
class NegativeElementstoleft{

    static int[] move(int [] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r ){
            while(l<r && arr[l]<0){
                l++;
            }
            while(l<r && arr[r]>0){
                r--;
            }
            if(l<r){
                int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
            }
        }
        return (arr);
    }

    public static void main(String[] args){
        int [] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] arr2=move(arr);
        System.out.println(Arrays.toString(arr2));
    }
}