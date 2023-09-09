package HomeWork2;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1() {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        try {
            if (numb <= 0) {
                throw new InvalidNumberException(numb);
            }
            System.out.println("Число" + " - " + numb + " " + "корректное");
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void Task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        System.out.println("Введите второе число: ");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        try {
            if (numb2 == 0) {
                throw new DivisionByZeroException();
            }
            System.out.println(numb1 / numb2);
        } catch (DivisionByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void Task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        System.out.println("Введите второе число: ");
        System.out.println("Введите третье число: ");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();
        try {
            if (numb1 > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            }
            if (numb2 < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            if (numb1 + numb2 < 10){
                throw new NumberSumException();
            }
            if (numb3 == 0){
                throw new DivisionByZeroException();
            }
            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
