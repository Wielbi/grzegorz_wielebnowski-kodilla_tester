public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 3000, 2000);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.chekPrice();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(600, 3500, 2010);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.chekPrice();
        Notebook oldNotebook = new Notebook(600, 3500, 2012);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.chekPrice();
        notebook.yearPrice();


    }
}

















