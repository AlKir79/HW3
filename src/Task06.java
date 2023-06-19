//Задание 6
//Определить количество дней в году, который вводит
//пользователь, и вывести их в консоль. В високосном году –
//366 дней, тогда как в обычном – 365. Високосными годами
//являются все годы, делящиеся нацело на 4, за исключением
//столетий, которые не делятся нацело на 400.
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год ");
        int year = in.nextInt();
        if (checkYear(year)) System.out.println("Год високосный. Число дней в году 366.");
        else System.out.println("Год не високосный. ЧИсло дней в году 365.");
    }
// функция проверки является ли год високосным
// високосный год кратен 400, а также кратен 4, и при этом не кратен 100
public static boolean checkYear(int year){
        if ((year%400 == 0)||((year%4 == 0)&&(year%100 != 0))) return true;
        else return false;
}
}

