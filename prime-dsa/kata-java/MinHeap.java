import java.util.ArrayList;

public class MinHeap {

  private ArrayList<Integer> data;

  public MinHeap() {
    data = new ArrayList<>();
  }

  // INSERT
  public void insert(int value) {

    data.add(value); // add value at end
    heapifyUp(data.size() - 1); // fix heap property
  }

  // DELETE (remove min)
  public int delete() {

    if (data.size() == 0)
      return -1;

    int out = data.get(0); // root value

    if (data.size() == 1) {
      data.remove(0);
      return out;
    }

    int last = data.remove(data.size() - 1); // remove last element
    data.set(0, last); // move last to root

    heapifyDown(0); // restore heap

    return out;
  }

  // HEAPIFY UP
  private void heapifyUp(int idx) {

    if (idx == 0)
      return;

    int parent = (idx - 1) / 2;

    int parentValue = data.get(parent);
    int value = data.get(idx);

    if (parentValue > value) {

      data.set(idx, parentValue);
      data.set(parent, value);

      heapifyUp(parent);
    }
  }

  // HEAPIFY DOWN
  private void heapifyDown(int idx) {

    int left = idx * 2 + 1;
    int right = idx * 2 + 2;

    if (left >= data.size())
      return;

    int smallest = left;

    if (right < data.size() && data.get(right) < data.get(left)) {
      smallest = right;
    }

    if (data.get(idx) > data.get(smallest)) {

      int temp = data.get(idx);

      data.set(idx, data.get(smallest));
      data.set(smallest, temp);

      heapifyDown(smallest);
    }
  }
}
