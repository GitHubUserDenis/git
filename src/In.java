import java.util.Scanner;

public class In {


    String  date;

    Scanner scanner = new Scanner(System.in);

    public void Scan(){
        System.out.println("Введите арифметическую операцию:");

        date = scanner.nextLine();
    }

}
