public class  FirstClass {
    public static void main(String[] args) {

       Notebook notebook = new Notebook(500, 3000,2000);
        System.out.println(notebook.weight +" "+ notebook.price);
        notebook.chekPrice();

        Notebook heavyNotebook = new Notebook(2000,3500,2010);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.chekPrice();
        Notebook oldNotebook = new Notebook(1000,3500,2012);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.chekPrice();
        notebook.yearPrice();

    }
    }

















