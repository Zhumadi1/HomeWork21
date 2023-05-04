import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deys deys = Deys.valueOf(scanner.nextLine());
        switch (deys){
            case MONDAY -> Deys.MONDAY.method();
            case TUESDAY -> Deys.TUESDAY.method();
            case WEDNESDAY -> Deys.WEDNESDAY.method();
            case THURSDAY -> Deys.THURSDAY.method();
            case FRIDAY -> Deys.FRIDAY.method();
            case SATURDAY -> Deys.SATURDAY.method();
            case SANDAY -> Deys.SANDAY.method();

        }

    }
}