package lab;
import java.util.Random;
import static java.util.Arrays.sort;
public class first {
        public static void main(String[] args) {
            Student[] students1 = getStudents(5);
            insertionSort(students1);
            for (Object student : students1)
                System.out.println(student);
            Student[] students2 = getStudents(5);
            sort(students2, new GPA());
            System.out.println('\n');
            for (Object student : students2) // вывод результата
                System.out.println(student);

        }
        public static Student[] getStudents(int size) {
            Student[] students = new Student[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                students[i] = new Student();
                students[i].setIdNumber(random.nextInt(100));
                students[i].setGPA(random.nextInt(4) + 2);
            }
            return students;
        }

        //сортировка вставками
        public static void insertionSort(Student[] students) {
            for (int i = 0; i < students.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (students[j].compareTo(students[j - 1]) > 0) {
                        Student tmp = students[j];
                        students[j] = students[j - 1];
                        students[j - 1] = tmp;
                    }
                }
            }
        }
}
