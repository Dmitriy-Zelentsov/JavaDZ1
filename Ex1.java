// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = in.nextInt();
        int factorial = getFactorial(n);
        System.out.println("Факториал числа "+n+" равен "+factorial+"");
    }
    public static int getFactorial (int a){
        if (a <= 1) {
            return 1;
        }
        else {
            return a * getFactorial(a - 1);
        }
    }
}