package knu.ac.kr.passwordvalidator;

import jdk.internal.org.objectweb.asm.util.TraceAnnotationVisitor;

public class PasswordValidator {

    private int minLength;
    private int maxLength;

    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validate(String password) {
        boolean checkValidate = true;
        int passwordLength = password.length();

        if (passwordLength < minLength || passwordLength > maxLength || password == "NULL" || password == " ") {
            checkValidate = false;
        } else if (password == "ADMIN") {
            checkValidate = true;
        }
        return checkValidate;
    }
}


