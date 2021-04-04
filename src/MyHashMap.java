public class MyHashMap {
    private MyHashMap key;
    private MyHashMap value;

    public MyHashMap(MyHashMap key, MyHashMap value) {
        this.key = key;
        this.value = value;
    }

    public MyHashMap getKey() {
        return key;
    }

    public MyHashMap getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
