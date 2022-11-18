package HomeWorkApp5;

public class HomeWork5 {
    static final int AGE_LIMIT = 40;
    static final int WORKER_ARRAY_SIZE = 5;
    public static void main(String[] args) {
        System.out.println("Работники: ");
        Worker[] workers = new Worker[WORKER_ARRAY_SIZE];
        workers[0] = new Worker("Захаров Илья", "Сис администратор 2 линии", "hd@oboz.com",
                "+7(925)316-00-82", 70000, 24);
        workers[1] = new Worker("Никита Румянцев", "Руководитель IT проекта",
                "nrumyansev@oboz.com", "+7(903)789-00-45", 90000, 41);
        workers[2] = new Worker("Володин Леонтий", "Сис администратор 1 линии",
                "lvolodin@oboz.com", "+7(917)516-00-04", 40000, 24);
        workers[3] = new Worker("Никонов Павел", "Логист",
                "pnikonov@oboz.com", "+7(912)558-00-12", 60000, 30);
        workers[4] = new Worker("Иванов Дмитрий", "Директор IT проекта",
                "divanov@oboz.com", "+7(912)558-00-13", 120000, 40);
        System.out.println();
        for (Worker worker : workers) {
            if (worker.getAge() > AGE_LIMIT) {
                System.out.println("Сотрудник старше " + AGE_LIMIT + " лет: " + worker.workerInfo());
            } else if (worker.getAge() == AGE_LIMIT){
                System.out.println("Сотруднику " + AGE_LIMIT + " лет: " + worker.workerInfo());
            } else {
                System.out.println("Сотрудник младше " + AGE_LIMIT + " лет: " + worker.workerInfo());

            }
        }


    }
}


