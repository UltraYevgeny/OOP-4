package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;
import Domain.Teacher;

/**
 * @author Пинжин Евгений Иванович
 * @version 1.1
 * @apiNote Класс сортирующий учителей по имени
 */
public class TeacherService implements iPersonService<Teacher> {
     private List<Teacher> teachers;


    /**
     * @apiNote конструктор создающий пустой список для учителей
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
       Teacher teach = new Teacher(name, age, "1st");
       //count++;
       teachers.add(teach);
    }

    public void sortByFIO()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}
