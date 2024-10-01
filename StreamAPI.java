import java.util.ArrayList;

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

        // enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}