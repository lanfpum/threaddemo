package top.lxpsee;

import top.lxpsee.first.Mythread;

public class Main {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        Thread a = new Thread(mythread);
        Thread b = new Thread(mythread);
        Thread c = new Thread(mythread);

        a.start();
        b.start();
        c.start();

    }
}
