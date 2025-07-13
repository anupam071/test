public class Linearsearch_10 {
    public static int linearsearch(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7,8};
        int target=3;
        int res=linearsearch(arr,target);
        if(res!=-1)
            System.out.println("Element found at index at index : "+ res);
        else
            System.out.println("Element not found ");
    }
}
