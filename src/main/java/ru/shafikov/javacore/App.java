package ru.shafikov.javacore;

/**
 * @ Shafikov Almir
 */
public class App {
    public static void main(String[] args) {
        String[][] notDefect = {
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"},
            {"1", "1", "1", "1"},
            {"1", "1" ,"1", "1"}
    };
        String[][] notNamber = {
                {"a", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
    };
        String[][] notFour = {
                {"5", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1"}
    };

        try {
            System.out.println(Converter.strokConverter(notDefect));
        } catch (CustomException e) {
           System.err.println( e.getMessage());
        }


        try {
            System.out.println(Converter.strokConverter(notNamber));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strokConverter(notFour));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
