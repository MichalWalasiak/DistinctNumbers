package Algorythms;

import java.util.List;
import java.util.stream.Collectors;

public class SortService {

    public static List<Integer> sortUnique(List<Integer> input) {
        return input.stream().sorted().distinct().collect(Collectors.toList());
    }
}
