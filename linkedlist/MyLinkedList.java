package linkedlist;

public class MyLinkedList {
    private Node head;
    int size;

    public void add(int value){
        if (this.head==null){
            this.head=new Node(value);
        }else {
        Node dop=this.head;
        while (dop.getNext()!=null){
            dop=dop.getNext();
        }
        dop.setNext(new Node(value));


        }
            size++;
    }
    public int size(){
        return this.size;
    }
    public int put(int number){
        Node dop=head;
        for (int i=0; i<number; i++) {
            dop=dop.getNext();

        }
    return dop.getValue();
    }

    @Override
    public String toString() {
        Node dop=this.head;
        StringBuilder all=new StringBuilder();
        int i=0;
        while (i!=size){
            all.append(dop.getValue());
            dop=dop.getNext();
            i++;



        }
        return  all.toString();
    }

    private static class Node{
       private int value;
       private Node next;

       public Node (int value){
         this.value=value;
       }

       public int getValue() {
           return value;
       }

       public void setValue(int value) {
           this.value = value;
       }

       public Node getNext() {
           return next;
       }

       public void setNext(Node next) {
           this.next = next;
       }
   }
}
