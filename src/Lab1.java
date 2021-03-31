import java.util.Arrays;

public class Lab1 {
    /**
     * Sorting algorithms
     **/


    // Insertion sort.
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > x) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = x;
        }
    }


    // Quicksort.
    public static void quickSort(int[] array) {
        if (array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }


    // Quicksort part of an array
    private static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = partition(array, begin, end);
        if (pivot > begin) {
            quickSort(array, begin, pivot - 1);
        }
        if (pivot < end) {
            quickSort(array, pivot + 1, end);
        }
    }


    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        int low = begin + 1;
        int high = end;

        while (true) {
            while (low < array.length && array[low] < array[begin]) {
                low++;
            }
            while (high >= 0 && array[high] > array[begin]) {
                high--;
            }
            if (low > high) {
                swap(array, begin, high);
                break;
            }
            swap(array, low, high);
            low++;
            high--;
        }

        return high;
    }


    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }


    // Mergesort.
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1 ) {
            return array;
        }

        return mergeSort(array, 0, array.length-1);
    }


    // Mergesort part of an array
    private static int[] mergeSort(int[] array, int begin, int end) {
        if (end - begin <= 0) {
            return new int[]{array[begin]};
        }

        int mid = (begin + end) / 2;
        int[] a = mergeSort(array, begin, mid);
        int[] b = mergeSort(array, mid+1, end);

        return merge(a, b);
    }


    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        int n = left.length + right.length;
        int[] output = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                output[k++] = left[i++];
            } else {
                output[k++] = right[j++];
            }
        }
        while (i < left.length) {
            output[k++] = left[i++];
        }
        while (j < right.length) {
            output[k++] = right[j++];
        }

        return output;
    }
}





//                System.out.println("pivot high swapped; " + begin + ", " + high);
//                System.out.println(Arrays.toString(array));


//            System.out.println("low high swapped: " + low + ", " + high);
//            System.out.println(Arrays.toString(array));



//        if (end <= begin) {
//            return array;
//        }
//
//        int mid = (begin + end) / 2;
//
//
//        int n = array.length;
//
//        int[] a = Arrays.copyOfRange(array, begin, (n + 1) / 2);
//        int[] b = Arrays.copyOfRange(array, (n + 1) / 2, end);
//
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//
//        int[] output = merge(a, b);
//
//
//        System.out.println(Arrays.toString(output));
//        return array;







//        int n = array.length;
//        int mid = (n + 1) / 2;
//
//        int[] a = Arrays.copyOfRange(array, 0, mid);
//        int[] b = Arrays.copyOfRange(array, mid, n);
//
//        a = mergeSort(a);
//        b = mergeSort(b);
//
//        return merge(a, b);





//    public static int[] mergeSort(int[] array) {
//
//        if (array.length <= 1 ) {
////            System.out.println("inne i length 1");
//            return array;
//        }
//
//        int n = array.length;
//
//        int mid = (n + 1) / 2;
////        int[] a = new int[n/2];
////
////        int[] b = new int[n-a.length];
////
////        System.arraycopy(array, 0, a, 0, a.length);
////        System.arraycopy(array, a.length, b, 0, b.length);
//
//
//
////        System.out.println("utanför" + Arrays.toString(array) + ", n = " + n);
//        int[] a = Arrays.copyOfRange(array, 0, mid);
//        int[] b = Arrays.copyOfRange(array, mid, n);
//
////        System.out.println("a = " + Arrays.toString(a) + ", b = " + Arrays.toString(b));
////        if (a.length>1) {
////            a = mergeSort(a);
////        }
////        if (b.length>1) {
////            b = mergeSort(b);
////        }
//
//        a = mergeSort(a);
//        b = mergeSort(b);
//
//        return merge(a, b);
////        mergeSort(array, 0, array.length);
////        return array;
//    }



//    private static int[] merge(int[] left, int[] right) {
//
//        int n = left.length + right.length;
//        int[] output = new int[n];
//
//        int i = 0;
//        int j = 0;
//
//        for (int k = 0; k < output.length;k++) {
//            System.out.println("i = " + i + ", j = " + j);
//
//
//            if (j >= right.length || left[i] < right[j]) {
//                System.out.println("två");
//                output[k] = left[i];
//                i++;
//                System.out.println(i);
//                continue;
//            }
//
//            if (i >= left.length || left[i] >= right[j]) {
//                System.out.println("ett");
//                output[k] = right[j];
//                j++;
//                System.out.println(j);
//
//            }
//
//
//        }
//        return output;
//    }