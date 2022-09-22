import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HW {


    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("white", "red", "blue", "red", "green", "blue", "blue"));
        getOddNum(nums);
        getEvenNumWithSorted(nums);
        getUnicString(words);
        System.out.println(getCountOfDuplicates(words));

    }

    //Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    public static void getOddNum(List<Integer> arr) {
        arr.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
        System.out.println("\n");
    }

    //Напишите код, с помощью которого можно напечатать только четные числа
    // без повторений в порядке возрастания.
    public static void getEvenNumWithSorted(List<Integer> arr) {
        TreeSet<Integer> sorted = arr.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(TreeSet::new));
        sorted.forEach(System.out::println);
    }

    //Напишите код, который выводит в консоль все уникальные слова
    // из списка слов, в котором могут встречаться дубли.
    public static void getUnicString(List<String> arr) {
        TreeSet<String> sorted = new TreeSet<>(arr);
        sorted.forEach(System.out::println);
    }

    //Напишите код, который выводит в консоль все количество дублей из списка слов.
    public static Map<String, Long> getCountOfDuplicates(List<String> arr) {
        return arr.stream()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));
    }
}
