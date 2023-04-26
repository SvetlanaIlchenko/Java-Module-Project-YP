import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person count = new Person();
        count.quantityPersons();

        Calculator product = new Calculator();
        product.nameRequest1();
        product.checkingThePrice();
        product.nameRequest2();
        String transfer = "\n";
        System.out.printf("Добавленные товары:\n%s\n", product.name1);
        Formatter formatterRUB = new Formatter();
        formatterRUB.format = product.price1 / count.countPersons;
        formatterRUB.formatter();
        System.out.printf("Сумма к оплате для каждого посетителя составит: %.2f %s", formatterRUB.format, formatterRUB.RUB);
    }
}
