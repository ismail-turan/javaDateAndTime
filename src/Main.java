import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int todayMonth=scanner.nextInt();
        int todayDay= scanner.nextInt();
        int todayYear= scanner.nextInt();
        System.out.println(findDay(todayMonth,todayDay,todayYear));

    }
    public static String findDay(int month,int day,int year){
        LocalDate datee=LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek=datee.getDayOfWeek();
        String result=String.valueOf(dayOfWeek);
        return result;
    }
}