import org.w3c.dom.Node;

public class codingNinjaPush {
    // copy list with random pointer //16th march
    class Solution {
        public Node copyRandomList(Node head) {
            Node temp = head;
            // s1
            while (temp != null) {
                Node newN = new Node(temp.val);
                newN.next = temp.next;
                temp.next = newN;
                temp = temp.next.next;
            }
            // s2
            Node itr = head;
            while (itr != null) {
                if (itr.random != null) {
                    itr.next.random = itr.random.next;
                }
                itr = itr.next.next;
            }
            Node dummy = new Node(0);
            itr = head;
            temp = dummy;
            Node fast;
            while (itr != null) {
                fast = itr.next.next;
                temp.next = itr.next;
                itr.next = fast;
                temp = temp.next;
                itr = fast;
            }
            return dummy.next;

        }
    }

    // Reverse k elemnts LL(hard) 16/3/24
    Node curr = head;
    Node prev = null;
    Node next = null;
    int count = 0;

  Node temp=head;for(
    int i = 0;i<k;i++)
    {
        // checking if k nodes exist or not
        if (temp == null) {
            return head;
        }
        temp = temp.next;
    }while(count<k&&curr!=null)
    {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
    }if(next!=null)
    {
        head.next = kReverse(next, k);
    }return prev;
}
