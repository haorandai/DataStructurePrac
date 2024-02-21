package XOR;

import org.omg.CORBA.INTERNAL;

/**
 * @author: Haoran Dai
 * @email: haorand16@gmail.com
 * @date: 2/20/24 18:17
 * @description: some desc
 */
public class printOddTimes {
    // Only one number in an integer array has an odd number.
    // Find the number of odd number.
    public static void printOddTimesNum1(int[] nums) {
        int EOR = 0;
        for (int num : nums) {
            EOR ^= num;
        }

        System.out.println(EOR);
    }

    // In an integer number, two numbers appear an odd number of times,
    // and the other numbers appear an even number of times.
    // Finding these two numbers requires a time complexity of O(n)
    public static void printOddTimesNum2(int[] arr) {
        int EOR = 0;
        for (int curNum : arr) {
            EOR ^= curNum;
        }

        int rightOne = EOR & (~EOR + 1);

        int onlyOne = 0;
        for (int cur : arr) {
            if ((cur & rightOne) == 0) {
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne + " " + (EOR ^ onlyOne));
    }


}
