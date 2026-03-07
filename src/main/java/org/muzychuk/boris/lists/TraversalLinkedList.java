package org.muzychuk.boris.lists;

import java.util.ArrayList;
import java.util.List;

public class TraversalLinkedList {

    public List<ListNode> traverse(ListNode node) {
        List<ListNode> nodes = new ArrayList<>();
        while (node != null) {
            System.out.println("Processing node Node with val: " + node.val);
            nodes.add(node);
            node = node.next;
        }
        return nodes;
    }

}
