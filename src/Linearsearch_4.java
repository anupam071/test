import java.util.Scanner;

public class Linearsearch_4 {
    public static int linearesearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,7,8,9,14,15};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target element to find its index : ");
        int target=sc.nextInt();
//        int target=1;
        int res=linearesearch(arr,target);
        if(res!=-1)
            System.out.println("Element found at index : "+ res);
        else
            System.out.println("Element not found");
    }
}
