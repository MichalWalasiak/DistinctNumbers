package Algorythms;

import java.util.List;
import java.util.NoSuchElementException;

public class PrintDistinctNumbers {

    public static void main(String[] args) {
        Service service = new Service();
        int listSize;

        String[] input =  service.getNumbers();
        List<Integer> integers = service.parse(input);
        listSize = integers.size();

        integers = service.sortUnique(integers);

        System.out.println(integers);

        System.out.println("count: " + listSize);
        System.out.println("distinct: " + integers.size());
        System.out.println(integers.stream().mapToInt(i -> i).min().orElseThrow(NoSuchElementException::new));
        System.out.println(integers.stream().mapToInt(i -> i).max().orElseThrow(NoSuchElementException::new));
    }
}
