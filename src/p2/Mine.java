package p2;

import java.util.Arrays;

public class Mine
{
    public static void main(String[] mike)
    {
        int[] myhand = {21, 12, 50, 7, 0};
        System.out.println("The largest value in the hand is " + max(myhand));

        // print out hand
        for(int each : myhand)
        {
            System.out.println(each);
        }
    }

    private static int max(int[] hand)
    {
        int guess = hand[0];

        // for each loop
        for(int each : hand)
        {
            if(each > guess)
            {
                guess = each;
            }
        }

        Arrays.sort(hand);

        return guess;
    }
}
