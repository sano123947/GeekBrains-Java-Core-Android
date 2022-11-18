package HomeWorckApp2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(doOne(10, 30));
        doTwo(-8);
        System.out.println(doThree(-6));
        doFour("Ivan", 5);
        doFive(2022);

    }

    static boolean doOne(int a, int b) {
        System.out.println("задание 1");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;

    }
    static void doTwo(int a){
        System.out.println("задание 2");
        if (a >= 0)
            System.out.println("Число " + a + "положительное");
        else
            System.out.println("Число " + a + " отрицательное");

    }
    static boolean doThree(int a){
        System.out.println("задание 3");
        if (a < 0) return true;
        else return false;
    }
    public static void doFour(String str, int n){
        for (int i = 1; i <= n; i++){
            System.out.println("[" + i +"]" +" " + str);
        }

    }
    static void doFive(int year){
        System.out.println("задание 5");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + "год . не високосный");
        else System.out.println(year + "год. високосный");
    }
}