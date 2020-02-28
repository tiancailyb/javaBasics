package cn.itcast.day08.demo01;

/**
 * @author lyb
 * @date 2020/2/26
 */
public class Demo06StringPractice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String str = fromArrayToString(array);
        System.out.println(str);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }

        }
        return str;
    }
}
