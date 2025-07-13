//Linearsearch
public class Main {
    public static int linearsearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if (arr [i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int  arr []={3,5,7,9,11,17,21,87};
        int target=3;
        int result = linearsearch(arr,target);
        if(result != -1)
            System.out.println("element found at index : "+result);
        else{
            System.out.println("Element not found ");
        }
    }
}