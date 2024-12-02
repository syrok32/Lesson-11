public class Main {

    public static void checkYear(int Year){
        boolean leapYear = (Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0);
        if (leapYear) {
            System.out.println(Year + " Высокосный");
        } else {
            System.out.println(Year + " Невысокосный");
        }
    }

    public static void checkOs(int clientDeviceYear, int clientSystem) {

        String yearManufacture;
        if (clientSystem == 1) {
            yearManufacture = clientDeviceYear >= 2015 ? "Установите обычную версию приложения для Android по ссылке" : "Установите облегченную версию приложения для Android по ссылке";
        } else {
            if (clientDeviceYear >= 2015) yearManufacture = "Установите обычную версию приложения для IOS по ссылке";
            else yearManufacture = "Установите облегченную версию приложения для IOS по ссылке";
        }
        System.out.println(yearManufacture);
    }

    public  static String distanceDelivery(int distance) {
        int countDay = 1;
        if (distance <= 20) {
            return ("Потребуется дней: " + countDay);
        }
        countDay += 1;

        if (distance <= 60) {
            return  ("Потребуется дней: " + countDay);
        }
        countDay += 1;

        if (distance <= 100) {
            return  ("Потребуется дней: " + countDay);
        } else return ("доставки нет");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        checkYear(2230);
        checkOs(2013, 1);
        System.out.println(distanceDelivery(50));

    }
}