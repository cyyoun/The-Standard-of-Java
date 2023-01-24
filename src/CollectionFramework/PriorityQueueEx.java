package CollectionFramework;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String argsp[]){
        Queue pq = new PriorityQueue();
        pq.offer(3.1);
        pq.offer(3.2);
        pq.offer(4.1);
        pq.offer(4.0);
        pq.offer(2.3);
        System.out.println(pq);

        Object obj = null;

        while((obj= pq.poll()) != null)
            System.out.println(obj);
    }
}
