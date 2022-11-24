// Задано уравнение вида q + w = e.   q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства.
//  Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Выберите вид заданного выражения"+"\n"+
        "1:(q? + ?w = e)"+"\n"+
        "2:(?q + w? = e)");
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
        if (command == 1){
            System.out.print("Введите e: ");
            int e = in.nextInt();
            System.out.print("Введите q?: ");
            int q = in.nextInt();
            System.out.print("Введите ?w: ");
            int w = in.nextInt();
            int qResult = q * 10+(e % 10 - w);
            int wResult = 10 * (e / 10 - q) + w;
            System.out.println("qResult = "+qResult+"");
            System.out.println("wResult = "+wResult+"");
        }
        else{
            System.out.print("Введите e: ");
            int e = in.nextInt();
            System.out.print("Введите ?q: ");
            int q = in.nextInt();
            System.out.print("Введите w?: ");
            int w = in.nextInt();
            int qResult = 10 * (e / 10 - w) + q;
            int wResult = w * 10 + (e % 10 - q);
            System.out.println("qResult = "+qResult+"");
            System.out.println("wResult = "+wResult+"");
        }
    }
}
