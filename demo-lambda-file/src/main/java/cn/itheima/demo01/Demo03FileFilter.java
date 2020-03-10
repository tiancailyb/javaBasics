package main.java.cn.itheima.demo01;

import java.io.File;
import java.io.FileFilter;

/**
 * @author lyb
 * @date 2020/3/6
 */
public class Demo03FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\java_project\\testCheckOut");

        getAllFiles(file);
    }

    private static void getAllFiles(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File file1: files) {
            if (file1.isDirectory()) {
                getAllFiles(file1);
            } else {
                System.out.println(file1.getName());
            }
        }
    }
}
