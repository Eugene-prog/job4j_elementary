package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            result = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = DummyBot.answer("Hi, Bot.");
        System.out.println(result);
        result = DummyBot.answer("Bye.");
        System.out.println(result);
    }
}