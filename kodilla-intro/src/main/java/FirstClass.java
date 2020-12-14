public class  FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook( 100 ,2000);
        System.out.println( notebook.year + " " + notebook.price );
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook ( 1500 , 2020);
        System.out.println (heavyNotebook.year + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();


        Notebook oldNotebook = new Notebook (2000, 2021);
        System.out.println (oldNotebook.year + " " + oldNotebook.price);
        oldNotebook.checkPrice();










}
    }

















