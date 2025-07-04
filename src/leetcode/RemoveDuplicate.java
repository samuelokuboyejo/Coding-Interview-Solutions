package leetcode;


//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
//Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
//Return k.
public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 )
            return 0;

        int i = 0; // Pointer for position of last unique element

        for (int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]) {
                i++;
                i++;  // Move to next position
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
