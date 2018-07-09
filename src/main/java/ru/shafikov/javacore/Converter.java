package ru.shafikov.javacore;
/**
 * @ Shafikov Almir
 */
public class Converter {
    public static int strokConverter(String[][] strArray)
            throws ArraySizeException, MyArrayDataException {

        int summa = 0;

        if (4 != strArray.length) throw new ArraySizeException();

        for (int i = 0; i < strArray.length; i++) {

            if (4 != strArray[i].length) throw new ArraySizeException();

            for (int j = 0; j < strArray[i].length; j++) {

                try {
                    summa += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return summa;
    }

}
