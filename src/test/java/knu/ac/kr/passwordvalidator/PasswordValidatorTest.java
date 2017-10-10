package knu.ac.kr.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void 패스워드최소길이가지정값보다작으면테스트실패(){
        String testPassword = "asd";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void 패스워드최소길이가지정값보다크면테스트성공(){
        String testPassword = "111111";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }

    @Test
    public void 패스워드최대길이가지정값보다크면테스트실패(){
        String testPassword = "asd123asd123";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void 패스워드최대길이가지정값보다작으면테스트성공(){
        String testPassword = "asd123asd";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }

    @Test
    public void 패스워드가NULL이면테스트실패(){
        String testPassword = "NULL";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void 패스워드가공백이면테스트실패(){
        String testPassword = " ";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertFalse(result);
    }

    @Test
    public void 패스워드가ADMIN이면테스트실패(){
        String testPassword = "ADMIN";
        PasswordValidator passwordValidator = new PasswordValidator(5,10);
        boolean result = passwordValidator.validate(testPassword);

        assertTrue(result);
    }
}
