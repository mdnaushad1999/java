import java.util.Scanner;
class divisibility
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[num];
        for(int i = 1;i <= num;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i = 1;i < 2;i++)
        {
            System.out.println(array[i]);
        }
    }
}