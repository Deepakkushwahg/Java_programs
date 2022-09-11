package Data_structure_and_algorithm.LinkedList_data_structure;

import java.util.ArrayList;
import java.util.Scanner;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class add_two_LinkedList {
    public void addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ListNode temp = l1;
        while(temp!=null){
            list1.add(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp!=null){
            list2.add(temp.val);
            temp = temp.next;
        }
        int carry = 0;
        int Lsize = (list1.size()>=list2.size())?list1.size():list2.size();
        int Ssize = (list1.size()<=list2.size())?list1.size():list2.size();
        for(int i=0;i<Lsize;i++){
            if(i>=Ssize){
                if(Lsize == list1.size()){
                    list3.add(((list1.get(i))+carry)%10);
                    if(((list1.get(i))+carry) >= 10){
                        carry = 1;
                    }
                    else
                        carry = 0;
                }
                else{
                    list3.add(((list2.get(i))+carry)%10);
                    if(((list2.get(i))+carry) >=10){
                        carry = 1;
                    }
                    else
                        carry = 0;
                }
            }
            else{
                list3.add(((list1.get(i))+(list2.get(i))+carry)%10);
                if(((list1.get(i))+(list2.get(i))+carry) >= 10){
                    carry = 1;
                }
                else
                {
                    carry = 0;
                }
            }
        }
        if(carry == 1){
            list3.add(1);
        }
        temp = null;
        ListNode tail = null;
        for(int i=0;i<list3.size();i++){
            ListNode newNode = new ListNode(list3.get(i), null);
            if(temp == null)
                temp = tail = newNode;
            else{
                tail.next = newNode;
                tail = tail.next;
            }
        }
        System.out.println("After addition of Lists");
        print(temp);
    }
    public void print(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public ListNode insertAtEnd(int x,ListNode head){
        ListNode n = new ListNode(x,null);
        ListNode temp = head;
        if(head==null){
            head = n;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        add_two_LinkedList obj = new add_two_LinkedList();
        ListNode head1 = null,head2 = null;
        System.out.println("Enter the size of list1");
        int size1 = sc.nextInt();
        System.out.println("Enter the Element");
        for(int i=0;i<size1;i++){
            head1 = obj.insertAtEnd(sc.nextInt(),head1);
        }
        System.out.println("Enter the size of list2");
        int size2 = sc.nextInt();
        System.out.println("Enter the Element");
        for(int i=0;i<size2;i++){
            head2 = obj.insertAtEnd(sc.nextInt(),head2);
        }
        obj.addTwoNumbers(head1,head2);
    }
}