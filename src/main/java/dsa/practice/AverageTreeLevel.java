package dsa.practice;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageTreeLevel {
    public List<Double> treeTraverse(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        List<Double> avgList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int sum = 0;

            for (int i=0; i< levelSize; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.val+" ");
                sum+=node.val;
                if(node.left !=null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            double avg = sum/(double) levelSize;
            avgList.add(avg);
            System.out.println();
        }
        return avgList;
    }
    public static void main(String[] args) {
        // Create tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        AverageTreeLevel bfs = new AverageTreeLevel();
        System.out.println("BFS (level-order) traversal:");
        List<Double> avges = bfs.treeTraverse(root);
        System.out.println(avges);
        // Output:
        // 3
        // 9 20
        // 15 7
    }
}
