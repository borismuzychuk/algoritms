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

}
