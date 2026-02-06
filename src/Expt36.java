import java.util.*;

public class Expt36
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the strings");
        String str[] = new String[N];
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
        {
            str[i] = sc.next();
            arr[i] = Integer.parseInt(str[i]);
        }

    
        for(int i=0;i<N-1;i++)
        {
            for(int j=0;j<N-i-1;j++)
            {
                int a = arr[j];
                int b = arr[j+1];

                int ab = Integer.parseInt("" + a + b);
                int ba = Integer.parseInt("" + b + a);

                if(ba > ab)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        
        String result = "";
        for(int i=0;i<N;i++)
        {
            result += arr[i];
        }

        System.out.println(result);
    }
}
