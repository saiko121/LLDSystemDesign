package Atm;

public class FirstProcessor extends BaseProcessor{
//    public int count;
    FirstProcessor(BaseProcessor processor) {
        super(processor);
    }



    public void log(int money, StringBuilder message){
//        value+= 23;
        int notes = money/2000;
        notes = Math.min(firstVal, notes);
        if(notes > 0 && money <= notes*2000){
            message.append(notes);
            message.append("*2000 ");
            firstVal -= notes;
        }
        super.log(money-(notes*2000), message);
    }

}
