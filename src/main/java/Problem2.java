public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {

        int tempArray[] = new int[nums.length - 1];
        int placeHolder = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int next = nums[i + 1];
            int holder;

            if (nums.length - 1 == 0) {
                return 1;
            }
            else if (nums[i] == next) {
                tempArray[placeHolder] = nums[i];
                placeHolder++;
            }
            else if (nums[i] != next) {
                tempArray[placeHolder] = nums[i];
                tempArray[placeHolder++] = next;
            }
        }
        return tempArray.length; //PLACE HOLDER
    }
}
