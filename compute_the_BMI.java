import java.util.Scanner;
class Patient
{
    public double computeBMI(double height, double weight)
    {
        double BMI = weight/(height*height);
        return BMI;

    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String patient_name = scan.nextLine();
        System.out.println("Enter your height in meter");
        double height = scan.nextDouble();
        System.out.println("Enter your weight in kg");
        double weight = scan.nextDouble();
        Patient obj = new Patient();
        System.out.println("BMI of "+patient_name+" is "+(float)obj.computeBMI(height,weight));
    }
    
}
