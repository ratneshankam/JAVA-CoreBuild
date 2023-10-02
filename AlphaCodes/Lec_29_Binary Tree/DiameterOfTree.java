class DiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return (Math.max(lh, rh) + 1);
    }

    // Approach 1 -> O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        int selfheight = leftHt + rightHt + 1;

        return Math.max(selfheight, Math.max(rightDia, leftDia));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    // Approach 2 -> O(n)
    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);
        // System.out.println(diameter2(root).ht);

    }
}