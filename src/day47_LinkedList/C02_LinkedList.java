package day47_LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        /*
        List'den gelen methodlari biliyouz bu yuzden suan sadece
         LinkedList'den gelen ozelliklere bakalim

         */
        Deque< Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);//list'deki add MethodundaN DAHA HIZLIDIR
        ll1.addLast(20);//
        System.out.println(ll1.element());//ilk elementi bize dondurur ama silmez silmeden dondurur
        System.out.println(ll1);//[10, 20] bu da kaniti silmediginin (yukari ile alakaldir)
        System.out.println(ll1.getLast());//sonuncu elementi dondurur//20
        System.out.println(ll1.getFirst());//ilk elemani dondurur//10
        System.out.println(ll1.offer(25));
        System.out.println(ll1.offerLast(50));
        System.out.println(ll1.descendingIterator());
        System.out.println(ll1.peek());

    }
}
