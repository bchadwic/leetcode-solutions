public class Solution {

    private double startTime;
    private double endTime;

    public static void main(String[] args) {
        int[] arrayTest = {5,2,3,4,2,1,9};
        SmallerNumbersThanCurrent test1 = new SmallerNumbersThanCurrent(arrayTest);
        System.out.println("\n");
        SumOfArray test2 = new SumOfArray(arrayTest);
    }

    public String timeTaken(){
        return "\nTime taken for this test: " + ((endTime - startTime) / 1000000) + "ms";
    }

    public void start(){
        startTime = System.nanoTime();
    }

    public void stop(){
        endTime = System.nanoTime();
    }

}
