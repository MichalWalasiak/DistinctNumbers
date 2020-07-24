package Algorythms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    @Test
    @DisplayName("should return list that size is equal to number of distinct")
    void sortUnique_returns_listWithDistinctNumbers() {
        // given
        SortService sortService = new SortService();
        List<Integer> integer = new ArrayList<>();
        integer.add(4);
        integer.add(1);
        integer.add(2);
        integer.add(4);
        integer.add(3);

        // when
        integer = sortService.sortUnique(integer);

        // then
        assertEquals(integer.size(), 4);
        assertEquals(integer.get(1), 2);
    }
}