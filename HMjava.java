import java.util.Scanner;

class HotelManagement
{
    public static void main(String[] args)
    {
        boolean t = true;
        int bill = 0;
        System.out.println("\n-------Welcome to Annapurna Hotel-------\n\nWhat would you like to have :-");
        Scanner sc = new Scanner(System.in);
        while (t)
        {
            System.out.println("\n1.) Starter\n2.) Veg\n3.) Non-Veg\n4.) Desert\n5.) Get Bill");
            System.out.print("----------------------\nEnter your choice:- ");
            int menuNum = sc.nextInt();
            if (menuNum == 1)
            {
                boolean sm = true;
                System.out.println("\n-------Starter's-------");
                while (sm)
                {
                    System.out.println("\n1.) French Fries   =  Rs: 60/-\n2.) Burger   =  Rs: 25/-\n3.) Pizza   =  Rs: 100/-\n4.) Sandwich   =  Rs: 30/-\n5.) Momos   =  Rs: 50/-\n6.) Back \n");
                    System.out.print("----------------------\nEnter your choice:- ");
                    int starNum = sc.nextInt();
                    switch (starNum)
                    {
                        case 1:
                            System.out.print("Number of Plates you want to eat :- ");
                            int ffPlate = sc.nextInt();
                            bill = bill + (60 * ffPlate);
                            break;
                        case 2:
                            System.out.print("Number of Plates you want to eat :- ");
                            int bgPlate = sc.nextInt();
                            bill = bill + (25 * bgPlate);
                            break;
                        case 3:
                            System.out.print("Number of Plates you want to eat :- ");
                            int pzzPlate = sc.nextInt();
                            bill = bill + (100 * pzzPlate);
                            break;
                        case 4:
                            System.out.print("Number of Plates you want to eat :- ");
                            int saPlate = sc.nextInt();
                            bill = bill + (30 * saPlate);
                            break;
                        case 5:
                            System.out.print("Number of Plates you want to eat :- ");
                            int moPlate = sc.nextInt();
                            bill = bill + (50 * moPlate);
                            break;
                        case 6:
                            sm = false;
                            break;
                    }
                    // System.out.println("Do you want more ?\n1.]YES\n2.]NO");
                    // int q = sc.nextInt();
                    // if (q == 2)
                    // {
                    // sm = false;
                    // }
                }
            } 
            else if (menuNum == 2)
            {
                boolean vm = true;
                System.out.println("\n-------Veg-------");
                while (vm)
                {
                    System.out.println("\n1.) Chapati   =  Rs: 7/-\n2.) Paneer Masala   =  Rs: 180/-\n3.) Veg-Kolhapuri   =  Rs: 220/-\n4.) Pav-Bhaji   =  Rs: 90/-\n5.) Veg-Biryani   =  Rs: 70/-\n6.) Back \n");
                    System.out.print("Enter your choice:- ");
                    int vegNum = sc.nextInt();
                    switch (vegNum)
                    {
                        case 1:
                            System.out.print("Number of Chapati you want to eat :- ");
                            int chaNum = sc.nextInt();
                            bill = bill + (7 * chaNum);
                            break;
                        case 2:
                            System.out.print("Number of Plates you want to eat :- ");
                            int pmPlate = sc.nextInt();
                            bill = bill + (180 * pmPlate);
                            break;
                        case 3:
                            System.out.print("Number of Plates you want to eat :- ");
                            int vkPlate = sc.nextInt();
                            bill = bill + (220 * vkPlate);
                            break;
                        case 4:
                            System.out.print("Number of Plates you want to eat :- ");
                            int pbPlate = sc.nextInt();
                            bill = bill + (90 * pbPlate);
                            break;
                        case 5:
                            System.out.print("Number of Plates you want to eat :- ");
                            int vbPlate = sc.nextInt();
                            bill = bill + (70 * vbPlate);
                            break;
                        case 6:
                            vm = false;
                            break;
                    }
                }
            }
            else if (menuNum == 3)
            {
                boolean nvm = true;
                System.out.println("\n-------Non - Veg-------");
                while (nvm)
                {
                    System.out.println("\n1.) Chicken   =  Rs: 250/-\n2.) Egg Cury   =  Rs: 150/-\n3.) Chicken Lolipop   =  Rs: 200/-\n4.) Back \n");
                    System.out.print("Enter your choice:- ");
                    int nonvegNum = sc.nextInt();
                    switch (nonvegNum)
                    {
                        case 1:
                            System.out.print("Number of Plates you want to eat :- ");
                            int cNum = sc.nextInt();
                            bill = bill + (250 * cNum);
                            break;
                        case 2:
                            System.out.print("Number of Plates you want to eat :- ");
                            int ecPlate = sc.nextInt();
                            bill = bill + (150 * ecPlate);
                            break;
                        case 3:
                            System.out.print("Number of Plates you want to eat :- ");
                            int clPlate = sc.nextInt();
                            bill = bill + (200 * clPlate);
                            break;
                        case 4:
                            nvm = false;
                            break;
                    }
                }
            }
            else if (menuNum == 4)
            {
                boolean dm = true;
                System.out.println("\n-------Desert-------");
                while (dm)
                {
                    System.out.println(
                            "\n1.) ColdCoffee   =  Rs: 75/-\n2.) ChocoLava Cake   =  Rs: 50/-\n3.) Coco-Cola   =  Rs: 20/-\n4.) Ice-Cream   =  Rs: 50/-\n5.) Combo   =  Rs: 200/-\n6.) Back \n");
                    System.out.print("Enter your choice:- ");
                    int desNum = sc.nextInt();
                    switch (desNum)
                    {
                        case 1:
                            System.out.print("Number of glass you want to drink :- ");
                            int ccNum = sc.nextInt();
                            bill = bill + (75 * ccNum);
                            break;
                        case 2:
                            System.out.print("Number of Plates you want to eat :- ");
                            int clcPlate = sc.nextInt();
                            bill = bill + (50 * clcPlate);
                            break;
                        case 3:
                            System.out.print("Number of Bottels you want to drink :- ");
                            int cocPlate = sc.nextInt();
                            bill = bill + (20 * cocPlate);
                            break;
                        case 4:
                            System.out.print("Number of Plates you want to eat :- ");
                            int icPlate = sc.nextInt();
                            bill = bill + (50 * icPlate);
                            break;
                        case 5:
                            System.out.print("Number of Plates you want to eat :- ");
                            int cmbPlate = sc.nextInt();
                            bill = bill + (200 * cmbPlate);
                            break;
                        case 6:
                            dm = false;
                            break;
                    }
                }
            }
            else if (menuNum == 5)
            {
                if(bill <= 0)
                {
                    System.out.println("You have not Order any food yet......");
                }
                else{
                    System.out.println("\n-------------Bill-------------\n");
                    System.out.println("Your bill is: " + bill+"/- ");
                    int totbill = (bill*3)/100;
                    totbill = totbill+bill;
                    System.out.println("\nYour total bill after 3% GST is : "+totbill+"/- ");
                    System.out.println("\n---------THANK YOU VISIT AGAIN-----------");
                    t = false;
                }
            } 
            else 
            {
                System.out.println("==Enter Proper Input==");
            }
        }
        sc.close();
    }
}
