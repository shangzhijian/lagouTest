package S1M3T6;

import java.util.Objects;

public class Job3_Student {

    private String name;
    private int age;

    public Job3_Student() {
    }

    public Job3_Student(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ",age=" + age +
                '}';
    }
}
