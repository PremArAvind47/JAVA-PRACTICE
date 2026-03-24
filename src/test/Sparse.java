package test;

public class Sparse {

    public static void main(String[] args) {

        // Sparse array (row, col, value)
        int[][] sparse = {
            {1,1,5}
        };

        System.out.println(getValue(sparse, 1, 1)); // 5
        System.out.println(getValue(sparse, 0, 2)); // 0
    }

    // get value using position
    public static int getValue(int[][] sparse, int row, int col) {

        for(int i = 0; i < sparse.length; i++){
            if(sparse[i][0] == row && sparse[i][1] == col){
                return sparse[i][2];
            }
        }

        return 0;
    }
}