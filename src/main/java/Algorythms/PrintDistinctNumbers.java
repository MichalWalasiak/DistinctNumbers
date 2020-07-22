package Algorythms;

import java.util.List;

public class PrintDistinctNumbers {

    public static void main(String[] args) {
        Service service = new Service();
        int listSize;

        System.out.println("insert numbers separated with comma and press enter when finished");

        String[] input =  service.getNumbers();
        List<Integer> list = service.parse(input);
        service.sort(list);
        listSize = list.size();

        list = service.sortUnique(list);

        System.out.println("Output");
        System.out.println(list);

        System.out.println("count: " + listSize);
        System.out.println("distinct: " + list.size());
        System.out.println("min: " + list.get(0));
        System.out.println("max: " + list.get(list.size() - 1));

    }
}
