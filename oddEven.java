// Class definition
class oddEven{
    int number; 

    // Method to check if the number is even
    void checkOddEven() {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

// 
    public static void main(String[] args) {
        // Create an object of NumberChecker
        oddEven check = new oddEven();

        // Set the number to check
        check.number = 7; // Change 7 to any number you'd like to test

        // Check and display the result
        check.checkOddEven();
    }
}
