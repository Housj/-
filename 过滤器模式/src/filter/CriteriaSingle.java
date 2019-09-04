package filter;

import entity.Person;
import 单纯享元.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
