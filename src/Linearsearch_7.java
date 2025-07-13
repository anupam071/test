public class Linearsearch_7 {
    public static int linearsearch(int [] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;

        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={20,21,55,88,98};
        int target=55;
        int result=linearsearch(arr,target);
        if(result!=-1)
            System.out.println("Element found at index : "+result);
        else
            System.out.println("Element not found");
    }
}
