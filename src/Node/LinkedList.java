package Node;

public class LinkedList {

    private Node head;
    private Node tail;


    public void addHead(Integer addHeadElement) {
        Node temp = new Node();
        temp.value = addHeadElement;
        if (head==null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }


    public void addTail(Integer addTailElement) {
        Node temp = new Node();
        temp.value = addTailElement;
        if(head==null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.previous = tail;
            tail = temp;
        }
    }


    public Integer getValueHead(){
        if(head==null) return null;
        int headValue = head.value;
        return  headValue;
    }

    public Integer getValueHeadAndRemove() {
        if(head==null) return null;
        int headValue = head.value;
        remove(head.value);
        return headValue;
    }


    public Integer getValueTail(){
        if (tail==null) return null;
        int tailValue = tail.value;
        return tailValue;
    }

    public Integer getValueTailAndRemove() {
        if(tail==null) return null;
        int tailValue = tail.value;
        remove(tail.value);
        return tailValue;
    }

    void listPrint() {
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
    public boolean searchValue (int value) {
        Node temp = head;
        while (temp!=null) {
            if(temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean emptyList(){
        Node temp = head;
        while (temp!=null) {
             if(temp.next!=null) return false;
        }
        return true;
    }

    public void remove(int value){
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if(head.value == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp!=null & temp.next!=null) {
            if(temp.next.value == value) {
                if (tail == temp.next) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }

    }

    public void plusValue() {
        Node temp = head;
        while (temp!=null) {
            temp.value++;
            temp = temp.next;
        }
    }

    public int size(){
        int size = 0;
        if(head==null) return 0;
        Node temp = head;
        while (temp!=null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    private class Node{
        Node next;
        Node previous;
        Integer value;
    }
}
