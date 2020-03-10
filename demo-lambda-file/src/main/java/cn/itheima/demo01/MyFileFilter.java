package main.java.cn.itheima.demo01;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Filter;

/**
 * @author lyb
 * @date 2020/3/6
 */
public class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory() || pathname.getName().endsWith(".java");
    }
}
