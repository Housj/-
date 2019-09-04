package 单纯享元.inter;

import entity.Person;

import java.util.List;

/**
 * @author sergei
 * @create 2019-09-02
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
