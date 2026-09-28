/*
Problem:  Write a program that keeps and manipulates a linked list of
	    String data. The data will be provided by the user one item at a time.
      The user should be able to do the following operations:
                     -add "String"
                                adds an item to your list (maintaining alphabetical order)
                     -remove "String"
                                if the item exists removes the first instance of it
                     -show
                                should display all items in the linked list
                     -clear
                               should clear the list
	Input:  commands listed above
	Output:  the results to the screen of each menu
	    choice, and error messages where appropriate.
*/
public class LinkedList{

  //instance varialbes go here (think about what you need to keep track of!)

  private ListNode head;

  //constructors go here
  public LinkedList() {
    head = null;
  }

  //precondition: the list has been initialized
  //postcondition: the ListNode containing the appropriate value has been added and returned
  public ListNode addAValue(String line)
  {
    ListNode newNode = new ListNode(line, null);

    if (head == null) {
      head = newNode;
      return newNode;
    }

    if (line.compareTo(head.getValue()) < 0) {
      newNode.setNext(head);
      head = newNode;
      return newNode;
    }

    ListNode current = head;

    while (current.getNext() != null && line.compareTo(current.getNext().getValue()) >= 0) {
      current = current.getNext();
    }

    newNode.setNext(current.getNext());
    current.setNext(newNode);

    return newNode;
  }

  //precondition: the list has been initialized
  //postcondition: the ListNode containing the appropriate value has been deleted and returned.
  //if the value is not in the list returns null
  public ListNode deleteAValue(String line)
  {
    if (head == null) {
      return null;
    }
    
    if (head.getValue().equals(line)) {
      ListNode removed = head;
      head = head.getNext();
      removed.setNext(null);
      return removed;
    }

    ListNode current = head;

    while (current.getNext() != null) {
      if (current.getNext().getValue().equals(line)) {
        ListNode removed = current.getNext();
        current.setNext(removed.getNext());
        removed.setNext(null);
        return removed;
      }
      
      current = current.getNext();
    }

    return null;

    }

  

  //precondition: the list has been initialized
  //postconditions: returns a string containing all values appended together with spaces between.
  public String showValues()
  {
      String result = "";
      ListNode current = head;

      while (current != null) {
        result += current.getValue();

        if (current.getNext() != null) {
          result += " ";
        }
        current = current.getNext();
      }

      return result;

  }

  //precondition: the list has been initialized
  //postconditions: clears the list.
  public void clear()
  {
    head = null;
  }

  public void reverse(){
    ListNode previous = head;
    ListNode current = null;
    ListNode next = current.getNext();

    while (!(next == null)){
      
    }

  }

}
