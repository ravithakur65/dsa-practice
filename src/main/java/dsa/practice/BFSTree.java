package dsa.practice;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSTree {
    public void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i =0; i< levelSize ; i++ ) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BFSTree bfs = new BFSTree();
        System.out.println("BFS (level-order) traversal:");
        bfs.bfs(root);
        // Output:
        // 3
        // 9 20
        // 15 7
    }
}


