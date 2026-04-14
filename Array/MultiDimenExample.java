public class MultiDimenExample {
    public static void main(String[] args) {
        /* 
        1 2 3
        4 5 6
        */

        // int [2][3] matrix = {
        //     {1,2,3},
        //     {4,5,6}  
        // };

        int [][] matrix = new int [2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        for(int [] row : matrix){
            for(int value : row){
                System.out.println(value +" ");
            }
            System.out.println();
        }

        //  for(int i = 0; i < matrix.length; i++){
        //     System.out.println(matrix[i]);         //row

        //     for(int j = 0; j < matrix[i].length; j++){
        //         System.out.println(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        //  }


        // for(int i = number.length - 1; i >= 0; i--){
        //     System.out.println(number[i]);
        // }


    }
}
