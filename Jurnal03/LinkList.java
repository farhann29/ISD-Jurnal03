public class LinkList<E> {
    private ListNode<E> head;
    private ListNode<E> tail;
    private String name;

    //constructor
    public LinkList() {
        this("linked list");
    }

    public LinkList(String listName) {
        name = listName;
        head = tail = null;
    }

    public void insertAtFront(E insertItem) {
        ListNode<E> newNode = new ListNode<>(insertItem);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode<E> newNode = new ListNode<>(insertItem);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void removeFromBack() {
        if (head == tail) {
            head = tail = null;
        } else {
            ListNode<E> current = head;

            while (current.next != tail) {
                current = current.next;
            }
            tail = current;
            current.next = null;
        }
    }
    public void removeFromFront(){
        if (head == tail){
            head = tail = null ;
        }else{
            head = head.next ;
        }
    }
    public void printList(){
        ListNode<E> current = head ;
        while(current != null){
            System.out.println(current.getData());
            current = current.next ;
        }
    }
    private boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: ", name);
        ListNode<E> current = head;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.next;
        }
        System.out.println();
    }
}