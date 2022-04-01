import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class refactor {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana");

        List<String> resultsOfPipeline =
                fruits.stream().filter(fruit -> !"orange".equals(fruit)).collect(Collectors.toList());
        resultsOfPipeline.forEach(System.out::println);
    }

    private static List<String> getFilterOutput(List<String> fruits, @NotNull String filter) {
        List<String> result = new ArrayList<>();
        for (String fruit : fruits) {
            if (!filter.equals(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }
    public static void a(int a){
        System.out.println(a);
    }

}
