package S1.M2.T3.JavaTest.src.com.lagou.task09;

public class Man implements Hunter {
    @Override
    public void hunt() {
        System.out.println("捕猎ing");
    }

    @Override
    public void run() {
        System.out.println("奔跑ing");
    }

    public static void main(String[] args) {

        Runner r = new Man();
        r.run();

        Hunter h = new Man();
        h.hunt();


    }
}
