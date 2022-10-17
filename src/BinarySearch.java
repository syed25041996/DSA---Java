public class BinarySearch {


    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{2,3,4,5,45,67,69,72}, 3));
        System.out.println(agnosticBinarySearch(new int[]{99,77,66,55,44,33,22,11},55));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int agnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    end = mid + 1;
                } else{
                    start = mid - 1;
                }
            }

        }
        return -1;
    }

}