package com.solvd.lab.automation.formatter.util;

import static java.lang.Character.isWhitespace;

public class SpaceUtil {
    public static String normalizeSpaces (String input) {
        for(int i = 0; i < input.length() - 1; i++) {
            if (isWhitespace(input.charAt(i)) && isWhitespace(input.charAt(i + 1))) {
                input = input.subSequence(0, i) + "" + input.subSequence(i + 1, input.length());
            }
        }
        return input;
    }
}
