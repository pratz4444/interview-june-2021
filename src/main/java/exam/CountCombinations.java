import java.io.*;
 
class GFG
{
     
// function to calculate
// factorial of a number
static int factorial(int n)
{
    int f = 1;
    if (n == 0|| n == 1)
        return 1;
    for (int i = 2; i <= n; i++)
        f = f * i;
    return f;
}
 
// Function to calculate
// sum of all numbers
static int getSum(int arr[], int n)
{
    // calculate factorial
    int fact = factorial(n);
 
    // sum of all the given
    // digits at different
    // positions is same and
    // is going to be stored
    // in digitsum.
    int digitsum = 0;
    for (int i = 0; i < n; i++)
        digitsum += arr[i];
    digitsum *= (fact / n);
 
    // Compute result (sum
    // of all the numbers)
    int res = 0;
    for (int i = 1, k = 1;
             i <= n; i++)
    {
        res += (k * digitsum);
        k = k * 10;
    }
 
    return res;
}
 
// Driver Code
public static void main (String[] args)
{
 
    // n distinct digits
    int arr[] = {1, 2, 3};
    int n = arr.length;
     
    // Print sum of all
    // the numbers formed
    System.out.println(getSum(arr, n));
}
}
