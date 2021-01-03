/**
 * iterate through an array and determine how many values in the array are less than the current value,
 * then store the amount of numbers less than the current value into to a new array.
 */

public class SmallerNumbersThanCurrent {

    public SmallerNumbersThanCurrent(int[] num){
        System.out.print("Numbers in array:");
        for(int nums : num){
            System.out.print(" " + nums);
        }
        System.out.println();
        int[] newNum = smallerNumbersThanCurrent(num);
        System.out.print("Numbers in new array:");
        for(int nums : newNum){
            System.out.print(" " + nums);
        }
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newNums = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            newNums[i] = countBiggerThan(i, nums.length-1, nums);
        }
        return newNums;
    }

    public int countBiggerThan(int value, int size, int[] nums){
        if(size == -1)
            return 0;
        if(nums[value] > nums[size])
            return 1 + countBiggerThan(value, size-1, nums);
        else
            return countBiggerThan(value, size-1, nums);
    }
}
