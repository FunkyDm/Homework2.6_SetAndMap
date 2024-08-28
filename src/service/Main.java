package service;

import model.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        CollectionUtils.printOddNumbers(nums1);

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        CollectionUtils.printOddNumbersWithoutRepeat(nums2);

        List<String> strings3 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        CollectionUtils.printAllDublicates(strings3);

        List<String> strings4 = new ArrayList<>(List.of("один", "два", "три", "два", "четыре", "один", "пять"));
        CollectionUtils.printAllUniqueWords(strings4);
    }
}