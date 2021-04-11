public class User {
    String name;
    int age;

    public int getAge() {
        return age;

    }

    public String getName() {
        return name;

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {

        User anna = new User("Grzegorz", 39);
        User betty = new User("Edyta", 41);
        User carl = new User("Wioleta", 37);

        double sum = 0;


        User[] osoby = {anna, betty, carl};

        for (int i = 0; i < osoby.length; i++) {
            User user = osoby[i];    // wyciagamy osobe z tablicy (element), i wrzucamy do zmiennej user

            sum += user.getAge();

        }
        double averageHeight = sum / osoby.length;


        for (int i = 0; i < osoby.length; i++) {
            if (osoby[i].getAge() < averageHeight) {


                System.out.println("Najmłodszy użytkownik to " + osoby[i].getName());
            }
        }


        // tworzymy petle w której bedziemy przechodzic przez urzytkowników ( jak wyżej )
        // w petli powinien byc if który sprawdza czy urzytkownik ma wiek wiekszy niz sredni wiek urzytkowników
        // jeżeli tak wyswietli go if
        // p[obrac imie tego urzytkownika gatName


        System.out.println("Średnia wieku rodziny to " + averageHeight);
        System.out.println("Suma wieku uzytkowników to " + sum);


    }

}










