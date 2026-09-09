class Solution 
{
    public ListNode removeNodes(ListNode head) 
    {
        // Reverse the list
        head = reverseList(head);
        ListNode prev = null;
        ListNode temp = head;
        int max = Integer.MIN_VALUE;
        while(temp != null)
        {
            if(temp.val >= max)
            {
                max = temp.val;
                prev = temp;
                temp = temp.next;
            }
            else
            {
                // Remove current node
                prev.next = temp.next;
                temp = temp.next;
            }
        }
        // Reverse again
        return reverseList(head);
    }
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}