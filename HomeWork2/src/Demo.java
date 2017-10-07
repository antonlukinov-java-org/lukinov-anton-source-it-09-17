public class Demo {
    public static void main(String[] args){
        int number = 123;
        int sum = 6;
        int currentDigit;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;
        sum = sum + number;

        System.out.println(sum);

    }
}
