package Algorythms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Service {
    Scanner scanner = new Scanner(System.in);

    public List<Integer> sort(List<Integer> input) {
        input.sort(Comparator.naturalOrder());
        return input;
    }

    public List<Integer> sortUnique(List<Integer> input) {
        return input.stream().distinct().collect(Collectors.toList());
    }

    public List<Integer> parse(String[] input){
        return Arrays.stream(input).map(el -> {
            try {
                return Integer.parseInt(el);
            } catch (NumberFormatException e){
                throw new NumberFormatException("wrong format or no number given " + el);
            }
        }).collect(Collectors.toList());
    }

    public String[] getNumbers() {
        String[] input = scanner.nextLine().split(",");
        /*if (input.length == 0){
            throw new Exception("list is empty");
        }*/
        return input;
    }
}
