package Class;

import java.util.Deque;
import java.util.LinkedList;

public class Tree {

  public Node root;

  public Tree(int[] values) {
    root = new Node(values[5]);

    Node node1 = new Node(values[3]);
    Node node2 = new Node(values[9]);

    Node node3 = new Node(values[1]);
    Node node4 = new Node(values[4]);

    Node node5 = new Node(values[0]);
    Node node6 = new Node(values[2]);

    Node node7 = new Node(values[7]);
    Node node8 = new Node(values[10]);

    Node node9 = new Node(values[6]);
    Node node10 = new Node(values[8]);

    node7.setChilds(node9, node10);
    node2.setChilds(node7, node8);
    node3.setChilds(node5, node6);
    node1.setChilds(node3, node4);
    root.setChilds(node1, node2);
  }

  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node root) {
    if (root != null) {
      System.out.print(root);
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node root) {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root);
      inOrder(root.right);
    }
  }

  public void inOrderTwo() {
    inOrderTwo(root);
  }

  private void inOrderTwo(Node root) {
    if (root != null) {
      inOrderTwo(root.right);

      int level = this.heightOfNode(this.root, root, -1);

      for (int i = 0; i < level; i++) {
        System.out.print("\t");
      }

      System.out.print("" +root.value + " [Level: " + (level+1) + "]\n");
      inOrderTwo(root.left);
    }
  }

  public void posOrder() {
    posOrder(root);
  }

  private void posOrder(Node root) {
    if (root != null) {
      posOrder(root.left);
      posOrder(root.right);
      System.out.print(root);
    }
  }

  public void levelOrder() {
    LinkedList<Node> queue = new LinkedList<>();
    queue.addLast(root);
    while (!queue.isEmpty()) {
      Node current = queue.removeFirst();
      if (current != null) {
        System.out.println(root);
        queue.addLast(current.left);
        queue.addLast(current.right);
      }
    }
  }

  public static int heightOfTree(Node node) {
    if (node==null) return 0;
    return 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));
  }

  public int heightOfNode(Node root, Node node, int res) {
    if (root == null || node == null) {
      return -1;
    } else if (root == node) {
      return (res + 1);
    }

    int result = heightOfNode(root.left,node,res+1);
    if (result != -1) {
      return result;
    }

    result = heightOfNode(root.right,node,res+1);
    return result;
  }

  public String toString() {
    this.inOrderTwo();
    return "";
  }

  public boolean equals(Node root, Node tree) {
    if (root!=null && root.left!=null && root.right!=null) {
      if (root.value == tree.value && root.left.value == tree.left.value && root.right.value == tree.right.value) {
          equals(root.left, tree.left);
          equals(root.right, tree.right);
          return true;
      }
    }

    return false;
  }

  public void queue() {
    Deque<Node> nodes = new LinkedList<Node>();
    Node root = this.root;

    do{
      while (root!=null) {
        if (root.right!=null) {
          nodes.addFirst(root.right);
        }

        nodes.addFirst(root);
        root = root.left;
      }

      Node element = nodes.peek();
      nodes.poll();
      root = element;

      if (root!=null) {
        Node rootRight = root.right;

        if (nodes.peek() != null && nodes.peek().equals(rootRight)) {
          nodes.poll();
          nodes.addFirst(root);
          root = rootRight;
        } else {
          System.out.print(root.value);
          root = null;
        }
      }

    } while (!nodes.isEmpty());
  }
}