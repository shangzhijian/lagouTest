/*银行有 定期账户和活期账户。继承自 账户类。账户类中：
        public class Accountí
        private double money;
        public double getlixi()   ======>因为不能确定活期和定期利息计算，所以只能是抽象方法
*/

package S1M2T3.JavaTest.src.com.lagou.task09;

public abstract class Account {

    private double money;

    public Account() {}

    public Account(double money) {
        setMoney(money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money){
        if(money > 0 ) {
            this.money = money;
        } else {
            System.out.println("金额出错！！！");
        }
    }

    //自定义抽象方法实现计算利息并返回的功能
    public abstract double getLixi();
}
