package main.java.cn.itheima.demo01;

import java.io.File;

/**
 * @author lyb
 * @date 2020/3/6
 */
public class Demo05FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\java_project\\testCheckOut");

        getAllFiles(file);
    }

    private static void getAllFiles(File file) {
        File[] files = file.listFiles((pathname) ->
                pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java")
        );
        for (File file1: files) {
            if (file1.isDirectory()) {
                getAllFiles(file1);
            } else {
                System.out.println(file1.getName());
            }
        }
    }
}
