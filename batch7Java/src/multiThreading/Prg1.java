package multiThreading;

public class Prg1 {
    public static void main(String[] args) throws Exception {
        System.out.println("main started");
        System.out.println(Thread.currentThread());
        Thread t = Thread.currentThread();
        t.setName("main bhavith thread");
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println("main ended");
    }
}
/**
 * multi threading
 * its nothing bt multiple processes
 * Thread t=Thread.currentThread();
 * 1.setName,setPriority
 * 2.sleep(u have to handle exception)
 * 3.creating a threading
 * =>to make ur class as thread
 * =>u have to write code in run()
 * =>u have to use start() to start multiThreading
 * 4.isAlive()
 * 5.join()
 * 6.can u achieve multiThreading with single run method
 * 7.runnable Interface
 * => it should implement runnable Interface
 * =>u have create object for threading
 * => u have to pass the runnable object to thread
 * =>along with object u can also pass name
 * 8.synchronized
 * 
 */
