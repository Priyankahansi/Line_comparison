package Linecomparison;

public class LineComparision {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 4, y2 = 4,y3=5,x3=5,x4=5,y4=4;
        double lengthOfFirstPoints1, lengthOfFirstPoints2;

        lengthOfFirstPoints1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        lengthOfFirstPoints2 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y4 - y3), 2));
        if (lengthOfFirstPoints1 == lengthOfFirstPoints2)
        {
            System.out.println("Length of both lines are equal" + lengthOfFirstPoints1 + "=" + lengthOfFirstPoints2);
        } else
        {
            System.out.println("length of both lines are not equal");
        }

    }
}

