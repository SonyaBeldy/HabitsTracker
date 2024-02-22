package ru.sonyabeldy.habitstraker.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SleepTextParser {

    public int[] parse(String string) {

        int[] data = new int[3];

        return null;
    }
    /**
     * Find staying awake percent in given text.
     *
     * @param  string
     *         Text to parse
     *
     * @return Staying awake percent if exist else -1
     */
    public int parseStayingAwakePercent(String string) {
        Pattern pattern = Pattern.compile("Бодр.*?(\\d{1,3})%");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }

    /**
     * Find physical recovery percent in given text.
     *
     * @param  string
     *         Text to parse
     *
     * @return Physical recovery percent if exist else -1
     */
    public int parsePhysicalRecoveryPercent(String string) {
        Pattern pattern = Pattern.compile("Физич.*?(\\d{1,3})%");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }

    /**
     * Find mental recovery percent in given text.
     *
     * @param  string
     *         Text to parse
     *
     * @return Mental recovery percent if exist else -1
     */
    public int parseMentalRecoveryPercent(String string) {
        Pattern pattern = Pattern.compile("Психич.*?(\\d{1,3})%");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }

}
