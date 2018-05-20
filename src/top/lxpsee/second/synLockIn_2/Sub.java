package top.lxpsee.second.synLockIn_2;

/**
 * 努力常态化  2018/5/20 15:58
 */
public class Sub extends Main {

    synchronized public void operateISubMethod() {

        try {
            while (i > 0) {
                i--;
                System.out.println("Sub print I = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
