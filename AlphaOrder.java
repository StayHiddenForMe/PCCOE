import java.util.Scanner;
class AlphaOrder
{
    public static void main(String[] args)
    {
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total No. of Names you want to input : ");
        int count = s.nextInt();
        String[] letters = new String[count];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Names : ");
        for(int i = 0; i<count; i++)
        {
            letters[i] = s1.nextLine();
        }
        for(int m = 0; m<count; m++)
        {
            for(int n = m+1; n < count; n++)
            {
                if(letters[m].compareTo(letters[n])>0)
                {
                    temp = letters[m];
                    letters[m] = letters[n];
                    letters[n] = temp;
                }
            }
        }
        System.out.println("\nSorted list : ");
        for(int t=0; t<count;t++){
            System.out.println(letters[t]);
        }
        s.close();
        s1.close();
    }
}