package Java;
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int counter1 = 1;
        int counter2 = 1;
        int n1 = l1.val;
        int n2 = l2.val;
        while (l1.next != null)
        {
            n1 = l1.next.val * (int)Math.pow(10, counter1) + n1;
            l1 = l1.next;
            counter1++;
        }

        while (l2.next != null)
        {
            n2 = l2.next.val * (int)Math.pow(10, counter2)  + n2;
            l2 = l2.next;
            counter2++;
        }

        int n3 = n1 + n2;
        System.out.println("n1: " + n1 + ", n2: " + n2 + ", n3: " + n3);
        if (n3 == 0) return new ListNode(0);
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (n3 > 0){
            current.next = new ListNode(n3 % 10);
            current = current.next;
            n3 /= 10;
        }
        return dummy.next;
    }
}

class main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        // l1 = [9]
ListNode l1 = new ListNode(9);

// l2 = [1,9,9,9,9,9,9,9,9,9]
ListNode l2 = new ListNode(1,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9))))))))));


        ListNode result = solution.addTwoNumbers(l1, l2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}