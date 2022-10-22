public class PeakMountain {


    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,3,4,6,4,3,2}));
    }


    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else  {
                start = mid + 1;
            }
        }
        return start;
    }
}
