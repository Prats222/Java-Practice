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

}
