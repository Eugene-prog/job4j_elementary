package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = 0; index < postfix.length; index++) {
            if (postfix[postfix.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}