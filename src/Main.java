import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 20, 40, 40, 40, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9));
        System.out.println("Task1. Печатаем нечетные числа");
        System.out.println("Нечетные числа = " + ListService.getOddNumbers(nums) + "\n");

        System.out.println("Tsak2. Печатаем отсортированные в порядке возрастания четные числа в ед. экземпляре");
        System.out.println("Четные числа = " + ListService.sortEvenNumbers(nums) + "\n");

        System.out.println("Task3. Печатаем из текста уникальные слова. Убираем non-word символы");
        System.out.println("Уникальные слова = " + ListService.getUniqueWords("tt@@!!! tt fgfdg  fgdg tt tt ppp pppp ppp") + "\n");

        System.out.println("Task4. Печатаем количество вхождений повторяющихся слов");
        System.out.println(ListService.getCountsOfDuplicatesWords("aaa bbb aaa bbb ccc aaa aaa bbb ccc ccc ccc ddd ccc"));
    }
}