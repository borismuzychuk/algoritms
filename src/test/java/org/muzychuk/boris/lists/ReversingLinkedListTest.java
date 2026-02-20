package org.muzychuk.boris.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingLinkedListTest {

    @Test
    void reverseList() {
        ListNode head = new ListNode(0,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3, null))));
        ReversingLinkedList reversingLinkedList = new ReversingLinkedList();
        ListNode reverseListHead = reversingLinkedList.reverseList(head);
        assertEquals(3, reverseListHead.val);
        assertEquals(2, reverseListHead.next.val);
        assertEquals(1, reverseListHead.next.next.val);
        assertEquals(0, reverseListHead.next.next.next.val);


    }
}