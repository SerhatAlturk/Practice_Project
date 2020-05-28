package Replits;

public class Replit83_Div3ForLoop
{
    public static void main(String[] args)
    {
        int a = 0;
        for(int i = 0; i < 20; i++)
        {
            a++;
            while(a % 3 == 0)
            {
                System.out.print(a + " ");
                break;
            }
        }
    }
}
