package HEAPSques;

public class Main {
    public static void main(String[] args) {
        minHEAP heap=new minHEAP();
         heap.insert(15);
         heap.insert(9);
         heap.insert(8);
         heap.insert(1);
         heap.insert(7);
         heap.insert(6);

        System.out.println(heap.remove());
    }
}
