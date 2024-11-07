package DataTypes.Arrays.ArrayOfObject;

public class ArraysOfStudents {
    public static void main(String[] args) {
        Student student1 = new Student("Mirov Akram",18,3);
        Student student2 = new Student("Saddam Atoev",19,4);
        Student student3 = new Student("Rustam Jumaev",20,5);

        //#1
        Student studentsArray[] = {student1,student2,student3};

        //#2
        Student studentsArray2[] = new Student[3];
        studentsArray2[0] = student1;
        studentsArray2[1] = student2;
        studentsArray2[2] = student3;
        System.out.println(studentsArray2[0].name);



        for (Student student: studentsArray){
            System.out.println("--------------------------");
            System.out.println("Name : " + student.name);
            System.out.println("Age : " + student.age);
            System.out.println("Grade : " + student.grade);
            System.out.println("--------------------------");
        }
    }
}
