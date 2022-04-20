package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> llist=new LinkedList<>();
       // System.out.println(llist.element());//.NoSuchElementException verir
        System.out.println(llist.peek());//null dondurur cunku bos
        System.out.println(llist.poll());//null dondurur cunku bos
        llist.pollFirst();//null donduruyor cunku bos
        llist.pollLast();//null dondurur cunku bos
      //  System.out.println(llist.pop()); //NoSuchElementException verir cunku bos
        llist.push(30);//Listenin basina elmenti ekler
        llist.push(40);
        llist.push(50);
        llist.push(50);
        System.out.println(llist);//[50, 50, 40, 30]
        llist.removeFirstOccurrence(50);
        System.out.println(llist);//[50, 40, 30]


    }
}
