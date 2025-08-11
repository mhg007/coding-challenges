class CycleDetectDemo{
  public static void main(String[] str){
    LinkedList list = new LinkedList();
    list.add(10);
    list.add(20);
    list.add(30);
    list.createCycle(3);
    System.out.println(list.detectCycle());
    int x = 5;
    // System.out.println(++x + " " + x++);
    System.out.println(x++ + ++x);
    System.out.println(10/0);
  }
}
class LinkedList{
  private class Node{
    int value;
    Node next;
    Node(){}
    Node(int value){
      this.value = value;
    }
    Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
  }
  private Node head;
  private Node tail;

  public void add(int item){
    if(head == null){
      Node newNode = new Node(item);
      head = tail = newNode;
    }
    else{
      // head -> 2, tail -> 2
      Node newNode = new Node(item); // newNode -> 5
      tail.next = newNode;
      tail = newNode;
    }
  }
  public void createCycle(int i){
    if(head == null)
      return;
    else{
      if(i == 1)
        tail.next = head;
      else if ((i == 2) && head.next != null)
        tail.next = head.next;
      else if ((i == 3) && head.next.next != null)
        tail.next = head.next.next;
      else
        return;
    }
  }
  public boolean detectCycle(){
    Node slow = head;
    Node fast = head;
    while(slow != null && fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast){
        return true;
      }
    }
    return false;
  }
  public void print(){
    Node cur = head;
    while(cur != null){
      System.out.println(cur.value);
      cur = cur.next;
    }
  }
}
