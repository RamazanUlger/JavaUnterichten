package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
       /*
       LinkedList'in 2 tane parent Interface'i vardir
       LinkedList olarak data turu olarak ;
       LinkedList'i secersek :
        */
        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10);

        /*
        Sadece list Interface'inden ozellikler kullanmak istersek

         */
        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(10);

        Deque<Integer> ll3=new LinkedList<>();
        ll3.addFirst(10);
        ll3.addLast(15);
        ll3.addLast(35);
        System.out.println(ll3);
    }
}
