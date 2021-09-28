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

        Iterator<String> it1 = queue.iterator();
        System.out.println("Queue:");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


        Stack<String> st = new Stack<String>();
        for (int i = 0; i < 5; i++)
            st.push("a = " + i);
//        st.push("1");//压入元素
//        st.push("2");
//        st.push("3");
//        st.push("4");
//        st.push("5");
        Iterator<String> it2 = st.iterator();
        System.out.println("Stack:");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}



