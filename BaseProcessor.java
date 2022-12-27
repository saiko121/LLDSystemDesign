package Atm;

public abstract class BaseProcessor extends Denomination{

    BaseProcessor nextProcessor;
//    int value = 56;

    BaseProcessor(BaseProcessor processor){
//        super();
        this.nextProcessor = processor;
    }

    public void log(int money, StringBuilder message){
        if(money>0 && nextProcessor!=null){
            nextProcessor.log(money, message);
        }else if(money == 0){
            System.out.println(message);
        }else{
            System.out.println("Insufficient Funds");
        }
    }




}
