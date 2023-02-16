package com.freedom.demo.java8;

import lombok.Data;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description: 
 * @version 1.0
 * @author huzhibo
 * @date 2022/6/30 14:09
 */
public class SteamDemo {

    private static final List<String> LIST = Arrays.asList("张三", "李四", "王五", "刘麻子");
    private static final List<Double> DOUBLE_LIST = Arrays.asList(1.2, 2.4, 40.1, 1022.1);

    private static final List<Student> STUDENT_LIST = Arrays.asList(new Student("张三", 10, BigDecimal.valueOf(9.9)),
            new Student("李四", 50, BigDecimal.valueOf(50)),
            new Student("王五", 30, BigDecimal.valueOf(10000)),
            new Student("刘麻子", 22, BigDecimal.valueOf(-100))
    );

    public static void main(String[] args) {
        System.out.println(STUDENT_LIST.stream().filter(student -> student.getAge() > 1000)
                .map(Student::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add));
    }

    /**
     * Description: 过滤操作
     * @author huzhibo
     * @date 2022/7/4 18:37
     */
    private static void filtration() {
        //过滤
        List<String> collect = LIST.stream().filter(str -> str.length() < 3).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("====================================================================");
        //过滤如果没有返回默认
        String find = LIST.stream().filter(str -> str.length() > 1).findAny().orElse("未找到");
        System.out.println(find);
    }

    /**
     * Description: 汇总操作
     * @author huzhibo
     * @date 2022/7/4 18:45
     */
    private static void collect() {
        //int格式聚合
        int sum = STUDENT_LIST.stream().mapToInt(Student::getAge).sum();
        System.out.println("聚合int：" + sum);
        System.out.println("====================================================================");
        //BigDecimal格式聚合
        BigDecimal reduce = STUDENT_LIST.stream().map(Student::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("聚合BigDecimal：" + reduce);
        System.out.println("====================================================================");
        //多个集合合并
        List<Student> students = Collections.singletonList(new Student("胡汉三", 10, BigDecimal.valueOf(800)));
        Stream<List<Student>> studentList = Stream.of(STUDENT_LIST, students, new ArrayList<>());
        List<Student> collect = studentList.flatMap(List::stream).collect(Collectors.toList());

        //并行流根据条件统计个数
        long count = STUDENT_LIST.parallelStream().filter(student -> student.getAge() > 18).count();
        System.out.println("成年人的个数未：" + count);

        //条件聚合字符串
        String aggregateString = LIST.stream().filter(string -> !StringUtils.isEmpty(string)).collect(Collectors.joining(", "));
        System.out.println("聚合字符串：" + aggregateString);

        //最小值
        Double min = DOUBLE_LIST.stream().reduce(Double.MAX_VALUE, Double::min);
        System.out.println("最小值：" + min);


        /*
         *  IntSummaryStatistics 用于收集统计信息(如count、min、max、sum和average)的状态对象。
         */
        List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 9);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

    }

    /**
     * Description: 条件判断
     * @author huzhibo
     * @date 2022/7/5 9:36
     */
    private static void condition() {
        boolean all = STUDENT_LIST.stream().allMatch(u -> u.getBalance().compareTo(BigDecimal.valueOf(100)) > 0);
        System.out.println("余额是否都大于100:" + all);
        boolean any = STUDENT_LIST.stream().anyMatch(u -> u.getBalance().compareTo(BigDecimal.valueOf(100)) > 0);
        System.out.println("是否有一个余额大于100:" + any);
        boolean none = STUDENT_LIST.stream().noneMatch(u -> u.getBalance().compareTo(BigDecimal.valueOf(100)) > 0);
        System.out.println("是否没有一个余额大于100的:" + none);
    }

    /**
     * Description: 分组操作
     * @author huzhibo
     * @date 2022/7/5 9:56
     */
    private static void grouping() {
        //单纯分组(根据年龄分组)
        Map<Integer, List<Student>> personGroups = STUDENT_LIST.stream()
                .collect(Collectors.groupingBy(Student::getAge));
        Map<String, Student> collect = STUDENT_LIST.stream().
                collect(Collectors.toMap(Student::getName, Function.identity(), (esb1, esb2) -> esb1));
        List<Student> studentList = new ArrayList<>();

        //自定义条件型key分组
        Map<Boolean, List<Student>> children =  STUDENT_LIST.stream().collect(Collectors.partitioningBy(p -> p.getAge() < 18));
        System.out.println("小孩: " + children.get(true));
        System.out.println("成年人: " + children.get(false));

    }

    /**
     * Description: 其他操作
     * @author huzhibo
     * @date 2022/7/5 9:55
     */
    private static void other() {
        /*
         * iterate iterate 跟 reduce 操作很像，接受一个种子值，和一个 UnaryOperator（例如 f）。
         * 然后种子值成为 Stream 的第一个元素，f(seed) 为第二个，f(f(seed)) 第三个，以此类推。 在 iterate
         * 时候管道必须有 limit 这样的操作来限制 Stream 大小。
         */
        System.out.println("从2开始生成一个等差队列:");
        List<Integer> integers = Stream.iterate(2, n -> n + 2).limit(5).collect(Collectors.toList());
    }
    //汇总
    private void test(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三",18, new BigDecimal("60.50")));
        list.add(new Student("张三",18,  new BigDecimal("30.50")));
        list.add(new Student( "张三",18,  new BigDecimal("90.50")));
        list.add(new Student("李四",19,  new BigDecimal("80.50")));

        List<Student> studentList = new ArrayList<>();
        list.parallelStream().collect(Collectors.groupingBy(o -> (o.getName() + o.getAge()), Collectors.toList())).forEach((id, transfer) -> {
            transfer.stream().reduce((a, b) -> new Student(a.getName(), a.getAge(), a.getBalance().add(b.getBalance()))).ifPresent(studentList::add);
        });
    }
}
@Data
class Student {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 银行卡余额
     */
    private BigDecimal balance;

    public Student(String name, int age, BigDecimal balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public Student() {
    }
}

