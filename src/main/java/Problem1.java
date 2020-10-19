public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int previous;
        int next;
        int holder;

        for (int i = 1; i < nums.length - 1; i++) {
            previous = nums[i - 1];
            next = nums[i + 1];
            if (previous <= nums[i])
            {
                continue;
            }
            else if (next < nums[i])
            {
                holder = nums[i];
                nums[i] = next;
                next = holder;
            }
        }

    }
}
