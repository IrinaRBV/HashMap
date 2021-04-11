import java.util.List;
import java.util.Set;

public interface HashMapI {
    void put(Person key, Company value);
    Company get(Person key);
    Set<Person> keySet();
    List<Company> values();
    boolean remove(Person key);
    int size();
    void clear();
}
