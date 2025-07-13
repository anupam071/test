public class Linearsearch_6 {
    public static int linearsearch(int []aee,int target){
        for(int i=0;i<aee.length;i++){
            if(aee[i]==target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,7,9,61};
        int target=61;
        int res=linearsearch(arr,target);
        if(res!=-1)
            System.out.println("Element found at index : "+res);
        else
            System.out.println("Element not found ");
    }
}
