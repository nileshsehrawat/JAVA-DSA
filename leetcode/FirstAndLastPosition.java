public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println((result[0] + " " + result[1]));
    }

    static int[] searchRange(int[] nums, int target) {
        int answer[] = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        answer[0] = start;
        answer[1] = end;
        return answer;

    }

    public static int search(int[] nums, int target, boolean firstStartingIndex) {
        int answer = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                answer = mid;
                if (firstStartingIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return answer;
    }

}
