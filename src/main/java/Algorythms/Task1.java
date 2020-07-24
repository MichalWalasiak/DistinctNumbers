package Algorythms;

import java.util.List;
import java.util.NoSuchElementException;

public class Task1 {

    public static void main(String[] args) {
        NumbersService numbersService = new NumbersService();
        SortService sortService = new SortService();
        int listSize;

        List<Integer> integers =  numbersService.getNumbersAndParseToInteger();
        listSize = integers.size();

        integers = sortService.sortUnique(integers);

        System.out.println(integers);

        System.out.println("count: " + listSize);
        System.out.println("distinct: " + integers.size());
        System.out.println("min: " + integers.stream().mapToInt(i -> i).min().orElseThrow(NoSuchElementException::new));
        System.out.println("max: " + integers.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new));
    }
}
