class Stack1 {
 int a[], top, c;
 // Constructor
 Stack1(int n) {
 a = new int[n];
 c = n;
 top = -1;
 }
 // Push method
 public void push(int x) {
 if (isFull()) {
 System.out.println("Stack Overflow!!!");
 System.exit(1);
 }
 System.out.println("Inserting " + x);
 a[++top] = x;
 }
 // Pop method
 public int pop() {
 if (isEmpty()) {
 System.out.println("Stack Underflow!!!");
 System.exit(1);
 }
 return a[top--];
 }
 // Print stack elements
 public void printstack() {
 if (isEmpty()) {
 System.out.println("Stack is empty!");
 return;
 }
 System.out.print("Stack elements: ");
 for (int i = 0; i <= top; i++) {
 System.out.print(a[i] + " ");
 }
 System.out.println();
 }
 // Get size of the stack
 public int getsize() {
 return (top + 1);
 }
 // Check if the stack is empty
 public boolean isEmpty() {
 return (top == -1);
 }
 // Check if the stack is full
 public boolean isFull() {
 return (top == c - 1);
 }
 // Main method
 public static void main(String[] args) {
 Stack1 s = new Stack1(5);
 // Insert elements into the stack
 s.push(8);
 s.push(27);
 s.push(38);
 s.push(75);
 s.push(10);
 // Print stack
 System.out.println("Stack:");
 s.printstack();
 // Pop element
 System.out.println("Popping element: " + s.pop());
 // Print stack after popping
 System.out.println("After popping out:");
 s.printstack();
 }
}
