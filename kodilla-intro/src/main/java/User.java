public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public static void main (String[]args){
        User Grzegorz = new User("Grzegorz", 39);
        User Wioletta = new User("Wioletta", 37);
        User Edyta = new User("Edyta", 41);

        int [] age = {39,37,41};
            double ages = 3;
            double sum = 3;
            for (int i = 0; i < 3; i++) {
            sum += age [i];
            sum /= age.length;
            }

          int Age =  age.length;
          double averageHeight = sum / age.length;
          System.out.println("Średnia wieku rodziny to " + sum );
          System.out.println("Suma wieku uzytkowników to " + sum);
        }


    }











