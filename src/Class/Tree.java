package Class;

import java.util.LinkedList;

public class Tree {

  public Node root;

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
}
