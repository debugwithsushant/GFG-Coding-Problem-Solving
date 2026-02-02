// GFG 30-Jan Problem: Interleave the First Half of the Queue with Second Half

import java.util.LinkedList;
import java.util.Queue;

class Day2{
    public void rearrangeQueue(Queue<Integer> q) {
        int halfSize = q.size() / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(q.poll());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.poll());
            q.add(q.poll());
        }
    }
    public static void main(String[] args) {
        Day2 day2 = new Day2();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(2);
        System.out.println("Original Queue: " + q);
        day2.rearrangeQueue(q);
        System.out.println("Rearranged Queue: " + q);
    }
}