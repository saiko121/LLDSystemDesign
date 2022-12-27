package Atm;


import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        BaseProcessor processor = new FirstProcessor(new SecondProcessor(null));
//        Denomination denomination = new Denomination(20,10);

        while(true){
            int money = checkValidity();
            processor.log(money, new StringBuilder(""));
        }
    }

    private static int checkValidity(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn(in the multiples of 500)");
        String inp = scan.nextLine();
        int money = 0;
        if(inp != null){
            money = Integer.parseInt(inp);
            System.out.println("Enter Money is " + money);
            if(!(money % 500 == 0)){
                System.out.println("Please Enter Valid Amount");
                checkValidity();
            }
        }
        return money;

    }


}
