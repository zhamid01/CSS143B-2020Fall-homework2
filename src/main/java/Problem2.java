public class Problem2 {

    /*
    Here I start by checking if there is an array with one value and returning that.
    Then I continue to check through the array to see if one value is not equal to the next, then
    setting that value in the temporary array. Then assigning the values of the temporary array to the original array,
    and returning the value of the placeHolder int as that was used to keep track of the values in stored in the arrays.

    These sites were used as help:
    https://www.geeksforgeeks.org/remove-duplicates-sorted-array/
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
