import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row_first, column_first, row_second, column_second;
        System.out.println("Enter the size of 1st matrix in row and column:");
        row_first = sc.nextInt();
        column_first = sc.nextInt();
        System.out.println("Enter the size of 2nd matrix in row and column:");
        row_second = sc.nextInt();
        column_second = sc.nextInt();

        if (column_first != row_second) {
            System.out.println(
                    "Column of first matrix and Row of second matrix is not same . That,s why matrix multiplication is not possible.");
        } else {

            int a[][] = new int[row_first][column_first];
            int b[][] = new int[row_second][column_second];

            System.out.println("Enter the element in 1st matrix");
            for (int i = 0; i < row_first; i++) {
                for (int j = 0; j < column_first; j++) {
                    System.out.print("Element at [" + i + "][" + j + "]: ");
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the element in 2nd matrix");
            for (int i = 0; i < row_second; i++) {
                for (int j = 0; j < column_second; j++) {
                    System.out.print("Element at [" + i + "][" + j + "]: ");
                    b[i][j] = sc.nextInt();
                }
            }

            System.out.println("\nYour 1st Matrix:");
            for (int i = 0; i < row_first; i++) {
                for (int j = 0; j < column_first; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nYour 2st Matrix:");
            for (int i = 0; i < row_second; i++) {
                for (int j = 0; j < column_second; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            int r[][] = new int[row_first][column_second];

            for (int i = 0; i < row_first; i++) {
                for (int j = 0; j < column_second; j++) {
                    /*
                     * 'k' ची गरज का आहे:
                     * - 'i' आणि 'j' फक्त Result Matrix r[i][j] मधील जागा ठरवतात.
                     * - 'k' नसेल तर A च्या row आणि B च्या column मधील पुढच्या elements पर्यंत पोहोचता येत नाही. means can't able to access a[0][1] & b[1][0]
                     */
                    for (int k = 0; k < column_first; k++) {
                        r[i][j] = r[i][j] + (a[i][k] * b[k][j]);
                    }
                }
            }

            System.out.println("\nYour Matrix Multiplication is:");
            for (int i = 0; i < row_first; i++) {
                for (int j = 0; j < column_second; j++) {
                    System.out.print(r[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
