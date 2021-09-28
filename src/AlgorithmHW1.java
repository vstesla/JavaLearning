/**
 * 第一次算法课作业
 */

import java.util.*;

public class AlgorithmHW1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");

        Iterator<String> it = queue.iterator();

        System.out.println("Queue:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Stack<String> st = new Stack<String>();
        for (int i = 0; i < 5; i++)
            st.push("a = " + i);
//        st.push("1");//压入元素
//        st.push("2");
//        st.push("3");
//        st.push("4");
//        st.push("5");

        Iterator<String> its = st.iterator();

        System.out.println("Stack:");

        while (its.hasNext()) {
            System.out.println(its.next());
        }
    }
}


