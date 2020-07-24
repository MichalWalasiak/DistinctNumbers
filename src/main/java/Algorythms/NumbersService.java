package Algorythms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumbersService {
    Scanner scanner = new Scanner(System.in);

    public List<Integer> getNumbers() {
        String[] input =  scanner.nextLine().split(" ");
        return Arrays.stream(input)
                .map(Integer::parseInt).collect(Collectors.toList());
    }
}
