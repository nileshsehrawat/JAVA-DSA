public class RotatedSortedArrayDuplicates {
    
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } 
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1; // No rotation found
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {  
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0] && target <= nums[pivot]) {
            return binarySearch(nums, target, 0, pivot) != -1;
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println(search(nums, target));  // Output: true
    }
}
