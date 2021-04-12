package parametrized_tests.homework;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuite {

    @Test(expected = InvalidNumbersException.class)
    public void testThrowException() throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        gamblingMachine.howManyWins(Set.of(1,2,3,4,5,6,7,8,9));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void testHowManyWins(String input, String expected) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        String[] arr = input.split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String s : arr) {
            numbers.add(Integer.parseInt(s));
        }
        Set<Integer> set = new HashSet<>(numbers);

        assertEquals(Integer.parseInt(expected), gamblingMachine.howManyWins(set));
    }

}
