import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static TreeNode[] tree;

    static class TreeNode {
        char data;
        TreeNode left, right;

        TreeNode(char data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new TreeNode[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);
            if (tree[parent - 'A'] == null) {
                tree[parent - 'A'] = new TreeNode(parent);
            }
            if (left != '.') {
                tree[left - 'A'] = new TreeNode(left);
                tree[parent - 'A'].left = tree[left - 'A'];
            }
            if (right != '.') {
                tree[right - 'A'] = new TreeNode(right);
                tree[parent- 'A'].right = tree[right - 'A'];
            }
        }

        preorderTraversal(tree[0]);
        sb.append("\n");
        inorderTraversal(tree[0]);
        sb.append("\n");
        postorderTraversal(tree[0]);
        System.out.println(sb);
    }

    static void preorderTraversal(TreeNode node) {
        if (node != null) {
            sb.append(node.data);
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            sb.append(node.data);
            inorderTraversal(node.right);
        }
    }

    static void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            sb.append(node.data);
        }
    }
}
