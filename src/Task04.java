//Задание 4
//Дана точка на плоскости заданная координатами x и y,
//определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
//Четверти обозначены римскими цифрами.
import java.util.Scanner;
public class Task04 {
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Введите координату x");
    int x = in.nextInt();
    System.out.println("Введите координату y");
    int y = in.nextInt();
    if (x>=0&&y>=0) System.out.println("Точка находится в I четверти");
    if (x>=0&&y<0) System.out.println("Точка находится в IV четверти");
    if (x<0&&y>=0) System.out.println("Точка находится в II четверти");
    else System.out.println("Точка находится в III четверти");
}
}
