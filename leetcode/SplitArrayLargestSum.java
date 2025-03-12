public class SplitArrayLargestSum {
    public static void main(String[] args){
        int[] nums ={7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    
    private static int splitArray(int[] nums, int k) {
        int start = nums[0];
        int end = 0;

        for (int num : nums) { // Use enhanced for loop
            start = Math.max(start, num);
            end += num;
        }
        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0;
            int piece = 1;
            for (int num:nums){
                if (sum+num > mid){
                    sum=num;
                    piece++;
                }
                else{
                    sum += num;
                }
            }
            if (piece>k){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
            
}
