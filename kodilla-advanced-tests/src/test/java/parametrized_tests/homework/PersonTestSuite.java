package parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "parametrized_tests.homework.PersonSources#getPersons")
    public void shouldCalculateStringLengthWithoutSpaces(String input, String expected) {
        String[] tab = input.split(" ");
        Person person = new Person(Double.parseDouble(tab[0]), Double.parseDouble(tab[1]));
        assertEquals(expected, person.getBMI());
    }

}
