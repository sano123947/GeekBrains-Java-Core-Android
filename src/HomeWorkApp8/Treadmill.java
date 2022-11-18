package HomeWorkApp8;

public class Treadmill { private String name;        // наименование препятствия или его порядковый номер, на будущее.
    private int distance;       // протяженность.

    public Treadmill(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Беговая дорожка (" + name + " забег на дистанцию: " + distance +"м.";
    }
}
