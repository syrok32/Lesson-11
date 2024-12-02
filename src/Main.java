public class Main {

    public static void checkMonth(int month){
        boolean leapYear = (month % 4 == 0 && month % 100 != 0) || (month % 400 == 0);
        if (leapYear) {
            System.out.println(month + " Высокосный");
        } else {
            System.out.println(month + " Невысокосный");
        }
    }

    public static void checkYear(int clientDeviceYear, int clientSystem) {

        String yearManufacture = clientSystem == 1 ? clientDeviceYear >= 2015 ? "Установите обычную версию приложения для Android по ссылке" : "Установите облегченную версию приложения для Android по ссылке" : clientDeviceYear >= 2015 ? "Установите обычную версию приложения для IOS по ссылке" : "Установите облегченную версию приложения для IOS по ссылке";
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
        checkMonth(2230);
        checkYear(2013, 1);
        System.out.println(distanceDelivery(50));

    }
}