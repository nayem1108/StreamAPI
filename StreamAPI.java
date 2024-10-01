import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * StreamAPI
 */
public class StreamAPI {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Nayem");
        names.add("Uddin");
        names.add("Fahim");
        names.add("Ahmed");

        // Simple for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

        // enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
        // Iterator
        Iterator<String> ite = names.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println();

        // java 8 lamda funciton
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();

        // With out consumer()
        names.forEach(name -> {
            System.out.println(name);
        });
        System.out.println();

        // With out consumer()
        names.forEach(System.out::println);
        System.out.println();

        // STREAM API

    }
}