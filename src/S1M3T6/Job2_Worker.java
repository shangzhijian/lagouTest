package S1M3T6;

import java.util.Objects;

public class Job2_Worker {

    private String name;
    private int age;
    private double salary;

    public Job2_Worker() {
    }

    public Job2_Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(this.getName() + " 正在工作");
    }

    @Override
    public String toString() {
        return "Job2_Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) return true;
        if (null == o || this.getClass() != o.getClass()) return false;

        Job2_Worker jw = (Job2_Worker)o;
        return (this.getName().equals(jw.getName()) )&&
                (this.getAge() == ((Job2_Worker) o).getAge()) &&
                (Double.valueOf(this.getSalary()).equals(jw.getSalary()));

    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job2_Worker that = (Job2_Worker) o;
        return age == that.age &&
                Double.compare(that.salary, salary) == 0 &&
                Objects.equals(name, that.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }
}
