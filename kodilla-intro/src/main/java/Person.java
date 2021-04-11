public class Person {

    private String name;
    private double year;
    private int growth;

    public Person(String name, double year, int growth) {

        this.name = name;
        this.year = year;
        this.growth = growth;

    }

    public void yearName(){


        if (name != null) {

            if (year > 45 && growth < 160) {
                System.out.println("Użytkownik ma więcej niż 30 lat i więcej niż 160 cm");
            } else {
                System.out.println("Użytkownik ma 30 lat (lub mniej) lub 160 cm (lub mniej)");

            }
        }
    }
}






