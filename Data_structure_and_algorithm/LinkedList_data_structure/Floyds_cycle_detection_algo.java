package Data_structure_and_algorithm.LinkedList_data_structure;
import java.util.*;
public class Floyds_cycle_detection_algo {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            next = null;
        }
    }
    static ListNode detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
    static ListNode detectFirstNode(ListNode head){
        ListNode meet = detectCycle(head);
        ListNode start = head;
        while(start!=meet && meet!=null){
            start = start.next;
            meet = meet.next;
        }
        return meet;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(detectFirstNode(head).data);
    }
}
