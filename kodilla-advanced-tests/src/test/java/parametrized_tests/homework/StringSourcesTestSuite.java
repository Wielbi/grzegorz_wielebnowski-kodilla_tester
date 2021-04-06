package parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import parametrized_tests.StringManipulator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringSourcesTestSuite {


    @ParameterizedTest
    @MethodSource(value = "parametrized_tests.homework.StringSources.provideStringsForTestingLength")
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        StringManipulator manipulator = null;
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }
}
