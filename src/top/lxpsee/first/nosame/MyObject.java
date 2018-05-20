package top.lxpsee.first.nosame;

/**
 * 努力常态化  2018/5/6 13:06
 */
public class MyObject {
    private String userName = "1";
    private String passWord = "11";

    public void setValue(String userName, String passWord) {
        this.userName = userName;

        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("线程a停止");
            Thread.currentThread().suspend();
        }

        this.passWord = passWord;
    }

    public void printUserNameAndPPassword() {
        System.out.println(userName + " : " + passWord);
    }

}
