import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(1,4,7,5,9,6,8);
        List<Integer> newNumbers = numberList.stream()
                .filter(n-> n % 2 !=0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newNumbers);
    }
}

