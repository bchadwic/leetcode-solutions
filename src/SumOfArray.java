/**
 * This class adds all the numbers in an array up to the index
 */

public class SumOfArray {

    public SumOfArray(int[] num){
        System.out.print("Numbers in array:");
        for(int nums : num){
            System.out.print(" "+nums);
        }
        System.out.println();
        int[] newNum = runningSum(num);
        System.out.print("Numbers in new array:");
        for(int nums : newNum){
            System.out.print(" " + nums);
        }
    }

    public int[] runningSum(int[] nums) {
        int newNums[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            newNums[i] = runningSum(nums[i], i,  nums);
        }
        return newNums;
    }

    public int runningSum(int value, int size, int[] nums){
        if(size == 0)
            return value;
        return value + runningSum(nums[size-1], size-1, nums);
    }

}
