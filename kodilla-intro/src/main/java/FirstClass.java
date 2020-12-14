public class  FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook( 100 ,2000,  150 );
        System.out.println( notebook.year + " " + notebook.price + " " + notebook.weight );
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook ( 100 , 2000, 200 );
        System.out.println (heavyNotebook.year + " " + heavyNotebook.price + " "+ heavyNotebook.weight);
        heavyNotebook.checkPrice();


        Notebook oldNotebook = new Notebook (200, 2000,100  );
        System.out.println (oldNotebook.year + " " + oldNotebook.price + " " +notebook.weight  );
        oldNotebook.checkPrice();










}
    }

















