package thread;
//AtomicInteger关键字
import java.util.concurrent.atomic.AtomicInteger;

public class test2_3 {
	private static AtomicInteger count = new AtomicInteger(0);

    public static void increment() {
        count.getAndIncrement();
    }
    
    public static void main(String[] args) {
        final test2_3 test2_3 = new test2_3();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test2_3.increment();
                };
            }.start();
        }
 
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test2_3.count);
    }
}
