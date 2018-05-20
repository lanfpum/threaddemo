package top.lxpsee.first.login;

/**
 * 努力常态化  2018/4/25 22:43
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
