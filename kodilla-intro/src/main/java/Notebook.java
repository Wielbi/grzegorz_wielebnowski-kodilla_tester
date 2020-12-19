public class Notebook {
    int price;
    int year;
    int weight;



    public Notebook(int price, int year, int weight) {
        this.price = price;
        this.year = year;
        this.weight = weight;

    }

    public void checkPrice() {

        if (this.price < 130) {
            System.out.println("The computer is old.");
        }

        if (this.year == 2000) {
            System.out.println("The computer is too old.");
        }
        if (150 > this.weight) {
            System.out.println("The computer is quite light");
        }
        if (this.price > 100) {
            System.out.println("The computer is expensive .");

            if (this.price < 200) {
                System.out.println(" The computer is priced right for its year of manufacture ");

            }
        } else {
            System.out.println("Ten komputer jest zbyt stary i cieżki");


        }
    }

    public void checkWeight() {

        if (this.weight > 3000 ){
            System.out.println("Komputer jest za cieżki");
        }

        if (this.weight <= 3000 && this.weight > 1000){
            System.out.println("Waga komputera jest w sam raz");
        }
        if (this.weight <= 1000){
            System.out.println("Komputer jest lekki");
        }

    }
}

















