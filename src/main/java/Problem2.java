public class Problem2 {
    //https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        if (nums.length - 1 == 0) {
            return 1;
        }
        int tempArray[] = new int[nums.length];
        int placeHolder = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int holder;

             if (nums[i] != nums[i + 1]) {
                 tempArray[placeHolder++] = nums[i];
             }
        }
        tempArray[placeHolder++] = nums[nums.length - 1];
        for (int i = 0; i < placeHolder; i++)
            nums[i] = tempArray[i];
        return placeHolder;
    }
}
