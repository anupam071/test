public class Linearsearch_8 {
    public static int linearsearch(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,8,9,10};
        int target=8;
        int res=linearsearch(nums,target);
        if(res!=-1)
            System.out.println("Element found at index : "+res);
        else
            System.out.println("Element not found");

    }
}
