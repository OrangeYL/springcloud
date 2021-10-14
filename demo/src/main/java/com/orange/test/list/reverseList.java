package com.orange.test.list;

import java.util.Scanner;

public class reverseList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ListNode head = new ListNode(0);
        ListNode tem=head;
        while(n>0){
            tem = new ListNode(scanner.nextInt());

        }
    }


    public ListNode reverse(ListNode head){


        return null;
    }
}




class ListNode{
    private ListNode next;
    private int val;

    public ListNode(int val) {
        this.val = val;
    }
}
