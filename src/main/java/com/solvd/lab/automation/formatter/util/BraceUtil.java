package com.solvd.lab.automation.formatter.util;

public class BraceUtil {

    public static String normalizeSharpBraces (String input) {
        input = input.replace("{", " {");
        for (int i = 1 ; i < input.length(); i++) {
            if (input.charAt(i) == '{') {
                input = input.subSequence(0, i + 1)+ "\n" + input.subSequence(i + 1, input.length());
            } else if (input.charAt(i) == '}') {
                input = input.subSequence(0, i + 1) + "\n" + input.subSequence(i + 1, input.length());
            }
        }
        return input;
    }

}
