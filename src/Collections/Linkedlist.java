package Collections;

import java.util.List;

public class Linkedlist {
    ListNode head;

    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
        public ListNode(){
            this.data=-1;
            this.next=null;
        }
    }

    public static void main(String[] args) {

        Linkedlist list=new Linkedlist();
        Linkedlist list2=new Linkedlist() ;

        ListNode node=new ListNode(10);
        list.head=node;
        ListNode temp=list.head;
        ListNode node2=new ListNode(20);
        temp.next=node2;
        temp=temp.next;
        ListNode node3=new ListNode(30);
        ListNode node4=new ListNode(40);
        temp.next=node3;
        temp=temp.next;
        temp.next=node4;

        ListNode node5=new ListNode(50);
        ListNode node6=new ListNode(60);

        ListNode Head=list.head;

        while(Head!=null){
            System.out.println(Head.data);
            Head=Head.next;
        }

        System.out.println("----------------------");
        ListNode node10=Linkedlist.findIndex(list.head,30);
        while(node10!=null){
            System.out.println(node10.data);
            node10=node10.next;
        }

    }

    public static ListNode findIndex(ListNode head, int target){
        ListNode temp=head;
        int i=0;
        while(temp.next!=null){
            i++;
            if(temp.next.data==target){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

}
