public class Linearsearch_2 {
    public static int lsearch(int[]arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,5,8,9,10,11};
        int target=4;
        int res=lsearch(nums,target);
            if(res!=-1)
                System.out.println("Element found at index at index : "+res);
            else
                System.out.println("Element not found");
        }

}

