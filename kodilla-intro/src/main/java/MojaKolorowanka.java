import java.util.Scanner;

public class MojaKolorowanka {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();


        switch (color) {
            case "B":
                System.out.println("Pierwsza litera koloru BIALEGO TO ?"  + color);
                break;
            case "R":
                System.out.println("Pierwsza litera koloru ROZOWEGO TO ?"  + color);
                break;
            case "C":
                System.out.println("Pierwsza litera koloru CZERWONEGO TO ?"  + color);
                break;
            case "N":
                System.out.println("Pierwsza litera koloru NIEBIESKIEGO TO ?"  + color);
               break;
            case "P":
                System.out.println("Pierwsza litera koloru POMARANCZOWEGO TO ? "  + color);
            default:
        }

    }
}