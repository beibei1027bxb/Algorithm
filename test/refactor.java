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

    private static List<String> getFilterOutput(String filter, List<String> fruits) {
        List<String> result = new ArrayList<>();
        for (String fruit : fruits) {
            if (!filter.equals(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

    private static synchronized void a (final int a, final int b,final int d) throws Exception{
        @Deprecated final int c = 0;
        System.out.println(a);
    }

}
