package arrays;

public class SecondLargest {
    public static void main(String[] args) {

    int[] arr = {1,5,8,9,3};
    int largest =arr[0];
    int secondLargest = arr[0];
    for (int i=0; i<arr.length;i++){
        if (arr[i]> largest){
            secondLargest=largest;
            largest=arr[i];
        }
        else if (arr[i]>secondLargest && arr[i]!=largest){
            largest=arr[i];
        }
    }
        System.out.println(largest);
        System.out.println(secondLargest);

}
}
