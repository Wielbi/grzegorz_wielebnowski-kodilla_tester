public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public static void main (String[]args){


        int [] age = {39,37,41};

            double sum = 0;
            for (int i = 0; i < age.length; i++) {
            sum += age [i];

            }
            double averageHeight = sum / age.length;

          System.out.println("Średnia wieku rodziny to " + averageHeight );
          System.out.println("Suma wieku uzytkowników to " + sum);
        }


    }











