package projeto1;

import java.util.LinkedHashMap;


public interface FrequencyCounter <Type> {
    public void increment_count(Type obj);
    public LinkedHashMap<Type, Integer> sorted();
}
