package S1M3T5;

public class Person<T> {

    private String name;
    private int age;
    private T gender;
    private boolean x;

    public Person(){

    }

    public Person(String name, int age, T gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", x=" + x +
                '}';
    }

    // 自定义方法实现将参数指定数组中的所有元素打印出来
    public static <E> void printArray(E[] arr) {
        for (E e : arr) {
            System.out.println("e = " + e);
        }
    }
}
