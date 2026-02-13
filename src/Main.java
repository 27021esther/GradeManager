public class Main {

    public static void main(String[] args) {

        try {

            GradeManager manager = new GradeManager(5);

            manager.addGrade(85);
            manager.addGrade(90);
            manager.addGrade(70);
            manager.addGrade(100);
            manager.addGrade(60);

            manager.displayGrades();

            System.out.println("Average grade: " + manager.calculateAverage());
            System.out.println("Highest grade: " + manager.findHighest());
            System.out.println("Lowest grade: " + manager.findLowest());

            manager.sortGrades();
            System.out.println("Sorted grades:");
            manager.displayGrades();

            int index = manager.searchGrade(90);
            if (index != -1) {
                System.out.println("Grade 90 found at index: " + index);
            } else {
                System.out.println("Grade not found.");
            }

            manager.addGrade(110);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
    }
}
