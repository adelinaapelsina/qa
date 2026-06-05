package Lesson6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Максим", "182", 3, Arrays.asList(5, 5, 5, 5)));

        students.add(new Student("Аделина", "182", 4, Arrays.asList(5,4,3,2)));

        students.add(new Student("Марк", "165", 2, Arrays.asList(2,2,2,2)));

        students.add(new Student("Миша", "165", 1, Arrays.asList(4,3,2,2)));

        removeBadStudents(students);
        promoteStudents(students);
        pringStudents(students, 2);
    }

    public static void removeBadStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() >3) {
                iterator.remove();
            }
        }
    }
    public static void promoteStudents(Set<Student> students) {
        for(Student student : students) {
            if(student.getAverageGrade() >=3) {
                student.setCourse(student.getCourse() +1);
            }
        }
    }
    public static void pringStudents(Set<Student> students, int course) {
        System.out.println("Курс: " + course);
        for (Student student: students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

