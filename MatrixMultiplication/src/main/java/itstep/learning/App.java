package itstep.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] matrixB = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        int size = matrixA.length;

        int[][] matrixRes = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                for(int g = 0; g < size; g++){
                    matrixRes[i][j] += matrixA[i][g] * matrixB[g][j];
                }
            }
        }

        for(int[] element : matrixRes){
            for(int element2 : element){
                System.out.print(element2 + " ");
            }
            System.out.println();
        }
    }
}
