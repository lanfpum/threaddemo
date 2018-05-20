package top.lxpsee.second.synBlockString;

/**
 * 努力常态化  2018/5/20 22:22
 */
public class Service {
    private String userName;
    private String password;

    public void setUserNamePassword(String userName, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("thread  name :" + Thread.currentThread().getName() + ", in time :" + System.currentTimeMillis()
                        + " come to synchronized block!");
                this.userName = userName;
                Thread.sleep(3000);
                this.password = password;
                System.out.println("thread  name :" + Thread.currentThread().getName() + ", in time :" + System.currentTimeMillis()
                        + " left for synchronized block!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
