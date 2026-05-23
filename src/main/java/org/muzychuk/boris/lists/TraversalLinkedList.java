package org.muzychuk.boris.lists;

import java.util.ArrayList;
import java.util.List;

public class TraversalLinkedList {

    public List<ListNode> traverse(ListNode node) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode currentNode = node;
        while (currentNode != null) {
            System.out.println("Processing node Node with val: " + currentNode.val);
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return nodes;
    }

    public int countRecursive(ListNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + countRecursive(node.next);
    }

    public int count(ListNode node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }

}
