package DAALAB.Lab6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class HFNode {
    char ch;
    int freq;
    HFNode left, right;

    HFNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }

    HFNode(int freq) {
        this.ch = '-';
        this.freq = freq;
        this.left = null;
        this.right = null;
    }
}

public class HuffmanCoding {
    public static void main(String[] args) {
        String s = "KIIT KIITEE 2024 2000004";
        PriorityQueue<HFNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));
        Map<Character, Integer> mpp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            pq.add(new HFNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HFNode left = pq.poll();
            HFNode right = pq.poll();
            HFNode parent = new HFNode(left.freq + right.freq);
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }
        HFNode root = pq.poll();
    }






}