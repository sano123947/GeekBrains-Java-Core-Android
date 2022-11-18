package HomeWorkApp8;

public class Cat {
    private String name;
    private double maxHeight;      // максимальная высота на на которую может подняться участник
    private int maxRun;         // предельное расстояние непрерывного бега участника

    public Cat(String name, double maxHeight, int maxRun) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRun = maxRun;
    }

    public void run(int distance){
        System.out.println("Кот пробежал " + distance);
    }

    public void jump(double height){
        System.out.println("Кот подпрыгнул на " + height +"м.");
    }

    public String getName() {
        return name;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public int getMaxRun() {
        return maxRun;
    }
}
