public class Person {

    String imie;
    double wiek;
    int wzrost;

    public Person(String imie, double wiek, int wzrost) {

        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;



        if (imie != null) {
            if (wiek > 45 && wzrost < 160) {
                System.out.println("Użytkownik ma więcej niż 30 lat i więcej niż 160 cm") ;
            } else {
                System.out.println("Użytkownik ma 30 lat (lub mniej) lub 160 cm (lub mniej)");

            }

        }
    }
}






