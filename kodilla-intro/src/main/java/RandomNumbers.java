import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();


        for (int i = 0; i <= 30; i++) {
            int a = random.nextInt(1);
            int b = random.nextInt(5001);
            System.out.println(a+b);

        }

        for (int l = 0; l <= 30; l++) {
           int a = random.nextInt(5001);
           int b = random.nextInt(1);

            System.out.println(a + b);
        }
    }


}







