import java.util.Arrays;
import java.util.Collections;

/**
 * Created by BSoptei on 2/17/2017.
 */
public class FinalExamTask {

    // Create a function that takes a list of numbers and returns the second biggest element from it

    public static void main(String[] args) {
        Integer[] testNumbers = {77, -888, 6, 12, 0, 63};
        System.out.println(secondBiggest(testNumbers));
        System.out.println(secondBiggestWithLoop(testNumbers));
    }

    public static Integer secondBiggest(Integer[] numbers) {
        Arrays.sort(numbers, Collections.reverseOrder());
        return (numbers.length > 1) ? numbers[1] : null;
    }

    public static Integer secondBiggestWithLoop(Integer[] numbers) {
        int biggest = Integer.MIN_VALUE; // -2147483648
        int secondBiggest = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > biggest) {
                secondBiggest = biggest;
                biggest = number;
            } else if (number > secondBiggest) {
                secondBiggest = number;
            }
        }
        return secondBiggest;
    }

}
