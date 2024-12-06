
public class SelectionSort{
 public static void displayArray(int a[]) {
 for(int i = 0; i < a.length; i++){
 System.out.print(a[i] + " ");
 }
 }
 public static void main(String[] args) {
 int a[] = {9,5,2,3};
 int n = a.length;
 for (int i = 0; i < n - 1; i++){
 System.out.println("\nPass Number: "+ (i + 1));
 int idx = i;
 for (int j = i + 1; j < n; j++){
 System.out.println("\nComparing " + a[j] + " and " + a[idx]);
 if (a[j] < a[idx]){
 System.out.println(a[j] + " is less than " + a[idx]);
 System.out.println("Setting index of minimum element to " + j);
 idx = j;
 }
 }
 int t = a[i];
 a[i] = a[idx];
 a[idx] = t;
 System.out.println("\nAfter pass no Array like: " + (i + 1));
 displayArray(a);
 }
 System.out.println("\nSorted array is: ");
 displayArray(a);
 }
}