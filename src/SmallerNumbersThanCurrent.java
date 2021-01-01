public class SmallerNumbersThanCurrent extends Solution {

    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 2, 3, 2, 6};
        System.out.print("Numbers array: ");
        for (int i : nums)
            System.out.print(i + " ");
        SmallerNumbersThanCurrent test = new SmallerNumbersThanCurrent();
        test.start();
        int[] newNums = test.smallerNumbersThanCurrent(nums);
        test.stop();
        System.out.print("\nCorresponding amount greater than: ");
        for (int i : newNums)
            System.out.print(i + " ");
        System.out.println("\nTime taken for this test is: " + test.timeTaken());
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
