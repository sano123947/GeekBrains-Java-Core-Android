package HomeWorkApp6;

public class Cat extends Animal{
    private static int count;           // счетчик количества созданных животных класса Cat (котов)
    private static int countClone;      // счетчик количества клонированных животных класса Cat (котов)

    public Cat(String type, String name, int flying, int swims, int goes, int run, int crawling) {
        this.type = type;
        this.name = name;
        this.flying = flying;
        this.swims = swims;
        this.goes = goes;
        this.run = run;
        this.crawling = crawling;
        count++;
    }


    public static int getCount() {
        return count;
    }

    public static int getCountClone() {
        return countClone;
    }

    protected Object clone(String m) throws CloneNotSupportedException {
        //System.out.println("Вызван метод клонирования с мутациями");
        countClone++;
        Cat clon = (Cat) super.clone();
        clon.type = "(КЛОН - мутант) " + type;
        clon.name = "КЛОН (М) №" + countClone + "_" + name;
        // мутант создается с целью создать морского кота с повышенной плавучестью и выносливостью
        clon.swims *= 10;
        clon.run *= 5;
        return clon;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        countClone++;
        Cat clon = (Cat) super.clone();
        clon.type = "(КЛОН) " + type;
        clon.name = "КЛОН " + name;
        return clon;
    }
}
