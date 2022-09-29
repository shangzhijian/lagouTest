package S1.M3.T5;

//public class SubPerson extends Person{  //不保留泛型，不指定类型，Person中的泛型为Object类型
//public class SubPerson extends Person<String>{  //不保留泛型，指定泛型类型为String
//public class SubPerson<T> extends Person<T>{  //保留父类泛型，可以构造对象时指定T的类型
public class SubPerson<T,E> extends Person<T>{  //保留父类泛型，同时在子类中增加新的泛型
}
