package samouczekProgramisty;

public class Cwiczenie1 {

    static boolean isTempraturePositive(int temprature) {

        boolean isPositive = temprature>=0;

        if (isPositive) {
            System.out.println("Temperatura jest dodatnia");
        } else {
            System.out.println("Temperatura jest ujemna");
        }
        return isPositive;
    }


}
