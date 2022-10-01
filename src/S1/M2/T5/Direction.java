package S1.M2.T5;
/**
 * 编程实现所有方向的枚举，所有的方向：向上、向下、向左、向右
 */
public class Direction {

    //2.1 成员变量用private final修饰
    private final String desc;

    //1 私有化构造方法
    private Direction(String desc) {
        this.desc = desc;
    }
    //2.2 引用变量 用 public static final修饰
    // Direction类型引用指向 本类类型对象
    public static final Direction UP = new Direction("向上");
    public static final Direction DOWN = new Direction("向下");
    public static final Direction LEFT = new Direction("向左");
    public static final Direction RIGHT = new Direction("向右");

    //3 公有的get方法获取
    public String getDesc() {
        return desc;
    }
}
