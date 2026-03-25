package test;

public class LongestZigZag {
    LongestZigZag left;
    LongestZigZag right;
    int val;

    LongestZigZag(int val) {
        this.val = val;
    }

    static int max = 0;

    public static int method(LongestZigZag node) {
        max = 0;
        dfs(node, true, 0);
        return max;
    }

    static void dfs(LongestZigZag node, boolean left, int length) {
        if (node == null) return;

        max = Math.max(max, length);

        if (left) {
            dfs(node.left, false, length + 1);
            dfs(node.right, true, 1);
        } else {
            dfs(node.right, true, length + 1);
            dfs(node.left, false, 1);
        }
    }

    public static void main(String[] args) {

        //        1
        //       /
        //      2
        //     /
        //    3
        //     \
        //      4
        //     /
        //    5

        LongestZigZag root = new LongestZigZag(1);

        root.left = new LongestZigZag(2);
        root.left.left = new LongestZigZag(3);
        root.left.left.right = new LongestZigZag(4);
        root.left.left.right.left = new LongestZigZag(5);

        System.out.println("ZigZag Length: " + method(root));
    }
}