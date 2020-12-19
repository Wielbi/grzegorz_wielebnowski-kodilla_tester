public class Aplication {
    public static void main(String[] args) {

            // Person person = new Person();
              // person.imie = "Adam";
            //person.wzrost = 178;
            // person.wiek = 40.5;
        //
        //      System.out.println(person.imie);
        //    System.out.println(person.wzrost);
        //  System.out.println(person.wiek);

        Person person = new Person("Adam", 40.5, 178);

        System.out.println(person.imie);
        System.out.println(person.wzrost);
        System.out.println(person.wiek);

    }
}

