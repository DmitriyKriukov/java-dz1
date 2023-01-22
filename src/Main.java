import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex3();
    }

    static void ex0() {
    /*
    Вычислить n-ое треугольного число(сумма чисел от 1 до n)
    */
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("Треугольное число: " + res);
    }

    static void ex1() {
    /*
    Вычислить n! (произведение чисел от 1 до n)
    */
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println("Факториал: " + res);
    }

    static void ex2() {
    /*
    Вывести все простые числа от 1 до 1000 (простые числа - это числа которые
    делятся только на себя и на единицу без остатка. Чтобы найти остаток
    от деления используйте оператор % , например 10%3 будет равно единице)
    */
        System.out.println("Все простые числа от 1 до 1000: ");
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }

    static void ex3() {
    /*
    Реализовать простой калькулятор
    */
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите арифметический знак: ");
        String sign = scanner.next();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        switch (sign) {
            case "+" -> System.out.print(num1 + num2);
            case "-" -> System.out.print(num1 - num2);
            case "*" -> System.out.print(num1 * num2);
            case "/" -> System.out.print(num1 / num2);
            default -> System.out.print("Неверный ввод");
        }
        }
    }
}


