public class Grade {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value) {
        if (this.size == 10) {
            return;

        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int returnTheLastRating() {
        return grades[size - 1];
    }

    public double returnTheAverageOfTheRatings() {
        double sum = 0;
        for (int i = 0; i < size - 1; i++) {
            sum += grades[i];

        }
        return sum/(size - 1);

    }

}
