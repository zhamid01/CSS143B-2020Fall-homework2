public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int first = 0;
        int middle = 0;
        int holder = 0;
        int last = nums.length - 1;
        while (middle <= last) {
            if (nums[middle] == 0) {
                holder = nums[first];
                nums[first] =  nums[middle];
                nums[middle] = holder;
                first++;
                middle++;
            }
            else if (nums[middle] == 1) {
                middle++;
            }
            else if (nums[middle] == 2) {
                holder = nums[middle];
                nums[middle] = nums[last];
                nums[last] = holder;
                last--;
            }
        }
    }
}
