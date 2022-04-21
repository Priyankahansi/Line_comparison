package Linecomparison;

public class LineComparision {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 4, y2 = 4;
        double lengthOfFirstPoints;
        lengthOfFirstPoints = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length of line==> " + lengthOfFirstPoints);
    }
}
