package grades;
import java.util.ArrayList;
import java.util.HashMap;
public class Student {

    public Student() {
    }

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;

        grades = new ArrayList<>();
    }


    // TODO: returns the student's name
    public String getName(){
        return name;
    }

    // TODO: adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // TODO: returns the average of the students grades
    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfGrades = 0;
        double average;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        average = sumOfGrades / numberOfGrades;
        return average;
    }


        public static void main(String[] arg){



            Student Alex = new Student("Alex");
            Student Bill = new Student("Bill");
            System.out.println("Alex");
            System.out.println("The number of elements in the grades array is " + Alex.grades.size());

            System.out.println("This weeks grades for Alex: a 85, a 95, and an 100");
            Alex.addGrade(85);
            Alex.addGrade(95);
            Alex.addGrade(100);
            System.out.println("My weeks average is " + Alex.getGradeAverage());
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("Bill");
            System.out.println("This weeks grades for Bill: a 65, a 75, and an 74");
            Bill.addGrade(65);
            Bill.addGrade(75);
            Bill.addGrade(74);
            System.out.println("This is a version where i place the Name.grades.size() after the Name.addGrade() were run.");
            System.out.println("The number of elements in the grades array is " + Bill.grades.size());
            System.out.println("My weeks average is " + Bill.getGradeAverage());


        }


}


