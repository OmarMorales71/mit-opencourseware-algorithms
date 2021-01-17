package class4;

public class Main {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(new int[]{2,1,4,16,2,5,10});

        while (heap.getMax()!=null){
            System.out.println(heap.extractMax());
        }
    }
}
