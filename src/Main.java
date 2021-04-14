import my.util.Heapq;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,5,6,7, 3,12,9,16,8,19,2};
        Heapq<Integer> heapq = new Heapq<>(arr);
        while (!heapq.isEmpty()) {
            System.out.println(heapq.pop());
        }
    }
}