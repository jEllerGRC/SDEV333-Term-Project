/**
 * This is a test class for the methods found in the LinkedBag class.
 * @author Jared Eller
 * @verison 1.0
 * @date 2/20/24
 */

import java.util.Scanner;

public class Stats
{
    public static void main(String[] args)
    {
        Bag<Double> numbers = new LinkedBag<>();
        Scanner in = new Scanner("100 99 101 120 98 107 109 81 101 90");
        while(in.hasNextDouble())
        {
            numbers.add(in.nextDouble());
        }

        int size = numbers.size();

        double sum = 0.0;
        for (double x : numbers)
        {
            sum += x;
        }
        double mean = sum / size;

        sum = 0.0;
        for (double x : numbers)
        {
            sum += (x - mean) * (x - mean);
        }
        double stanDev = Math.sqrt(sum / (size - 1));

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Standard Deviation: %.2f\n", stanDev);
    }
}
