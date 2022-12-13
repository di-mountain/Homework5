public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2012;
        clientOS = 0;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 != 0) {
            System.out.println("Это обычный год (невисокосный)");
        } else if (year % 100 != 0) {
            System.out.println("Это високосный год");
        } else if (year % 400 != 0) {
            System.out.println("Это обычный год (невисокосный)");
        } else {
            System.out.println("Это високосный год");
        }

        System.out.println("Задача 4");
         int deliveryDistance = 101;
         int deliveryTime;
         if (deliveryDistance <= 20) {
             deliveryTime = 1;
             System.out.println("Потребуется дней: " + deliveryTime);
         } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
             deliveryTime = 2;
             System.out.println("Потребуется дней: " + deliveryTime);
         } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
             deliveryTime = 3;
             System.out.println("Потребуется дней: " + deliveryTime);
         } else {
             System.out.println("Расстояние до банка превышает 100 км. К сожалению, мы не сможем осуществить доставку(");
         }
    }
}