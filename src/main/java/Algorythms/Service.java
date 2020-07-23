package Algorythms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Service {
    Scanner scanner = new Scanner(System.in);

    public List<Integer> sortUnique(List<Integer> input) {
        return input.stream().sorted().distinct().collect(Collectors.toList());
    }

    public List<Integer> parse(String[] input){
        return Arrays.stream(input)
                .map(Integer::parseInt).collect(Collectors.toList());
    }

    public String[] getNumbers() {
        return scanner.nextLine().split(" ");
    }
}
