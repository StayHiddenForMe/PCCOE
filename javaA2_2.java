import java.util.Scanner;

class javaA2_2 {
    int vp = 0 ,vnp = 0, amt = 0, tv=0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        javaA2_2 tb = new javaA2_2();
        while(true)
        {
            System.out.println("Welcome to Tollbooth :)");
            System.out.println("\n1.)I have paid toll\n2.)I have not paid toll\n3.)I want to check all records");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    tb.paid();
                    break;
                case 2:
                    tb.unpaid();
                    break;
                case 3:
                    tb.display();
                    break;
            } 
        }
    }           
    public void paid(){
        vp+=1;
        amt+=100;
        System.out.println("\nRecord Inserted Successfully");
        System.out.println("Thank you so much...!!!\n\n");
    }
    public void unpaid(){
        vnp+=1;
        System.out.println("\nRecord Inserted Successfully");
        System.out.println("\n\n");
    }
    public void display(){
        System.out.println("\n\nTotal vehicle has passed tollbooth are: "+(vp+vnp)+" Total number of vehicle paid toll are: "+vp+" and not paid vehicle are "+vnp+"\n");
        System.out.println("Total amount is collected is "+amt+"\n");
    }
}
