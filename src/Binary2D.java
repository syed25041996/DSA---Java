import java.util.Arrays;

public class Binary2D {

    public static void main(String... args){

        int[][] arr = {{1,2,3}, {10,20,30}, {44,55,66}};
        System.out.println(Arrays.toString(search2d(arr,3)));

    }

    static int[] search2d (int[][] matrix, int target){

        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column >= 0){

            if(matrix[row][column] == target){
                return new int[]{row,column};
            }

            if(matrix[row][column] < target){
                row++;
            }else{
                column--;
            }
        }

        return new int[]{-1,-1};

    }
}
