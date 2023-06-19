//Задание 3
//Написать программу, которая предлагает пользователю
//выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
//ответ показывает, какие звуки издает выбранное животное.
//В списке должно быть не менее 10 животных.
import java.util.Scanner;
public class Task03 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Выберите животное ");
    System.out.println("1 - кошка ");
    System.out.println("2 - собака ");
    System.out.println("3 - корова ");
    System.out.println("4 - овца ");
    System.out.println("5 - коза ");
    System.out.println("6 - петух ");
    System.out.println("7 - мышь ");
    System.out.println("8 - лошадь ");
    System.out.println("9 - осел ");
    System.out.println("10 - рыба ");
    int n= in.nextInt();
    while(n<1||n>10) {
        System.out.println("Такого числа нет в списке!!! Введите еще раз");
        n = in.nextInt();
        }
    switch(n) {
        case 1:
            System.out.println("Мяу!!!");
            break;
        case 2:
            System.out.println("Гав!!!");
            break;
        case 3:
            System.out.println("Муу!!!");
            break;
        case 4:
            System.out.println("Бее!!!");
            break;
        case 5:
            System.out.println("Мее!!!");
            break;
        case 6:
            System.out.println("Кукареку!!!");
            break;
        case 7:
            System.out.println("Пии!!!");
            break;
        case 8:
            System.out.println("Игого!!!");
            break;
        case 9:
            System.out.println("Иа!!!");
            break;
        case 10:
            System.out.println("...!!!");
            break;
    }
    }
}
