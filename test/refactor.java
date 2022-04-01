import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class refactor {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana");

        // method one 使用循环
        List<String> resultsOfLoop = getFilterOutput(fruits, "orange");
        for (String result : resultsOfLoop) {
            System.out.println(result);
        }
    }

    private static List<String> getFilterOutput(List<String> fruits, @NotNull  String filter) {
        List<String> result = new ArrayList<>();
        for (String fruit : fruits) {
            if (!filter.equals(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

}
