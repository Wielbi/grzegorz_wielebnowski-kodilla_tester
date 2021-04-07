package parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import parametrized_tests.UserValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    @ParameterizedTest
    @ValueSource(strings = {"wg.ratownik@gmail.com", "szturmarcel@gmail.com" })
    public void testvalidateEmail(String email){
        UserValidator userValidator = new UserValidator();  // żeby wywołac metode trzeba stworzyc obiekt ( obiektem jest clasa w której znajduje sie metoda testowana) gdzie znajduje sie metoda!!!
        boolean result = userValidator.validateEmail(email);  // jako argument przekazujemy argument metody testowej (email),
        assertTrue(result);

    }
    @ParameterizedTest
    @ValueSource(strings = {"Wielebnowski", "Sztur", "Kowalski"})
    public void validateUsername(String username){
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"wg.ratownik@gmail com", "szturmarcel@gmail@com" })
    public void testvalidateEmail2(String email){
        UserValidator userValidator = new UserValidator();
        boolean ressult = userValidator.validateEmail(email);
        assertFalse(ressult);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Wielebnowski,Jankowski", "", "Kowr alski"})
    public void validateUsername2(String username) {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);

    }
}
