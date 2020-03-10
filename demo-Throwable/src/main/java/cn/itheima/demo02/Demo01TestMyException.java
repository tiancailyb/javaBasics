package main.java.cn.itheima.demo02;

/**
 * @author lyb
 * @date 2020/3/5
 */
public class Demo01TestMyException {
    public static void main(String[] args) {
        System.out.println(MyException.class);
        MyException mye = new MyException();
        System.out.println(mye.getClass());
        int i = 0;
        if (i % 2 == 0) {
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}
