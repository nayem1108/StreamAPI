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
        // filter provided a same or less length of previous list
        List<Integer> filteredList = numList.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

        // map provided a same length of previous list
        // map used to modify the list
        List<Integer> mappedList = numList.stream().map(a -> a * 2).collect(Collectors.toList());
        System.out.println(mappedList);

        // distinct method returns all duplicate value onece and others it reduces the
        // size if ducplicacy found
        List<Integer> distinctList = numList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
    }
}
