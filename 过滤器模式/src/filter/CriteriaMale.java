package filter;

import entity.Person;
import 单纯享元.inter.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
