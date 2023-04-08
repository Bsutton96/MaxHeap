import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class MaxHeapTest {

    @Test
    public void testHeapifyUp() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.heap.add(11);
        maxHeap.heap.add(5);
        maxHeap.heap.add(8);
        maxHeap.heap.add(3);
        maxHeap.heap.add(4);
        maxHeap.heap.add(15);
        maxHeap.size = 6;

        maxHeap.heapifyUp(5);

        assertEquals(15, maxHeap.heap.get(0));
    }

    @Test
    public void testInsert() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.insert(0);
        maxHeap.insert(100);
        maxHeap.insert(40);
        maxHeap.insert(1);
        maxHeap.insert(75);
        maxHeap.insert(50);

        assertEquals("[100, 75, 50, 0, 1, 40]", maxHeap.heap.toString());
    }

    @Test
    public void test() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.heap.add(1);
        maxHeap.heap.add(11);
        maxHeap.heap.add(5);
        maxHeap.heap.add(8);
        maxHeap.heap.add(3);
        maxHeap.heap.add(4);

        maxHeap.size = 6;
        maxHeap.heapifyDown(0);

        assertEquals(11, maxHeap.heap.get(0));
    }

    @Test
    public void testExtractFullHeap() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.heap.add(11);
        maxHeap.heap.add(5);
        maxHeap.heap.add(8);
        maxHeap.heap.add(3);
        maxHeap.heap.add(4);
        maxHeap.heap.add(1);

        maxHeap.size = 6;

        assertEquals(11, maxHeap.extract());
        assertEquals(5, maxHeap.size);
        assertEquals(8, maxHeap.extract());
        assertEquals(5, maxHeap.extract());
        assertEquals(4, maxHeap.extract());
        assertEquals(3, maxHeap.extract());
        assertEquals(1, maxHeap.extract());
        assertEquals(null, maxHeap.extract());


    }

    @Test
    public void testMaxHeapSort() {
        MaxHeap<Integer> heap = new MaxHeap<>();
        heap.insert(3);
        heap.insert(1);
        heap.insert(4);
        heap.insert(11);
        heap.insert(8);
        heap.insert(5);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(8);
        expected.add(11);

        ArrayList<Integer> actual = MaxHeap.maxHeapSort(heap);

        assertEquals(expected, actual);
    }
}
