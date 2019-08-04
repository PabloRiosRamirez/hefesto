package online.grisk.hefesto.controller.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerUtils {

    /**
     * Validate format document number XXXXXXXX-X
     */
    public static Boolean validateRut(String rut) {
        Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
        Matcher matcher = pattern.matcher(rut);
        if (matcher.matches() == false)
            return false;
        String[] stringRut = rut.split("-");
        return stringRut[1].toLowerCase().equals(validateDv(stringRut[0]));
    }

    /**
     * Validate dv
     */
    private static String validateDv(String rut) {
        Integer M = 0, S = 1, T = Integer.parseInt(rut);
        for (; T != 0; T = (int) Math.floor(T /= 10))
            S = (S + T % 10 * (9 - M++ % 6)) % 11;
        return (S > 0) ? String.valueOf(S - 1) : "k";
    }
}
