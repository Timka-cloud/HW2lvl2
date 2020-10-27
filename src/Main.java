public class Main {

    public static void main(String[] args) {

      String[][] array = new String[5][4];
      checkArray(array);
//      checkElementsOfArrayN2(array);
        checkElementsOfArrayN2(array);



    }
    public static void checkElementsOfArrayN3(String[][] array){
        int sum = 0;   // Это третий вариант там показывают все что нужно но где они находиться нетю, Почему????

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "1";
                array[1][0] = "text";
                array[2][0] = "s";

                try {
                    int t = Integer.parseInt (array[i][j]);
                    sum = sum + t;
                } catch (NumberFormatException e) {
                  e.printStackTrace();
                }
            }
        System.out.println("summ is " + sum);
    }


    public static void checkElementsOfArrayN2(String[][] array){
        int sum = 0;                                 // это альтернативный вариант к решению задачи номер 2.
        for (int i = 0; i < array.length; i++) {    // тут все отлично только он показывает самую первую остальные нет, почему????
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "1";
                array[1][0] = "text";
                array[2][0] = "s";
                array[2][1] = "ter";

                try{
                    int t = Integer.parseInt (array[i][j]);
                    sum = sum + t;

                } catch (RuntimeException eq){
                    throw new MyArrayDataException("in elements [" + i + "],[" + j + "] there's no int.", eq );

                }
            }
        }
        System.out.println("The summ is " + sum);
        System.out.println("Some elements in the array can't be converted to int");

    }

    public static void checkElementsOfArray(String[][] array)  { //это первый варинат к задаче номер 2 ну там не выводить где ошибка
       try {
           new StringToInt().StringToInt(array);
       } catch (MyArrayDataException exc) {
           throw  new Unstable("Some elements in the array can't be converted to int", exc);
       }

    }

    public static void checkArray(String[][] array) { // задача номер 1
        try {
            new MyArraySize().doCheck(array);
        } catch (MyArraySizeException ar) {
            System.out.println(ar.getMessage());

        }
    }

}



