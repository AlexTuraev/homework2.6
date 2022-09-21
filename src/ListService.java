import java.util.*;

public class ListService {
    public static List <Integer> getOddNumbers(List<Integer> nums) {
        List <Integer> resultNumbers = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                resultNumbers.add(num);
            }
        }
        return resultNumbers;
    }

    public static List <Integer> sortEvenNumbers(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        set.addAll(nums);

        nums = new ArrayList<>();
        nums.addAll(set);
        Collections.sort(nums);

        List <Integer> resultNumbers = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                resultNumbers.add(num);
            }
        }
        return resultNumbers;
    }

    public static List <String> getUniqueWords(String text){
        List <String> listWords = new ArrayList<>();
        String[] s = text.split("\\s+");
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].replaceAll("\\W+", "");
        }

        Set <String> setStrings = new HashSet<>();
        setStrings.addAll( new ArrayList<>(List.of(s)) );

        listWords.addAll(setStrings);

        return listWords;
    }

    public static List <Integer> getCountsOfDuplicatesWords(String text) {
        List <String> words = new ArrayList<>(List.of(text.split("\\s+")));
        Map <String, Integer> mapStrings = new HashMap<>();

        for (String word : words) {
            if (mapStrings.containsKey(word)) {
                mapStrings.put(word, mapStrings.get(word)+1);
            }else {
                mapStrings.put(word, 1);
            }
        }

        List <Integer> nums = new ArrayList<>();
        for (int value : mapStrings.values()) {
            if (value > 1) {
                nums.add(value);
            }
        }

        return nums;
    }
}
