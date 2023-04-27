public class Formatter {
    double format;
    String RUB;

    void formatter() {
        Person count = new Person();
        Calculator calculator = new Calculator();
        int format = (int) Math.floor(count.countPersons / calculator.price1);
        if (format % 100 >= 11 && format % 100 <= 14) {
            RUB = " рублей";
        } else {
            switch (format) {
                case 1:
                    RUB = " рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    RUB = " рубля";
                    break;
                default:
                    RUB = " рублей";
            }
        }
    }
}
