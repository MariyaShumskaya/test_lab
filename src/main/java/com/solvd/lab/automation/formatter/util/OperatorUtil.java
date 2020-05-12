package com.solvd.lab.automation.formatter.util;

public class OperatorUtil {

    public static String normalizePlus (String input) {
        input = input.replace("+", " + ");
        return input;
    }

    public static String normalizeMinus (String input) {
        input = input.replace("-", " - ");
        return input;
    }

    public static String normalizeDivide (String input) {
        input = input.replace("/", " / ");
        return input;
    }

    public static String normalizeEq (String input) {
        input = input.replace("=", " = ");
        return input;
    }

    public static String normalizeMultiply (String input) {
        input = input.replace("*", " * ");
        return input;
    }
}
