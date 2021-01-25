package MatrixRotate;

public class Main {
        public static void main(String[] args) {

        //input
            int[][] inputM = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
            };
            int[][] rM = rotateMatrix(inputM);

        //print
            for (int i = 0; i < rM.length; i++)
            {
                for (int j = 0; j < rM[i].length; j++)
                    System.out.print(rM[i][j] + " ");
                System.out.println();
            }
        }

        public static int[][] rotateMatrix(int[][] inputMatrix){

        //basic input
            int[][] rotatedMatrix = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
            };

        //rotate, pass rotated to main

            for(int i=0; i<inputMatrix[0].length; i++){
                for(int j = inputMatrix.length-1; j>=0; j--){
                    inputMatrix[i][j] = rotatedMatrix[j][inputMatrix.length-1-i];
                }
            }

            return rotatedMatrix;
        }
}
