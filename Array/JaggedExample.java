public class JaggedExample {
    public static void main(String[] args) {
        /*
        10 20 30
        40 50 
        60 70 80 90
         */

        // int [][] arr = new int [3][];

        // arr[0] = new int[3];
        // arr[1] = new int[2];
        // arr[2] = new int[4];

        // arr[0][0] = 10;
        // arr[0][1] = 20;
        // arr[0][2] = 30;

        // arr[1][0] = 40;
        // arr[1][1] = 50;

        // arr[2][0] = 60;
        // arr[2][1] = 70;
        // arr[2][2] = 80;
        // arr[2][3] = 90;

        // // int[][] arr1 ={
        // //     {10,20,30},
        // //     {40,50},
        // //     {60,70,80,90}
        // // };
        
        // System.out.println(arr[2][3]);




        int[] arr = {1,2,3,4,5,6};
        
        int start = 0;
        int end = arr.length-1;
        while(start < end){ 
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        for (Object elem : arr) {
            System.out.println(elem);
        }

        
    }
}
