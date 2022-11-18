package HomeWorkApp3;

import java.util.Arrays;

public class HomeWork3 {
        public static void  main(String[] args){
            //переменные
            int[] arr1 = {1,1,0,0,1,0,1,1,0,0};//к заданию 1
            int[] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};//к заданию 3
            int[] arr6 = {1,5,3,2,11,4,5,2,4,8,9,1};//к заданию 6
            int[] arr7 = {1,1,2,2};//к заданию 7
            System.out.println();
            doTask1(arr1);
            System.out.println();
            doTask2(100);
            System.out.println();
            doTask3(arr3);
            System.out.println();
            doTask4();
            System.out.println();
            doTask5(5,1);
            System.out.println();
            doTask6(arr6);
            System.out.println();
            System.out.println(doTask7(arr7));
            int[] arr = new int[] {1,2,3,4,5,6,7};
            int n =4;
            shiftArrayN(Arrays.toString(arr));
            arr = shiftArrayN(arr, n );
            shiftArrayN(Arrays.toString(arr));


        }

    private static void shiftArrayN(String toString) {
    }

    // задание 1
            public static void doTask1(int[]arr){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 0){
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
                System.out.println(arr[i] + "");
            }
            }
    //задание 2
           public static void doTask2(int size){
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++){
                arr[i] = i + 1;
                System.out.println(arr [i] + "");
            }

           }
    //задание 3
         public static void doTask3(int[] arr){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < 6){
                    arr[i] = arr[i] * 2;

                    }
                System.out.println(arr[i] + "");
             }
         }

    //задание 4
          public static void doTask4(){
            int[][] arr = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}};
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    if (i == j){
                        arr[i][j] = 1;
                }
                    System.out.println(arr[i][j] + "");
                    }
                System.out.println();
            }

          }

    //задание 5
    public static void doTask5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
    //задание 6
    public static void doTask6( int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    //задание 7
    public static boolean doTask7 ( int[] arr){
        int rightSum = 0;
        int leftSum = 0;
        // Нахожу сумму всех элементов
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        //Перебираю сумму с начала массива и сравниваю с разницей (правой частью)
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }



    //задание 8
    public static int []shiftArrayN (int[] arr,int n){
            if ( arr.length == 0 || arr.length == 1)
                 return arr;
            if (n > 0) {
                for (int i = 0; i < n; i++)
                    arr = shiftRight(arr);
            }else  if ( n < 0) {
                for (int i = 0 ; i > n; i--)
                    arr = shiftLeft( arr );
            }
            return  arr;
    }
    static  int[] shiftLeft(int[]arr){
            int temp = arr[0];
            for (int i = 0 ; i < arr.length - 1; i++)
                arr[i] = arr[i + 1];
            arr[arr.length - 1] = temp;
            return arr;
    }
    static int[] shiftRight(int[] arr){
        int temp = arr[ arr.length - 1 ];
        for ( int i = arr.length - 1 ; i > 0 ; i-- )
            arr[ i ] = arr[ i - 1 ];
        arr[ 0 ] = temp;
        return arr;
    }
}
