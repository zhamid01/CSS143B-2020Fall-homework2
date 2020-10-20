public class Problem1 {

    /*
    I start by assigning an int to the start of the array and the end of the array.
    Then have a value representing the middle. Since the values are represented by 0, 1, 2, I check if the
    value of the array at "middle" is equal to 0, 1, or 2 and assigning to to the start or end of the array
    based on the value. This goes on until the middle value reaches the last value in the array.

    These sites were used as help:
    https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/

    I also watched the video provided by the Professor. That helped me with the logic of meeting in the middle,
    and assigning values to the start, end, and middle.
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
