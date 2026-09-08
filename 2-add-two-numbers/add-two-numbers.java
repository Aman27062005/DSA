class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode head = null;
        ListNode tail = null;

        int sum = 0;
        int r = 0;

        // Both lists have nodes
        while (temp1 != null && temp2 != null)
        {
            sum=0;
            sum = temp1.val + temp2.val + r;
            r=0;
            r = sum / 10;

            ListNode newNode = new ListNode(sum % 10);

            if (head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // Remaining nodes in l1
        while (temp1 != null)
        {
            sum=0;
            sum = temp1.val + r;
            r=0;
            r = sum / 10;

            ListNode newNode = new ListNode(sum % 10);

            tail.next = newNode;
            tail = newNode;

            temp1 = temp1.next;
        }

        // Remaining nodes in l2
        while (temp2 != null)
        {
            sum=0;
            sum = temp2.val + r;
            r=0;
            r = sum / 10;

            ListNode newNode = new ListNode(sum % 10);

            tail.next = newNode;
            tail = newNode;

            temp2 = temp2.next;
        }

        // Remaining carry
        if (r > 0)
        {
            tail.next = new ListNode(r);
        }

        return head;
    }
}