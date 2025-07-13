public class Linaersearch_5 {
    public static int linaersearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
            }
        return -1;
        }

    public static void main(String[] args) {
        int [] arr={10,11,45,50,54,55,84,99};
        int target=84;
        int res=linaersearch(arr,target);
        if(res!=-1)
            System.out.println("Element found at index "+res);
        else
            System.out.println("Element not found");
    }
}
