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

    private static synchronized int a (final int a, final long w,final int d) throws Exception{
        @Deprecated  long ee = 0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if(ee==0) return 1;
        return 0;
       
    }

}
