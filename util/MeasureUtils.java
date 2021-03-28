package util;

public class MeasureUtils {
    private long start;
    private long end;

    public void start() {
        start = System.nanoTime();
    }

    public void end() {
        end = System.nanoTime();
    }

    public void print() {
        System.out.println("The algorithm took " + (end - start) + "ns to execute.");
    }
}
