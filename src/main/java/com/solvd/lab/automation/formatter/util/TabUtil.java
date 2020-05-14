package com.solvd.lab.automation.formatter.util;

public class TabUtil {
    public static String normalizeTabs(String input) {

        int openBrace = input.indexOf('{');
        int closeBrace = input.lastIndexOf('}');

        if (openBrace == -1 || closeBrace == -1) {
            return input;
        }

        String temp = input.substring(openBrace, closeBrace + 1);
        String[] stringParts = temp.split("\n");

        for (int i = 0; i < stringParts.length; i++) {
            stringParts[i] = stringParts[i] + "\n";
        }

        String tempString = stringParts[0];

        for (int i = 1; i < stringParts.length - 1; i++) {
            stringParts[i] = "\t" + stringParts[i];
            tempString = tempString.concat(stringParts[i]);
        }

        tempString = tempString.concat(stringParts[stringParts.length - 1]);
        temp = tempString.substring(1, tempString.length() - 2);

        String firstSub = input.substring(0, openBrace + 1);
        String lastSub = input.substring(closeBrace);

        return firstSub + normalizeTabs(temp) + lastSub;
    }

}
