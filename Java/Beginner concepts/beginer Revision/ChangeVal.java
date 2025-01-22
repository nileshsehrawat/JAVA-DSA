import java.util.Arrays;

public class ChangeVal {
    public static void main (String[] args){
        int [] arr= {1,5,6,4,2,3};
        change(arr);
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=8;
    }
    static void swap(int[]arr){
        int temp = arr[1];
        arr[1]=arr[2];
        arr[2] = temp;
    }
}