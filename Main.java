import java.util.Scanner;

public class Main {
    int n,Hi[],max=0,k;
    int c=0;
    Main()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Hi = new int[n];
        for(int i=0;i<n;i++)
        {
            Hi[i]=sc.nextInt();
            if(Hi[i]>max)
                max=Hi[i];
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            if(Hi[i]==max)
            {
                k=0;
                for(int j=i;j<n;j++)
                {
                    if(Hi[j]==max-k)
                    {
                        k++;
                    }
                    else
                    {
                        break;
                    }
                }
                c++;
                break;
            }
        }
        if(k<max)
        {
            max = max-k;
            display();
        }
        else
            System.out.println(c);
    }
    public static void main(String[] args) {
        new Main().display();
    }

}