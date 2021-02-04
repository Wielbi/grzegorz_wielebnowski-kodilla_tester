import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int sum = 0;
         int min = 31;
         int max = 0;

        while(sum < 5000) {
            int losowaliczba = random.nextInt(30) + 1;
            sum = losowaliczba + sum;
            if (min > losowaliczba){
                min=losowaliczba;

            }

            System.out.println(losowaliczba);
            System.out.println(sum);


        }
        System.out.println(min);



    }


}











