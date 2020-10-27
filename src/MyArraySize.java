public class MyArraySize {
    public boolean doCheck(String[][] array) throws MyArraySizeException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[i].length != 4) {
                    throw new MyArraySizeException("Array size is wrong");
                }
            }
        }

        return true;

    }
}
