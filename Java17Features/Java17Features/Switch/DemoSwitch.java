package Java17Features.Switch;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String result = switch (n) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Other";
        };

        System.out.println(result);
    }
}
