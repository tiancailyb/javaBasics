package main.java.cn.itheima.demo01;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyb
 * @date 2020/3/6
 */
public class Demo01OutputStream {
    public static void main(String[] args) {
        FileOutputStream fso = null;
        try {
            fso = new FileOutputStream("b.txt");
            fso.write(88);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fso != null) {
                try {
                    fso.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
