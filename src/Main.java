public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int clientOS = 1;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неподдерживаемое значение clientOS");
        }

        //Task 2
        System.out.println("\nTask 2");

        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неподдерживаемое значение clientOS");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неподдерживаемое значение clientOS");
            }
        }

        //Task 3
        System.out.println("\nTask 3");

        int year = 2024;

        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        System.out.println("\nTask 4");

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка невозможна");
        }

        //Task 5
        System.out.println("\nTask 5");

        int monthNumber = 3;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println(monthNumber + "- некорректное значение номера месяца");
        }

        System.out.println();
    }
}