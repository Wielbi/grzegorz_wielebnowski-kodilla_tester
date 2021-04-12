package parametrized_tests.homework;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class GamblingMachine {

    public int howManyWins(Set<Integer> userNumbers) throws InvalidNumbersException {
        validateNumbers(userNumbers);
        Set<Integer> computerNumbers = generateComputerNumbers();
        int count = 0;
        for (Integer number : userNumbers) {
            if (computerNumbers.contains(number)) {
                count++;
            }
        }
        return count;
    }

    private void validateNumbers(Set<Integer> numbers) throws InvalidNumbersException {
        if (numbers.size() != 6) {
            throw new InvalidNumbersException();
        }

        if (numbers.stream().anyMatch(number -> number < 1 || number > 49)) {
            throw new InvalidNumbersException();
        }
    }

    private Set<Integer> generateComputerNumbers() {
        return new HashSet<>(Arrays.asList(1,2,2,2,2,2));
    }
}

