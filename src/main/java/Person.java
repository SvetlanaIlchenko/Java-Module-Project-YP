import java.util.Scanner;
public class Person {
    int countPersons;
    Scanner scanner = new Scanner(System.in);

    void quantityPersons() {

        while (true) {
            System.out.println("На скольких человек необходимо разделить счет?");
            countPersons = scanner.nextInt();
            if (countPersons > 1) {
                System.out.println("Итоговый счет будет разделен на " + countPersons + " посетителей");
                break;
            } else {
                System.out.println("Вы ввели некорректное значение");
            }
        }
    }
}
