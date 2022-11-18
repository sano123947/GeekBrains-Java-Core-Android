package HomeWorkApp;

public class HomeWorkApp {
        public static void main (String[]args) {
              printThreeWords();
              checkSumSign();
              printColor();
              compareNumbers();

        }
        static void printThreeWords(){
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        static void checkSumSign(){
            int a = 9;
            int b = -15;
            int sum =a + b;

            if (sum>= 0) {
                System.out.println("сумма положительная");
            } else {
                System.out.println("сумма отрицательная");
            }
        }
        static void printColor(){
            int value = 101;
            if (value <= 0) {
                System.out.println("красный");
            } else if (value > 0 & value <= 100) {
                System.out.println("желтый");
            } else {
                System.out.println("зеленый");
            }
        }

    static void compareNumbers(){
            int a = 5;
            int b = 6;
            if (a >= b) {
                System.out.println("a >=b");
            }else{
                System.out.println("a <= b");
            }
    }

    }


