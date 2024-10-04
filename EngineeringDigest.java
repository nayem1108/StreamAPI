import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class EngineeringDigest {
    public static void main(String[] args) {
        // List from a array
        List<String> list = Arrays.asList("apple", "mapp;e", "dapple");
        System.out.println(list);

        Stream<String> streamedList = list.stream();

        System.out.println(streamedList);

        // Stream Methods
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 4534, 434, 3453, 236, 456, 2236, 54432, 64);
        System.out.println(numList);
        // Filter
        List<Integer> filteredList = numList.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
