import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Меню:");
            System.out.println("1.Сложение");
            System.out.println("2.Разность");
            System.out.println("3.Умножение");
            System.out.println("4.Делине");
            System.out.println("5.Выход из программы");

            int choose = scanner.nextInt();

            if (choose == 5) {
                System.out.println("Выход из программы.");
                break;
            }
            if (choose>5) {
                System.out.println("Не правильный выбор, доступны выборы от 1 до 5.");
                break;
            }

            System.out.print("Введите первое число: ");
            double c = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double d = scanner.nextDouble();

            switch (choose) {
                case 1:
                    double sum = plus(c, d);
                    System.out.printf("%.0f + %/.0f = %.0f\n", c, d, sum);
                    break;
                case 2:
                    double raz = minus(c, d);
                    System.out.printf("%.0f - %.0f = %.0f\n", c, d, raz);
                    break;
                case 3:
                    double mul = umn(c, d);
                    System.out.printf("%.0f * %.0f = %.0f\n", c, d, mul);
                    break;
                case 4:
                    double dell = del(c, d);
                    if(d==0) {
                        System.out.printf("На ноль делить нельзя\n");
                    } else {
                        System.out.printf("%.0f : %.0f = %.0f\n", c, d, dell);
                    }
                    break;
            }
        }
    }
    public static double plus(double c, double d) {
        return c + d;
    }

    public static double minus(double c, double d) {
        return c - d;
    }

    public static double umn(double c, double d) {
        return c * d;
    }

    public static double del(double c, double d) {
        return c / d;
    }
}
