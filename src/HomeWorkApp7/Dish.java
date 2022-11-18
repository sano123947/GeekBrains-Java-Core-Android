package HomeWorkApp7;

public class Dish {
    private int capacity;
    private int currentFilling;

    //Конструктор. При создании миски следует указать вместимость миски в единицах еды
    public Dish(int capacity) {
        this.capacity = capacity;
        currentFilling = 0;
    }

    // метод возвращает текущее состояние заполнения миски
    public int getCurrentFilling() {
        return currentFilling;
    }

    //метод добавляющий еду в миску
    public void addFoodToDish(int amountOfFood) throws DishCustomException {
        if (amountOfFood > 0 && this.currentFilling + amountOfFood <= capacity) {
            this.currentFilling += amountOfFood;
            System.out.println("Количество еды в миске увеличено до " + this.currentFilling);
        } else {
            //System.out.println("Миска не резиновая, больше чем в нее влазит сыпать без толку!");
            throw new DishCustomException("Миска не резиновая, больше чем в нее влазит сыпать без толку!");
        }
    }

    //метод отвечающий за изъятие еды из тарелки
    public int decreaseFoodInDish(int amountOfFood) throws DishCustomException {
        if (amountOfFood > 0 && this.currentFilling - amountOfFood >= 0) {
            this.currentFilling -= amountOfFood;
            return amountOfFood;
        } else {
            //System.out.println("Содержание еды в миске меньше запрашиваемого!");
            throw new DishCustomException("Содержание еды в миске меньше запрашиваемого!");
        }
    }
}
