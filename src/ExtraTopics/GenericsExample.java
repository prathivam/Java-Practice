package ExtraTopics;

public class GenericsExample<T> {
    T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return this.value;
    }
}
