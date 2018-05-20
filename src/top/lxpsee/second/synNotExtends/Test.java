package top.lxpsee.second.synNotExtends;

/**
 * 努力常态化  2018/5/20 17:26
 */
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();

        ThreadA a = new ThreadA(sub);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(sub);
        b.setName("B");
        b.start();
    }

}
