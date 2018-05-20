package top.lxpsee.first.login;

/**
 * 努力常态化  2018/4/25 22:42
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aaa");
    }
}
