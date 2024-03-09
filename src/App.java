import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");

        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t1);
        listTeach.add(t2);

        System.out.println(new PersonComparator<Student>().compare(s1, s3));
        // System.out.println(new PersonComparator<Student>().compare(s1, s5));

        Employee e1 = new Employee("Сергей", 55, "Разнорабочий");

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(e1, 50000);

        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 20000);

        // создаем список учителей в класе для сортировки по имени
        TeacherService ts1 = new TeacherService();
        ts1.create("Ипахондрий", 99);
        ts1.create(t1.getName(), t1.getAge());
        ts1.create(t2.getName(), t2.getAge());

        System.out.println("\nОтсартированный список учителей по имени:");
        ts1.sortByFIO();
        System.out.println(ts1.getAll());

        // подсчет среденего возраста людей в списке
        System.out.println("\nСредний возраст: " + AccountController.averageAge(listStud));

    }
}
