package Controllers;

import java.util.List;

import Domain.Person;
import Domain.WorkingPerson;

public class AccountController {

    public static <T extends WorkingPerson> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge ---- Реализована
    /**
     * @param persons
     * @return double, средний возраст людей в списке
     */
    public static <T extends Person> double averageAge(List<T> persons){
        double sumAge = 0;
        for (int i = 0; i < persons.size(); i++) {
            sumAge = sumAge + persons.get(i).getAge();
        }
        return sumAge/persons.size();
    }
}
