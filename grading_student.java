import java.util.Scanner;

public class grading_student
{
    int n,grade[];
    grading_student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        n = sc.nextInt();
        grade = new int[n];
        System.out.println("Enter the grades of students");
        for(int i=0;i<n;i++)
        {
            grade[i] = sc.nextInt();
        }
    }
    void display_marks()
    {
        for(int i=0;i<n;i++)
        {
            if(grade[i]<38)
            {
                continue;
            }
            else
            {
                for(int j=grade[i]+1;j<=100;j++)
                {
                    if(j%5==0)
                    {
                        if(j-grade[i]<3)
                        {
                            grade[i]=j;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Grade after rounding");
        for(int i : grade)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        new grading_student().display_marks();
    }
}
