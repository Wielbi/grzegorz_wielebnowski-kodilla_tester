public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void chekPrice() {
        if (this.price <= 900) {
            System.out.println("This notebook is cheap.");
        }
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        }
        if (this.price <= 1000) {
            System.out.println("This notebook is expensive.");

        } else {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {

        if (this.weight <= 600) {
            System.out.println("The computer is too light");

        }
        if (this.weight > 1200 && this.weight < 2000) {

            System.out.println("The weight of the computer is just right ");
        }
        if (this.weight <= 2000) {

            System.out.println("The computer is too heavy");

        } else {
            System.out.println();

        }

    }

    public void yearPrice() {
        if (this.price > 1200 && this.year == 2010) {
            System.out.println("This laptop is cheap compared to the year of production");
        } else {
            System.out.println("This laptop is too expensive and too old");
        }
    }
}


















