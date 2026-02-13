public class GradeManager {

    private int[] grades;
    private int count;

    public GradeManager(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0.");
        }
        grades = new int[size];
        count = 0;
    }

    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }

        if (count >= grades.length) {
            throw new ArrayIndexOutOfBoundsException("Grade list is full.");
        }

        grades[count] = grade;
        count++;
    }

    public void displayGrades() {
        System.out.println("Grades:");
        for (int i = 0; i < count; i++) {
            System.out.println(grades[i]);
        }
    }

    public double calculateAverage() {
        if (count == 0) {
            throw new IllegalArgumentException("No grades available.");
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }

        return (double) sum / count;
    }

    public int findHighest() {
        if (count == 0) {
            throw new IllegalArgumentException("No grades available.");
        }

        int highest = grades[0];

        for (int i = 1; i < count; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }

        return highest;
    }

    public int findLowest() {
        if (count == 0) {
            throw new IllegalArgumentException("No grades available.");
        }

        int lowest = grades[0];

        for (int i = 1; i < count; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        return lowest;
    }

    public void sortGrades() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (grades[j] > grades[j + 1]) {
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }
    }

    public int searchGrade(int grade) {
        for (int i = 0; i < count; i++) {
            if (grades[i] == grade) {
                return i;
            }
        }
        return -1;
    }
}
