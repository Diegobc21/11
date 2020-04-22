package PasswordValidator;

import java.util.*;

public class Validator {

    //Additional method to check if there are digits
    public static boolean is_digit(char l) {
        l = Character.toUpperCase(l);
        return (l >= '0' && l <= '9');
    }

    public static boolean isValid(String password) {
        if (!(password.length() >= 8)) {
            return false;
        }

        if (password.contains(" ")) {
            return false;
        }

        if (true) {
            int c = 0;
            //Checking if there are numbers
            for (int i = 0; i <= 9; i++) {
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    c = 1;
                }
            }
            if (c == 0) {
                return false;
            }
        }

        if (true) {
            int c = 0;
            //Checking digits
            for (int i = 0; i < password.length(); i++) {
                char l = password.charAt(i);

                if (is_digit(l)) {
                    ++c;
                }
            }
            if (c < 2) {
                return false;
            }
        }
        return true;
    }
}

