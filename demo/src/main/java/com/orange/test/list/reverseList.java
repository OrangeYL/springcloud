package com.orange.test.list;

import java.util.Scanner;

public class reverseList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ListNode temp1 = new ListNode(0);
        ListNode temp2=temp1;
        while(n>0){
            temp2.next= new ListNode(scanner.nextInt());
            temp2=temp2.next;
            n--;
        }
       ListNode head=temp1.next;
        ListNode node = reverse(head);
        while(node!=null){
           System.out.print(node.val+"  ");
           node=node.next;
       }
    }
    public static ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        ListNode nex=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nex;
        }
        return pre;
    }
}

class ListNode{
    public  ListNode next;
    public  int val;

    public ListNode(int val) {
        this.val = val;
    }
}
