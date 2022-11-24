import java.util.Scanner;

// Реализовать простой калькулятор
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите цифру команды:"+
        "\n"+"1-сложение"+
        "\n"+"2-вычетание"+
        "\n"+"3-умножение"+
        "\n"+"4-деление");
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        if (command == 1){
            int result = num1 + num2;
            System.out.println("Результат сложения равен "+result+"");
        }
        if (command == 2){
            int result = num1 - num2;
            System.out.println("Результат вычетания равен "+result+"");
        }
        if (command == 3){
            int result = num1 * num2;
            System.out.println("Результат умножения равен "+result+"");
        }
        if (command == 4){
            int result = num1 / num2;
            System.out.println("Результат деления равен "+result+"");
        }
    }
}
