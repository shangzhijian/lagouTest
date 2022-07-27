package S1M4T1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) /*throws AgeException*/{
        setName(name);
        setAge(age);
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

    public void setAge(int age) /*throws AgeException*/{
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            try {
                throw new AgeException("年龄不合理！！");
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
