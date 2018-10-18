package lab1;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("name1", 9);
        Student stud2 = new Student("name2", 10);
        Student stud3 = new Student("name3", 7);
        Student stud4 = new Student("name4", 8);
        Student stud5 = new Student("name5", 8);
        Student stud6 = new Student("name6", 5);
        Student stud7 = new Student("name7", 6);

        University univ1 = new University("Univ1");
        univ1.addStudent(stud1);
        univ1.addStudent(stud2);
        univ1.addStudent(stud3);

        University univ2 = new University("Univ2");
        univ2.addStudent(stud4);
        univ2.addStudent(stud5);
        univ2.addStudent(stud6);
        univ2.addStudent(stud7);

        float average = (univ1.getStudentsAverage() + univ2.getStudentsAverage()) / 2;
        System.out.println(String.format("Students average: %.2f", average));
    }
}
