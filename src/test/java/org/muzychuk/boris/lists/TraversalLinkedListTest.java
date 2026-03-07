package org.muzychuk.boris.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TraversalLinkedListTest {

    @Test
    void traverse() {
        TraversalLinkedList traversalLinkedList = new TraversalLinkedList();
        ListNode listNode5 = new ListNode();
        listNode5.val = 7;
        ListNode listNode4 = new ListNode();
        listNode4.val = 1;
        ListNode listNode3 = new ListNode();
        listNode3.val = 0;
        ListNode listNode2 = new ListNode();
        listNode2.val = -4;
        ListNode listNode1 = new ListNode();
        listNode1.val = 5;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        // [5, -4, 0, 1, 7]
        List<ListNode> expected = List.of(listNode1, listNode2, listNode3, listNode4, listNode5);
        assertEquals(expected, traversalLinkedList.traverse(listNode1));
    }
}