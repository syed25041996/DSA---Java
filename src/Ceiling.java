public class Ceiling {

    public static void main(String[] args) {
        System.out.println(ceiling(new int[]{11,22,33,44,55,66,77,88}, 1));
        System.out.println(floor(new int[]{11,22,33,44,55,66,77,88}, 1));

    }

    static int ceiling(int[] arr, int target) {
//        greater than or equal to the target in an array ( >= )

        //If the target is greater than the greatest element in the array or the target
        //is smaller than the smallest element, it should return -1.
        if((target > arr[arr.length -1]) || (target < arr[0])){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            // 11,22,33,44,55,66,77
            //target = 56

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }


    static int floor(int[] arr, int target) {
//        lesser than or equal to the target in an array ( <= )
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // 11,22,33,44,55,66,77
            //target = 56

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
