import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int a =  random.nextInt(1);
        int b = random.nextInt(10);

        for (int i = 1; i < 2; i++) {

            for (int l = 0; l < 10; l++) {
            a=random.nextInt(1);
            b= random.nextInt(5);
            
                System.out.println(a+b);
            }
        }




        }
    }






