//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//column is set to 0.

public class ZeroMatrix {

    public static void zeroMatrix(int [][] mat){
        int n = mat.length;
        int m = mat[0].length;
        boolean rowHasZero = false;
        boolean columnHasZero = false;

        for (int i = 0; i < n; i++){
            if (mat[i][0] == 0){
                columnHasZero = true;
                break;
            }
        }

        for (int j = 0; j < m; j++){
            if (mat[0][j] == 0){
                rowHasZero = true;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (mat[i][0] == 0) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        for (int j = 1; j < m; j++) {
            if (mat[0][j] == 0) {
                for (int i = 0; i < n; i++) {
                    mat[i][j] = 0;
                }
            }
        }

        if (rowHasZero){
            for (int j = 0; j < m; j++){
                mat[0][j] = 0;
            }
        }

        if (columnHasZero){
            for (int i = 0; i < n; i++){
                mat[i][0] = 0;
            }
        }

    }


    public static void displayMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        System.out.println("Your matrix is ");
        displayMatrix(mat);

        zeroMatrix(mat);

        System.out.println("\n After setting to 0 ");
        displayMatrix(mat);

    }


}
