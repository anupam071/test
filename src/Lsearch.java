import java.util.Scanner;
public class Lsearch {
    public static int linearsearch(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size=sc.nextInt();
        int [] arr =new int[size];
        System.out.println("Enter"+size+ "Element");
        for(int i=0;i<size;i++){
            System.out.println("Element" + (i+1)+": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The element of the array are ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("Enter the target to find its index");
        int target=sc.nextInt();
        int result = linearsearch(arr,target);
        if(result != -1)
            System.out.println("element found at index : "+result);
        else{
            System.out.println("Element not found ");
        }

sc.close();
    }
}
