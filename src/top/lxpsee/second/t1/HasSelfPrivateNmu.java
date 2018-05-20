package top.lxpsee.second.t1;

/**
 * 努力常态化  2018/5/6 15:24
 */
public class HasSelfPrivateNmu {
    public void addI(String userName) {
        try {
            int num = 0;

            if (userName.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }

            System.out.println(userName + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
