public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}