import java.util.Scanner;

public class currencyconverter {
    public static void rupeesTocurrency(){
        System.out.println("enter the amount in rupees: ");
        Scanner sc=new Scanner(System.in);
        double rupees=sc.nextDouble();
        //doller
        double dollar=rupees/82.95;
        System.out.println("Dollar : $ " +dollar);
        //euro
        double euro=90.09*rupees;
        System.out.println("Euro : € " +euro);
        //pound
        double pound=rupees/105.75;
        System.out.println("Pound : £ " +pound);

    }
    public static void dollerTocurrency(){
        System.out.println("enter the amount in doller: ");
        Scanner sc=new Scanner(System.in);
        double dollar=sc.nextDouble();
        //rupees
        double rupees=82.95*dollar;
        System.out.println("Dollar : $ " +dollar);
        //euro
        double euro=dollar*1.09;
        System.out.println("Euro : € " +euro);
        //pound
        double pound=dollar/1.27;
        System.out.println("Pound : £ " +pound);
    }

  public static void euroTocurrency(){
        System.out.println("enter the amount in euro: ");
        Scanner sc=new Scanner(System.in);
        double euro=sc.nextDouble();
        //rupees
        double rupees=90.09*euro;
        System.out.println("rupees : RS " +rupees);
        //doller
        double dollar=euro/1.09;
        System.out.println("Dollar : $ " +dollar);
        //pound
        double pound=euro/1.17;
        System.out.println("Pound : £ " + pound);

    }

    public static void poundTocurrency(){
        System.out.println("enter the amount in pound: ");
        Scanner sc=new Scanner(System.in);
        double pound=sc.nextDouble();
        //rupees
        double rupees=105.75*pound;
        System.out.println("rupees : RS " +rupees);
        //doller
        double dollar=0.78*pound;
        System.out.println("Dollar : $ " + dollar);
        //euro
        double euro=pound*1.17;
        System.out.println("Euro : € " +euro);
    }


    public static void main(String args[]){
        System.out.println("1.rupees ");
        System.out.println("2.doller");
        System.out.println("3.euro");
        System.out.println("4.pound");
        System.out.println("Enter your choice: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1: rupeesTocurrency();
            break;
            case 2: dollerTocurrency();
                break;
            case 3: euroTocurrency();
                break;
            case 4: poundTocurrency();
                break;
        }

    }
}
