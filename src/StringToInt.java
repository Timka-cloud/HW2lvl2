public class StringToInt {
    public  void StringToInt(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "1";
                array[1][0] = "text";
                array[3][0] = "s";
                int t = Integer.parseInt (array[i][j]);
                sum = sum + t;
                throw new MyArrayDataException(array[i][j]);
            }
        } System.out.println("The summ is " + sum);

    }
}
