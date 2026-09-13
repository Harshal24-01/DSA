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

        if(index < 0 || index >= size) {
            return -1;
        }

        if(index < size - index) {

            DoublyLinkedListNode curr = head;

            for(int i = 0; i <= index; i++) {
                curr = curr.next;
            }

            return curr.val;

        } else {

            DoublyLinkedListNode curr = tail;

            for(int i = 0; i < size - index; i++) {
                curr = curr.prev;
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

        if(index < 0 || index > size) {
            return;
        }

        DoublyLinkedListNode pred;
        DoublyLinkedListNode succ;

        if(index < size - index) {

            pred = head;

            for(int i = 0; i < index; i++) {
                pred = pred.next;
            }

            succ = pred.next;

        } else {

            succ = tail;

            for(int i = 0; i < size - index; i++) {
                succ = succ.prev;
            }

            pred = succ.prev;
        }

        DoublyLinkedListNode node = new DoublyLinkedListNode(val);

        node.next = succ;
        node.prev = pred;

        pred.next = node;
        succ.prev = node;

        size++;
    }

    public void deleteAtIndex(int index) {

        if(index < 0 || index >= size) {
            return;
        }

        DoublyLinkedListNode node;

        if(index < size - index) {

            node = head;

            for(int i = 0; i <= index; i++) {
                node = node.next;
            }

        } else {

            node = tail;

            for(int i = 0; i < size - index; i++) {
                node = node.prev;
            }
        }

        // Remove node
        node.prev.next = node.next;
        node.next.prev = node.prev;

        size--;
    }
}