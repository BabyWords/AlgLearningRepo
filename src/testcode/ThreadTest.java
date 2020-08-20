package testcode;

public class ThreadTest {
    public static void main(String[] args) {
        Solutions solutions=new Solutions();
        solutions.test();
    }
}
class Solutions{
    public void test(){
        for (int i=0;i<10;i++){
            Thread thread = new Thread(()->{
                System.out.println(System.currentTimeMillis());
            });
            thread.start();

        }
    }

}