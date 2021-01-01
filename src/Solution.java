public class Solution {

    private double startTime;
    private double endTime;

    public String timeTaken(){
        return "Time taken for this test: " + (int)(endTime - startTime) + "ms";
    }

    public void start(){
        startTime = System.nanoTime();
    }

    public void stop(){
        endTime = System.nanoTime();
    }

}
