public class Notebook {
    int weight;
    int price;



    public Notebook(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public void checkPrice() {

        if (this.price < 500) {
            System.out.println("The computer is too light.");

            if ((this.price >= 600) && (this.price <= 1000)) {
                System.out.println("The computer is too heavy.");

                if (this.price > 1800) {
                    System.out.println("The computer is very heavy.");
                }
            }
        } else {
            System.out.println(" The computer is quite light by weight.");


        }

    }



}
















