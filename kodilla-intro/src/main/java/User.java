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
        User Tata = new User("Tata,", 63);
        User Mama = new User("Mama", 61);

        User[] users = {Grzegorz, Wioletta, Edyta, Tata, Mama};

            int result = 0;
            for (int i = 0; i < users.length; i++) {
              //  return result;
            }

          int averAge =  users.length;
          double averageHeight = averAge / users.length;
          System.out.println("Średnia wieku rodziny to " +averAge );
          System.out.println("Suma wieku uzytkowników to " + users);
        }


    }











