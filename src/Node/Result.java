package Node;

import org.w3c.dom.Node;

public class Result {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addHead(48);
        list.addTail(56);
        list.addTail(6);
        list.addTail(5);
        list.addTail(8);
        list.addTail(1);


        System.out.println("Value head is " + list.getValueHead());
        System.out.println("Value tail is " + list.getValueTail());
        System.out.println("Remove head is " + list.getValueHeadAndRemove());
        System.out.println("Remove tail is " + list.getValueTailAndRemove());
        System.out.println("List size = " + list.size());
        list.listPrint();
        System.out.println("Search value is " + list.searchValue(6));
        System.out.println("Search value is " + list.searchValue(10));
        System.out.println("Emptiness in list " + list.emptyList());
        list.remove(10);
        list.remove(5);
        list.listPrint();
        System.out.println("List size = " + list.size());
        list.plusValue();
        list.listPrint();

    }
}
