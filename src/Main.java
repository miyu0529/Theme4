import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("sato", "suzuki", "tanaka", "takahashi", "ito");
        System.out.println(names);

        names.stream().sorted().forEach(System.out::print);
        //List<String> sortedResult = names.stream().sorted().toList();
        //System.out.println(sortedResult);

    }
}