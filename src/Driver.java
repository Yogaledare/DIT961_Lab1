import java.util.Arrays;

public class Driver {


    public static void main(String[] args) {
        new Driver().program();
    }


    public void program() {

//        int[] array = {5,9,4,3,6,4,3,6,4,7,8,9,1,3,5};
        int[] index = {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4};
        int[] array = {5,6,4,8,3,4,6, 7, 9};

//        Lab1.insertionSort(array);
//        System.out.println(Arrays.toString(array));


//        System.out.println("start");
//        System.out.println(Arrays.toString(index));
//        System.out.println(Arrays.toString(array));
//        Lab1.quickSort(array);
//        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(Lab1.mergeSort(array)));

    }


}
