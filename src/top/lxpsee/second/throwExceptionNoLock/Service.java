package top.lxpsee.second.throwExceptionNoLock;

/**
 * 努力常态化  2018/5/20 16:21
 */
public class Service {
    synchronized public void testMethod() {
        if ("a".equals(Thread.currentThread().getName())) {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " run begin Time =" + System.currentTimeMillis());
            int i = 1;

            while (i == 1) {
                if ("0.123456".equals(("" + Math.random()).substring(0, 8))) {
                    System.out.println("ThreadName = " + Thread.currentThread().getName()
                            + " run Exception Time= " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run Time =" + System.currentTimeMillis());
        }
    }

}
