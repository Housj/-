package filter;

import entity.Person;
import 单纯享元.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
