import java.util.Scanner;

class publication {
    String title;
    float price;

    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.print("Enter title :- ");
        title = sc.nextLine();
        System.out.print("Enter price :- ");
        price = sc.nextFloat();
    }

    public void putdata() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        books b = new books();
        tapes t = new tapes();
        b.disp();
        b.getdata();
        t.disp();
        t.getdata();
        b.show();
        b.putdata();
        t.show();
        t.putdata();
    }
}

class books extends publication {
    int page_count;

    public void disp() {
        System.out.println("Enter Book details : ");
    }

    public void getdata() {
        super.getdata();
        System.out.print("Enter Page count :- ");
        page_count = sc.nextInt();
    }

    public void show() {
        System.out.println("\n\n--------------------------\nDetails of Book : ");
    }

    public void putdata() {
        super.putdata();
        System.out.println("Total pages book contain : " + page_count);
    }
}

class tapes extends publication {
    float playing_time;

    public void disp() {
        System.out.println("\nEnter Tape details : ");
    }

    public void getdata() {
        super.getdata();
        System.out.print("Enter play time in minutes :- ");
        playing_time = sc.nextFloat();
    }

    public void show() {
        System.out.println("\nDetails of Tape : ");
    }

    public void putdata() {
        super.putdata();
        System.out.println("Total playing time is : " + playing_time + "\n--------------------------");
    }
}