package Algorythms;

import java.util.List;
import java.util.NoSuchElementException;

import static Algorythms.SortService.sortUnique;

public class PrintDistinctNumbers {

    public static void main(String[] args) {
        NumbersService numbersService = new NumbersService();
        int listSize;

        List<Integer> integers =  numbersService.getNumbersAndParseToInteger();
        listSize = integers.size();

        integers = sortUnique(integers);

        System.out.println(integers);

        System.out.println("count: " + listSize);
        System.out.println("distinct: " + integers.size());
        System.out.println("min: " + integers.stream().mapToInt(i -> i).min().orElseThrow(NoSuchElementException::new));
        System.out.println("max: " + integers.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new));
    }
}
