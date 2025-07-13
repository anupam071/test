package array;

import java.util.Arrays;

public class Test1 {
    public static int [] returnIndex(int arr[]) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                count++;
            }
        }
        int indexArray[] = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
            indexArray[j] = i;
            j++;
        }
    }
    return indexArray;
}
    public static void main(String[] args) {
        int arr[]={10,20,1,4,5,14};
        int indexArray[] = Test1.returnIndex(arr); // fixed class name
        System.out.println(Arrays.toString(indexArray));
    }
}
