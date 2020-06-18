package samouczekProgramisty;
import java.util.Scanner;
import static samouczekProgramisty.Cwiczenie1.isTempraturePositive;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");
        int temprature = scanner.nextInt();

        isTempraturePositive(temprature);

    }

}
