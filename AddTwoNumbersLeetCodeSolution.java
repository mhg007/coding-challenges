class AddTwoNumbersLeetCodeSolution{
  public static void main(String[] args){
      int val = 18 % 10;
      int carry = (int) 18/10;
      System.out.println(val);
      System.out.println(carry);
    }
}
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
/*
Solution{

  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    ListNode l3 = new ListNode(0);
    ListNode temp = l3;
    ListNode c1 = l1;
    ListNode c2 = l2;
    int carry = 0;

    while(c1 != null || c1 != null){
      int d1 = 0;
      int d2 = 0;
      if(c1 != null)
        d1 = c1.val;
      if(c2 != null)
        d2 = c2.val;

      int sum = d1 + d2 + carry;
      int val = sum % 10;
      carry = (int)sum/10;

      temp.next = new ListNode(val);
      temp = temp.next;

      if(c1 != null)
        c1 = c1.next;
      if(c2 != null)
          c2 = c2.next;
    }
    if(carry != 0)
      temp.next = new ListNode(carry);
    return l3.next;
  }
}
class ListNode{

}
*/
