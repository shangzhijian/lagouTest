package S1M3T5;

public class TestGeneric {

    public static void main(String[] args) {

        TestG<Double> t = new TestG(true);
        System.out.println("--------------------------");

        System.out.println(t.TestG("string"));     //返回的是实参的数据类型

        Double show = t.show();    //返回值就是Double
    }
}
class TestG<T> {//泛型类

    private T sex;

    <E>TestG(E x) {//泛型方法
        System.out.println(x);
        System.out.println(x.getClass().toString());
    }
    //泛型方法
    public <T> String TestG(T x) {
        return x.getClass().toString();
    }

    public T show(){
        return sex;
    }
}
