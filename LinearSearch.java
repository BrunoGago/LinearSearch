import java.util.Scanner;

public class LinearSearch
{
    /*
     * This method uses Linear Search to find a number in a unordered array of integers
     * @return A boolean 'true' if the number was found and 'false' if it was not found.
     * Also, the code counts the number of time that the code had to ran to find it
     */ 
    static boolean linearSearch(int array[], int key)
    {
        boolean isNumberFound = false;
        int     numberOfRun   = 0;

        for(int i = 0; i < array.length; i++)
        {
            numberOfRun ++;

            if(array[i] == key)
            {
                isNumberFound = true;
                break;
            }            
        }

        System.out.println();
        System.out.println("Number of times that the algorithm ran: " + numberOfRun);

        return isNumberFound;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;

        while(stop == false)
        {
            System.out.println("Please enter the number that you want to find in the array: ");
            int key = sc.nextInt();
    
            int[] array = {1, 2, 3, 8, 9, 12, 10};
    
            if(linearSearch(array, key))
            {
                System.out.println();
                System.out.println("The number " + key + " was found!");
            }
            else
            {
                System.out.println();
                System.out.println("The number " + key + " was not found!");
            }

            System.out.println();
            System.out.println("Would you like to run the code again? (Y/N)");
            String wannaStop = sc.next().toUpperCase();

            if(wannaStop.charAt(0) == 'N')
            {
                stop = true;
            }
        }
        sc.close();
    }

}
