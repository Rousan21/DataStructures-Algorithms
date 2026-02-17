import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        linkedList();
        queue();
        stack();
    }

    public static void linkedList() {
        // 1. Make a LinkedList to store programming languages
        LinkedList<String> progLanguages = new LinkedList<>();

        // 2. Add some popular programming languages to the list
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // 3. Remove "C++" from the list since we don’t need it
        progLanguages.remove("C++");

        // 4. Add "HTML" at the 3rd spot (index 2)
        progLanguages.add(2, "HTML");

        // 5. Go through the list and print out each language
        Iterator<String> iterator = progLanguages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void queue() {
        // 6. Make a queue to store some names
        Queue<String> q = new LinkedList<>();

        // 7. Add 5 names to the queue
        q.add("Alice");
        q.add("Bob");
        q.add("Charlie");
        q.add("Diana");
        q.add("Ethan");

        // 8. Print the whole queue to see what’s in it
        System.out.println("Elements of queue: " + q);

        // 9. Remove the first person in line and show who it was
        String removedElement = q.poll();
        System.out.println("Removed element: " + removedElement);

        // 10. Check who is next in line without removing them
        System.out.println("Head of queue: " + q.peek());

        // 11. Print out everyone left in the queue
        for (String element : q) {
            System.out.println(element);
        }
    }

    public static void stack() {
        // 13. Make a stack to store book titles
        Stack<String> bookStack = new Stack<>();

        // 14. Put some books on the stack
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // 15. Take off the top book and print it
        String poppedBook = bookStack.pop();
        System.out.println("Popped book: " + poppedBook);

        // 16. Look at the top book without removing it
        System.out.println("Top book after pop: " + bookStack.peek());

        // 17. Add another book on top
        bookStack.push("Web DB Technologies");

        // 18. Look at the top book again
        System.out.println("Top book after push: " + bookStack.peek());

        // 19. See where "Design Patterns" is in the stack
        int position = bookStack.search("Design Patterns");
        System.out.println("\"Design Patterns\" position in stack: " + position);

        // 20. Check if the stack is empty
        System.out.println("Is the stack empty? " + bookStack.empty());

        // 21. Print all the books currently in the stack
        System.out.println("All books in stack:");
        for (String book : bookStack) {
            System.out.println(book);
        }
    }
}
