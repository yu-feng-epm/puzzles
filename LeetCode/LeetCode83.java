/**
 * Question 83:
 * 
 * Given the head of a sorted linked list, delete all duplicates such that 
 * each element appears only once. Return the linked list sorted as well.
 * 
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
import java.util.Arrays;
import java.util.LinkedList;

public class LeetCode83 {
  public static void printLinkedList(String header, LinkedList<Integer> list) {
    System.out.print(header + ": ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
      if (i < list.size() - 1) {
        System.out.print(",");
      }
    }
    System.out.println();
  }
  public static void removeDuplicates(LinkedList<Integer> list) {
    printLinkedList("Input", list);
    for (int i = list.size() - 1; i > 0; i--) {
      if (list.get(i).equals(list.get(i - 1))) {
        list.remove(i);
      }
    }
    printLinkedList("Output", list);
  }

  public static void main(String[] args) {
    LinkedList<Integer> linkedListNumbers = new LinkedList<Integer>();
    linkedListNumbers.addAll(Arrays.asList(new Integer[]{1,1,2}));
    removeDuplicates(linkedListNumbers);

    linkedListNumbers.clear();
    linkedListNumbers.addAll(Arrays.asList(new Integer[]{1,1,2,3,3}));
    removeDuplicates(linkedListNumbers);
  }
}
