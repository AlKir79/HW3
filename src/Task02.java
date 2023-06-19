//Задание 2
//С клавиатуры вводится время (количество часов от 0 до
//24) – программа выводит приветствие, соответствующее
//введенному времени (например, ввели 15 часов – выводится
//приветствие «Добрый день»).
import java.util.Scanner;
public class Task02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите час (от 0 до 24)");
        int time =in.nextInt();
        while (time<0||time>24) {
            System.out.println("Проверьте диапазон (от 0 до 24 часов!!!)");
            time= in.nextInt();}
        if (time>6&&time<=12) System.out.println("Доброе утро!");
        if (time>12&&time<=18) System.out.println("Добрый день!");
        if ((time>18&&time<=24)||(time==0)) System.out.println("Добрый вечер!");
        if (time>0&&time<=6) System.out.println("Доброй ночи!");
    }
}
