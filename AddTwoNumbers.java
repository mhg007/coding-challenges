// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.
// Example 2:
//
// Input: l1 = [0], l2 = [0]
// Output: [0]
// Example 3:
//
// Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
// Output: [8,9,9,9,0,0,0,1]


class AddTwoNumbers{
  public static void main(String[] args){
    ListNode l1 = new ListNode();
    l1.addFirst(9);
    l1.addFirst(4);
    l1.addFirst(2);

    // l1.addFirst(0);

    // l1.addFirst(9);
    // l1.addFirst(9);
    // l1.addFirst(9);
    // l1.addFirst(9);
    // l1.addFirst(9);
    // l1.addFirst(9);
    // l1.addFirst(9);

    ListNode l2 = new ListNode();
    l2.addFirst(9);
    l2.addFirst(4);
    l2.addFirst(6);
    l2.addFirst(5);

    // l2.addFirst(0);

    // l2.addFirst(9);
    // l2.addFirst(9);
    // l2.addFirst(9);
    // l2.addFirst(9);

    ListNode l3 = new ListNode();
    l3 = l3.addTwoNumbers(l1, l2);

    l3.printAll(l3);

    System.out.println();
  }

}

class ListNode {
  Node head;
  private class Node{
    int val;
    Node next;
    Node(){}
    Node(int val) {this.val = val;}
    Node(int val, Node next) {this.val = val; this.next = next;}
  }

  void addFirst(int item){
    if(head == null){
      head = new Node(item);
    }
    else{
      // head -> 2
      Node newNode = new Node(item); // newNode -> 5
      newNode.next = head; // 5 -> 2
      head = newNode; //
    }
  }

  private ListNode addTwoNumbers(ListNode l1, ListNode l2,String str) {
      ListNode l3 = new ListNode();
      Node current1 = l1.head;
      Node current2 = l2.head;
      int sumOfTwoNumbers = 0;
      while(current1 != null && current2 != null){
        sumOfTwoNumbers = current1.val + current2.val;
        if(sumOfTwoNumbers >= 10){
          l3.head.val += 1;
          String number = String.valueOf(sumOfTwoNumbers);
          int secondDigit = Character.getNumericValue(number.charAt(1));
          l3.addFirst(secondDigit);
        }
        else{
          l3.addFirst(sumOfTwoNumbers);
        }
        current1 = current1.next;
        current2 = current2.next;
      }
      return l3;
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    ListNode l3 = new ListNode();
    String list1 = "";
    String list2 = "";

    Node current1 = l1.head;
    Node current2 = l2.head;

    while(current1 != null){
      list1 += current1.val;
      current1 = current1.next;
    }
    while(current2 != null){
      list2 += current2.val;
      current2 = current2.next;
    }
    System.out.println(list1);
    System.out.println(list2);
    int totalSumOfLists = Integer.parseInt(list1) + Integer.parseInt(list2);
    System.out.println(totalSumOfLists);

    String sumInStr = String.valueOf(totalSumOfLists);
    for(int i=0;i<sumInStr.length();i++){
      l3.addFirst(Character.getNumericValue(sumInStr.charAt(i)));
    }
    return l3;
  }

  private int getNumberFromList(ListNode list){
    int index=0;
    Node current = list.head; // current -> 2
    while(current != null){
      index++;
      current = current.next;
    }
    return 0;
  }

  public void printAll(ListNode list){
    Node current = list.head;
    while(current != null){
      System.out.print(current.val+", ");
      current = current.next;
    }
  }
}


/* LeetCode Solution Wrong
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        String list1 = "";
        String list2 = "";
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode dummy = l3;

        while(current1 != null){
            list1 += current1.val;
            current1 = current1.next;
        }
        while(current2 != null){
            list2 += current2.val;
            current2 = current2.next;
        }

        int totalSum = Integer.parseInt(list1) + Integer.parseInt(list2);
        String sumInStr = String.valueOf(totalSum);
        for(int i = sumInStr.length() - 1; i > -1 ; i--){
            dummy.next = new ListNode(Character.getNumericValue(sumInStr.charAt(i)));
            dummy = dummy.next;
        }

        return l3.next;
    }
}
*/
/*
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b =l2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while(a!=null || b!=null)
        {
            int d1 = 0,d2 = 0;
            if(a!=null) d1 = a.val;
            if(b!=null) d2 = b.val;
            int sum = d1 + d2 + carry;
            int val = sum % 10;
            carry = (int)(sum/10);
            temp.next = new ListNode(val);
            temp = temp.next;
            if(a!=null) a = a.next;
            if(b!=null) b = b.next;
        }
        if(carry!=0) temp.next = new ListNode(carry);
        return dummy.next;

    }
}
*/
