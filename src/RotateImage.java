//1.6 Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

public class RotateImage {

    public static int[][] rotateMatrix(int [][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int[][] newMat = new int[m][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                newMat[j][n - i - 1] = mat[i][j];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        return newMat;
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
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Your image is");
        mat = rotateMatrix(mat);

        System.out.println("\n After rotation by 90 degrees ");
        displayMatrix(mat);
    }
}
