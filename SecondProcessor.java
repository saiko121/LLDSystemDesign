package Atm;

public class SecondProcessor extends BaseProcessor{

    SecondProcessor(BaseProcessor processor) {
        super(processor);
    }


    public void log(int money, StringBuilder message) {
        int notes = money/500;
        notes = Math.min(secondVal, notes);
        if(notes > 0 && money <= notes*500){
            message.append(notes);
            message.append("*500 ");
            secondVal -= notes;
        }
        super.log(money-(notes*500), message);
    }
}
