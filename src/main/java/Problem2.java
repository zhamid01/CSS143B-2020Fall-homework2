public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums.length - 1 == 0) {
                return 1;
            }

        }
        return nums.length; //PLACE HOLDER
    }
}
