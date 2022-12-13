import java.util.Scanner;

class emp {
    int i = 1;
    int basic_sal = 5000;
    int hra = 0;
    Scanner s = new Scanner(System.in);
    
    
    public void empEmployee() {
        System.out.print("Enter your name :- ");
        String name = s.nextLine();
        System.out.println("\n"+name + " your genrated salary is " + basic_sal + "/-Rs\n-----------------------------------\n");
    }
}

class mng extends emp {
    public void empManager() {
        hra = basic_sal * 20 / 100;
        System.out.print("Enter your name :- ");
        String name = s.nextLine();
        System.out.println("\n"+name +" your HRA is "+hra+"/-Rs \nYour total genrated salary is " + (basic_sal + hra) + "/-Rs\n-----------------------------------\n");
    }
}

class hod extends mng {
    public void empHOD() {
        int cea = basic_sal * 10 / 100;
        hra = basic_sal * 20 / 100;
        System.out.print("Enter your name :- ");
        String name = s.nextLine();
        System.out.println("\n"+name +" your HRA is "+hra+"/-Rs and CEA is "+cea+"/-Rs \nYour total genrated salary is " + (basic_sal + hra + cea) + "/-Rs\n-----------------------------------\n");
    }
}

public class javaA2_3 {
    public static void main(String[] args) {
        hod h = new hod();
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        while (t) {
            System.out.print("Welcome to PCET Organization :)\n-----------------------------------\n\n1.)Generate Salary\n2.)Exit\nEnter your choice :- ");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.print("\n\nSelect your Designation :- \n   Press 1. for Employee.\n   Press 2. for Manager.\n   Press 3. for Head of Departnment(HOD).\nEnter your choice :- ");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        h.empEmployee();
                    } else if (choice == 2) {
                        h.empManager();
                    } else if (choice == 3) {
                        h.empHOD();
                    } else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 2:
                    System.out.println("Thank you.");
                    t = false;
                    break;
                case 3:
                    System.out.println("Invalid Argument :( ");
            }
        }
    }
}