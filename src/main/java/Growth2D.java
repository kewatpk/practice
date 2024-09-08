import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */
    public static long countMax(List<String> upRight) {
        long x = 1;
        long y = 1;

        x = Long.parseLong(upRight.get(1).split(" ")[0]);
        y = Long.parseLong(upRight.get(1).split(" ")[1]);

        for (String s : upRight) {
            if (x > Long.parseLong(s.split(" ")[0]))
                x = Long.parseLong(s.split(" ")[0]);
            if (y > Long.parseLong(s.split(" ")[1]))
                y = Long.parseLong(s.split(" ")[1]);
        }

        return (y * x);
    }

}

public class Growth2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int upRightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> upRight = IntStream.range(0, upRightCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        long result = Result.countMax(upRight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
