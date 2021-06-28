package Class;

public class Node {

  public int value;

  public Node left;
  public Node right;

  public Node(int value) {
    this.value = value;
  }

  public boolean isLeaf() {
    return left == null && right == null;
  }

  public boolean hasLeft() {
    return left != null;
  }

  public boolean hasRight() {
    return right != null;
  }

  public void setChilds(Node left, Node right) {
    this.left = left;
    this.right = right;
  }
}
