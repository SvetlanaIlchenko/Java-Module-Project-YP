import java.util.Scanner;

public class Calculator {
    String name1;
    String name2;
    double price1;
    double price2;
    String transfer = "\n";
    Scanner scanner = new Scanner(System.in);

    void nameRequest1() {
        System.out.println("Введите наименование товара");
        name1 = scanner.next();
    }

    void nameRequest2() {
        while (true) {
        System.out.println("Введите наименование следующего товара или завершить");
        name2 = scanner.next();
            if (name2.equalsIgnoreCase("завершить")){
                break;
            } else {
                name1 = name1 + ", " + transfer + name2;
                checkingThePrice();
            }
        }

    }

    void checkingThePrice() {
        while (true) {
            System.out.println("Введите стоимость товара");
            price2 = scanner.nextDouble();
            if (price2 > 0) {
                price1 = price1 + price2;
                System.out.println("Товар успешно добавлен");
                break;
            } else {
                System.out.println("Вы ввели неверное значение");
            }
        }
    }




    }
