import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int principal = scanner.nextInt();
        float annualInterestRate = scanner.nextFloat();
        byte period = scanner.nextByte();

        byte percent = 100;
        byte months = 12;

        int numberOfPayments = period * months;

        float rate = annualInterestRate / percent / months;

        double mortgage = principal * (rate*Math.pow(1+rate, numberOfPayments) / (Math.pow(1+rate, numberOfPayments) - 1));

        String result = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(result);
    }
}