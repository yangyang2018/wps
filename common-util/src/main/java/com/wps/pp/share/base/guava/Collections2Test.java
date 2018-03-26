package com.wps.pp.share.base.guava;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Created by yy on 2018/3/26.
 */
public class Collections2Test {

    /*过滤*/
    public static void filter() {
        List<String> list = Lists.newArrayList(null, "abcdef", null, "leveluplunch", "com", null);
        Collection<String> c = Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                if (input != null && input.length() > 5)
                    return true;
                return false;
            }
        });
        System.out.println(list);
        System.out.println(c);
        c.remove("abcdef");
        c.remove("leveluplunch");
        System.out.println(list);
        System.out.println(c);
    }

    /*转换*/
    public static void transform() {

        List<String> numbersAsStrings = Lists.newArrayList("1", "2", "3");

        Collection<Double> doubles = Collections2.transform(
                numbersAsStrings, new Function<String, Double>() {
                    @Override
                    public Double apply(String input) {
                        return new Double(input) + 0.1;
                    }
                });
        System.out.println(doubles);
//         doubles.add(8.8); // UnsupportedOperationException
        System.out.println(numbersAsStrings);
    }

    /*排列*/
    public static void testCoolections2(){

        List<Integer> vals = Lists.newArrayList(1, 2, 3);

        Collection<List<Integer>> orderPerm = Collections2.orderedPermutations(vals, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(orderPerm.size());
        for (List<Integer> i : orderPerm) {
            System.out.println(i);
        }

    }
    /*排列*/
    public static void testCoolections3(){

        List<Integer> vals = Lists.newArrayList(1, 2, 3);

        Collection<List<Integer>> orderPerm = Collections2.permutations(vals);
        for (List<Integer> i : orderPerm) {
            System.out.println(i);
        }




    }

    public static void main(String[] args) {

        testCoolections2();
//        testCoolections3();

//        filter();

//        transform();
    }




}