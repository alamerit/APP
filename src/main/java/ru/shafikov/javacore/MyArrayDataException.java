package ru.shafikov.javacore;
/**
 * @ Shafikov Almir
 */
public class MyArrayDataException extends CustomException {

    public MyArrayDataException(int mas, int mas2) {

        super(String.format("Error in array[%d, %d]", mas, mas2));
    }
}
