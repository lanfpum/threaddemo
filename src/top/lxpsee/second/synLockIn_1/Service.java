package top.lxpsee.second.synLockIn_1;

/**
 * 努力常态化  2018/5/20 15:43
 */
public class Service {

    synchronized public void service1() {
        System.out.println("service1()");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2()");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3()");
    }
}
