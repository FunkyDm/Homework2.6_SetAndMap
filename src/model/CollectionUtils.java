package model;

import java.util.*;

public class CollectionUtils {

    private CollectionUtils() {
    }

    public static void printOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
    }

    public static void printOddNumbersWithoutRepeat(List<Integer> nums) {
        HashSet<Integer> hashSet = new HashSet<>(nums);
        for (Integer num : hashSet) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
    }

    public static void printAllUniqueWords(List<String> strings) {
        Set<String> uniqueWords = new LinkedHashSet<>();
        Set<String> duplicateWords = new HashSet<>();
        for (String word : strings) {
            if (!uniqueWords.add(word)){
                duplicateWords.add(word);
            }
        }
        uniqueWords.removeAll(duplicateWords);
        System.out.println(uniqueWords);
    }

    public static void printAllDublicates(List<String> strings) {
        HashMap<String, Integer> resultMap = new HashMap<>();
        for (String element : strings) {
            if (resultMap.containsKey(element)) {
                resultMap.put(element, resultMap.get(element) + 1);
            } else {
                resultMap.put(element, 1);
            }
        }
        System.out.println(resultMap);
    }
}