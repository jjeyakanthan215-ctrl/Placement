import java.io.*;
import java.util.*;
import java.util.stream.*;

class BirthdayCandle {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Find the tallest candle
        int maxHeight = Collections.max(candles);

        // Count how many candles have that height
        int count = 0;
        for (int height : candles) {
            if (height == maxHeight) {
                count++;
            }
        }
        return count;
    }
}

public class Solution {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        @SuppressWarnings("unused")
        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = BirthdayCandle.birthdayCakeCandles(candles);

        // Print directly to console (works in VS Code)
        System.out.println(result);

        bufferedReader.close();
    }
}
