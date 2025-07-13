public class Linearsearch_1 {
    public static int linearsearch(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,7,8,9,11};
        int target=7;
        int res=linearsearch(arr,target);
        if(res!=-1)
            System.out.println("Element found at index : "+ res);
        else
            System.out.println("Element not found");
    }
}
