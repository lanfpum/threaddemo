package top.lxpsee.second.t3;

/**
 * 努力常态化  2018/5/6 17:34
 */
public class Run {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA a = new ThreadA(publicVar);
            a.setName("a");
            a.start();
            Thread.sleep(200);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
