package Domain;

import Services.TeacherService;
import Services.iPersonService;

public class Teacher extends WorkingPerson{
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
