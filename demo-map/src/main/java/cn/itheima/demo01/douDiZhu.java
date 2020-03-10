package main.java.cn.itheima.demo01;

import java.awt.*;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

/**
 * @author lyb
 * @date 2020/3/3
 */
public class douDiZhu {
    public static void main(String[] args) {

        //1. 准备拍
        List<Integer> indexList = new ArrayList<>();
        HashMap<Integer, String> poker = new HashMap<>();

        List<String> colors = new ArrayList<>();
        Collections.addAll(colors, "♥", "♠", "♣", "♦");
        List<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, "2","A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        Integer index = 0;
        indexList.add(index);
        poker.put(index, "大王");
        index += 1;
        indexList.add(index);
        poker.put(index, "小王");
        index += 1;
        for (String color: colors) {
            for (String number : numbers) {
                indexList.add(index);
                poker.put(index, color + number);
                index++;
            }
        }
        System.out.println(indexList);
        //System.out.println(poker);*/
        //2. 洗牌
        Collections.shuffle(indexList);
        //System.out.println(indexList);

        //3. 发牌
        List<Integer> 刘德华 = new ArrayList<>();
        List<Integer> 周润发 = new ArrayList<>();
        List<Integer> 周星驰 = new ArrayList<>();
        List<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < indexList.size(); i++) {
            Integer in = indexList.get(i);
            if (i >= 51) {
                diPai.add(in);
            } else {
                if (i % 3 == 0) {
                    刘德华.add(in);
                } else if(i % 3 == 1) {
                    周润发.add(in);
                } else if (i % 3 == 2) {
                    周星驰.add(in);
                }
            }
        }

        /*System.out.println(刘德华);
        System.out.println(周润发);
        System.out.println(周星驰);
        System.out.println(diPai);*/

        //4. 看牌
        // name, HashMap poker
        System.out.println(loopPoker(周润发, poker));
        System.out.println(loopPoker(刘德华, poker));
        System.out.println(loopPoker(周星驰, poker));
        System.out.println(loopPoker(diPai, poker));

    }

    public static List<String> loopPoker(List<Integer> list, HashMap<Integer, String> hashMap) {
        List<String> sortPoker = new ArrayList<>();
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer integer : list) {
            sortPoker.add(hashMap.get(integer));
        }

        return sortPoker;
    }
}
