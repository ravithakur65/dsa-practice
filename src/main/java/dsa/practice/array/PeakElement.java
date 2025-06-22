package dsa.practice.array;

public class PeakElement {
    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();
        int[] arr = {2,33,4,23,12,44,2,45,7,88,87};
        int[] sortedArr = {1,2,3,4,5};
        int[] revSortedArr = {8,7,6,5,4,3,2};
        System.out.println(peakElement.findPeakElement(revSortedArr));
    }

    public int findPeakElement(int[] arr){
        int peakElement = arr[0];
        for(int i=1; i<arr.length-1; i++){
            int temp = arr[i];
            if(arr[i-1] < temp && arr[i+1] < temp){
                peakElement = temp;
                break;
            }
        }
        return peakElement;
    }
}
