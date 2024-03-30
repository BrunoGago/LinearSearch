import java.util.Scanner;

public class LinearSearch 
{
    /**
     * Searches for a number in an unordered array using linear search algorithm.
     *
     * @param array The unordered array to search in.
     * @param key   The number to search for.
     * @return      True if the number was found, false otherwise.
     */
    static boolean linearSearch(int array[], int key) 
    {
        boolean numberFound = false;
        int numberOfRuns = 0;

        for (int i = 0; i < array.length; i++) 
        {
            numberOfRuns++;

            if (array[i] == key) 
            {
                numberFound = true;
                break;
            }
        }

        System.out.println("Number of iterations: " + numberOfRuns);
        return numberFound;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        while (!stop) 
        {
            System.out.println("Please enter the number that you want to find in the array: ");
            int key = sc.nextInt();

            int[] array = {1, 2, 3, 8, 9, 12, 10};

            if (linearSearch(array, key)) 
            {
                System.out.println("The number " + key + " was found!");
            } 
            else 
            {
                System.out.println("The number " + key + " was not found!");
            }

            System.out.println("Would you like to run the code again? (Y/N)");
            String wannaStop = sc.next().toUpperCase();

            if (wannaStop.charAt(0) == 'N') 
            {
                stop = true;
            }
        }
        sc.close();
    }
}
