//Задание 5
//Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
//года по китайскому календарю.
import javax.lang.model.type.NullType;
import java.util.Scanner;
public class Task05 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите день рождения человека");
    int day = in.nextInt();
    int mounth = in.nextInt();
    int year = in.nextInt();
    int tempYear=year;
    while (znakGod(tempYear)=="0") {
        if(year>1982) tempYear-=12;
        if(year<1971) tempYear+=12;
    }
    System.out.println("Вывод: ");
    System.out.println("Знак: "+znakMounth(mounth,day));
    System.out.println("Год: "+znakGod(tempYear));
}
public static String znakGod(int year){
    String god= String.valueOf(0);
    switch (year) {
        case 1971:
            god="Кабана";
            break;
        case 1972:
            god="Крысы";
            break;
        case 1973:
            god="Быка";
            break;
        case 1974:
            god="Тигра";
            break;
        case 1975:
            god="Кота(Кролика)";
            break;
        case 1976:
            god="Дракона";
            break;
        case 1977:
            god="Змеи";
            break;
        case 1979:
            god="Козы";
            break;
        case 1980:
            god="Обезьяны";
            break;
        case 1981:
            god="Петуха";
            break;
        case 1982:
            god="Собаки";
            break;
        default:
            god = "0";
            break;
    }
    return god;
}
public static String znakMounth(int mounth, int day) {
    String mes = String.valueOf(0);
    switch (mounth) {
        case 1:
            if (day>=21) mes = "Водолей";
            else mes = "Козерог";
            break;
        case 2:
            if (day>=19) mes = "Рыбы";
            else mes = "Водолей";
            break;
        case 3:
            if (day>=21) mes = "Овен";
            else mes = "Рыбы";
            break;
        case 4:
            if (day>=21) mes = "Телец";
            else mes = "Овен";
            break;
        case 5:
            if (day>=21) mes = "Близнецы";
            else mes = "Телец";
            break;
        case 6:
            if (day>=22) mes = "Рак";
            else mes = "Близнецы";
            break;
        case 7:
            if (day>=23) mes = "Лев";
            else mes = "Рак";
            break;
        case 8:
            if (day>=23) mes = "Дева";
            else mes = "Лев";
            break;
        case 9:
            if (day>=24) mes = "Весы";
            else mes = "Дева";
            break;
        case 10:
            if (day>=24) mes = "Скорпион";
            else mes = "Весы";
            break;
        case 11:
            if (day>=23) mes = "Стрелец";
            else mes = "Скорпион";
            break;
        case 12:
            if (day>22) mes = "Козерог";
            else mes = "Стрелец";
            break;
    }
    return mes;
}
}
