package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 优先级队列
        PriorityQueue<ComparePriority> queue = new PriorityQueue<>();
        String[] arr1 = sc.nextLine().split(",");
        for (int i = 0; i < arr1.length; i++) {
            String arr2 = arr1[i].replace("(", "").replace(")", "");
            String[] arr3 = arr2.split(":");
            // 数据
            int data = Integer.valueOf(arr3[0]);
            // 优先级
            int priority = Integer.valueOf(arr3[1]);
            /**
             * 实现一个支持优先级的队列，高优先级先出队列，同优先级时先进先出。
             * 如果两个输入数据和优先级都相同，则后一个数据不入队列被丢弃。
             */
            ComparePriority comparePriority = new ComparePriority(data, priority);
            queue.add(comparePriority);
        }

        List<Integer> list = new ArrayList<>();
        ComparePriority comparePriority = queue.poll();
        while (comparePriority != null) {
            if (!comparePriority.equals(queue.peek())) {
                list.add(comparePriority.data);
            }
            comparePriority = queue.poll();
        }

        System.out.println(list);
    }

    /**
     * 实现一个支持优先级的队列，高优先级先出队列，同优先级时先进先出。
     *
     * 如果两个输入数据和优先级都相同，则后一个数据不入队列被丢弃。
     */
    static class ComparePriority implements Comparable<ComparePriority> {

        int data;
        int priority;

        public ComparePriority(int data, int priority) {
            this.data = data;
            this.priority = priority;
        }

        /**
         * 比较优先级
         */
        @Override
        public int compareTo(ComparePriority o) {
            return o.priority - this.priority;
        }

        /**
         * 如果两个输入数据和优先级都相同，则后一个数据不入队列被丢弃。
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ComparePriority comparePriority = (ComparePriority) o;
            return data == comparePriority.data && priority == comparePriority.priority;
        }
    }

}
