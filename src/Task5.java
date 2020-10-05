import java.util.*;
public class Task5 {
    public static void main(String[] args){


        Scanner s = new Scanner(System.in);
        System.out.print("Введите часы-> ");
        int x = s.nextInt();
        System.out.print("Введите минуты-> ");
        int y = s.nextInt();
        System.out.print("Введите секунды-> ");
        int z = s.nextInt();
        System.out.print("Введите сколько секунд отнять-> ");
        int o = s.nextInt();


        Date a=new Date(( x + y + z ) - o);
        System.out.println("Еще одна дата: "+a);
    }
}