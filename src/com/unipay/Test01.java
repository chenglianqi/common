package com.unipay;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 23));
        list.add(new Student("zhaosi", 53));
        list.add(new Student("wangwu", 12));
        list.add(new Student("xiaofang", 80));
        list.add(new Student("xiaoliu", 22));

        /*Optional<Student> max = list.stream().max((a,b)->{return a.getAge()-b.getAge();});
        Student student = max.get();
        System.out.println(student);

        Optional<Student> min = list.stream().min((x, y)->x.getAge()-y.getAge());
        Student student1 = min.get();
        System.out.println(student1);*/

        Stream<Student> studentStream = list.stream().filter((a)->a.getName().equals("zhaosi"));

        studentStream.forEach((a)->{System.out.println(a);});

       /* List<Student> collect = studentStream.collect(Collectors.toList());
        collect.forEach(System.out::println);*/


    }

}
