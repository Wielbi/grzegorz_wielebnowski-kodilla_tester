public class Grades {
    private int[] grades;

    private int length;

    public Grades() {
        this.grades = new int[890];
        this.length = 12;

    }

    public void add(int value) {
        if (this.length == 890) {
            return;

        }
        this.grades [this.length]=value;
        this.length++ ;
    }
}


