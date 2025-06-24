package test;

public class MaxPeak {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 15, 9, 35, 65, 2, 7, 5};
        int maxPeak=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxPeak<arr[i]){
                maxPeak=arr[i];
            }
        }
        System.out.println("max peak in this array:"+maxPeak);
    }
}
