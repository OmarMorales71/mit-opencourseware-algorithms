package class4;

public class MaxHeap {

    private int[] heap;
    private int last;

    public MaxHeap(int[] array) {
        heap = new int[array.length];
        last = array.length - 1;
        System.arraycopy(array, 0, heap, 0, array.length);
        buildMaxHeap();
    }

    private void buildMaxHeap() {

        for (int i = (heap.length / 2) - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    private void maxHeapify(int i) {
        if(last<=0)
            return;

        int leftChildIndex = (2 * i) + 1;
        int rightChildIndex = (2 * i) + 2;
        int toSwap = -1;

        if (rightChildIndex > last) {
            if (heap[i] < heap[leftChildIndex]) {
                swap(i, leftChildIndex);
            }
        } else {
            if (heap[i] < heap[leftChildIndex] || heap[i] < heap[rightChildIndex]) {
                if (heap[leftChildIndex] >= heap[rightChildIndex]) {
                    swap(i, leftChildIndex);
                } else {
                    swap(i, rightChildIndex);
                }
            }
        }
    }

    public Integer getMax() {
        return last >= 0 ? heap[0] : null;
    }

    public Integer extractMax() {
        if (last< 0)
            return null;

        int ans = heap[0];

        swap(0, last);
        last--;
        maxHeapify(0);
        return ans;
    }

    private void swap(int i, int j) {
        int t = heap[i];
        heap[i] = heap[j];
        heap[j] = t;
    }

}
