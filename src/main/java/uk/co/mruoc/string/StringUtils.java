package uk.co.mruoc.string;

public class StringUtils {

    public static String extractLastNChars(String value, int n) {
        int length = value.length();
        if (length < n) {
            return value;
        }
        return value.substring(length - n);
    }

}
