public class DoublyLinkedListNode {
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;
    int val;

    public DoublyLinkedListNode(int x) {
        val = x;
    }
}

class MyLinkedList {
    int size;
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;

    public MyLinkedList() {
        size = 0;
        head = new DoublyLinkedListNode(0);
        tail = new DoublyLinkedListNode(0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        if (index + 1 < size - index) {

            DoublyLinkedListNode curr = head;
            int i = 0;

            while (i < index + 1) {
                curr = curr.next;
                i++;
            }

            return curr.val;

        } else {

            DoublyLinkedListNode curr = tail;
            int i = 0;

            while (i < size - index) {
                curr = curr.prev;
                i++;
            }

            return curr.val;
        }
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index < size - index) {

            DoublyLinkedListNode pred = head;
            int i = 0;

            while (i < index) {
                pred = pred.next;
                i++;
            }

            DoublyLinkedListNode node = new DoublyLinkedListNode(val);
            DoublyLinkedListNode succ = pred.next;

            node.next = succ;
            node.prev = pred;
            pred.next = node;
            succ.prev = node;

        } else {

            DoublyLinkedListNode succ = tail;
            int i = 0;

            while (i < size - index) {
                succ = succ.prev;
                i++;
            }

            DoublyLinkedListNode node = new DoublyLinkedListNode(val);
            DoublyLinkedListNode pred = succ.prev;

            node.next = succ;
            node.prev = pred;
            pred.next = node;
            succ.prev = node;
        }

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index < size - index - 1) {

            DoublyLinkedListNode pred = head;
            int i = 0;

            while (i < index) {
                pred = pred.next;
                i++;
            }

            DoublyLinkedListNode succ = pred.next.next;

            pred.next = succ;
            succ.prev = pred;

        } else {

            DoublyLinkedListNode succ = tail;
            int i = 0;

            while (i < size - index - 1) {
                succ = succ.prev;
                i++;
            }

            DoublyLinkedListNode pred = succ.prev.prev;

            pred.next = succ;
            succ.prev = pred;
        }

        size--;
    }
}