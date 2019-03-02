public class ThreadsTest {
    public static void main(String[] args) {

//        Wat1 wat1=new Wat1();
//        Wat2 wat2=new Wat2();

        new Wat1().run();
        new Wat2().run();

        System.out.println("********");

        Thread t1 = new Thread(new Wat1());
        Thread t2 = new Thread(new Wat2());
        t1.start();
        t2.start();
    }
}
