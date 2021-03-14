package root.Target.Step;

import java.util.HashMap;
import root.InputKeyboard;
import root.Interface.StepBuilderInterface;
import root.Constructors.StepConstructors;


class StepBuilder implements StepBuilderInterface {

    private int keyStep;
    private String nameStep;
    private boolean checkStep;

    public void creatingFixedOrderSteps(){
        HashMap<Integer,String> stepTarget = new HashMap<>();
        System.out.println("enter step name");
        nameStep = InputKeyboard.keyboardScanner();
        StepConstructors Step = new StepConstructors(nameStep);

    }
    public void creatingNotFixedOrderSteps(){

    }

    @Override
    public HashMap<Integer, String> getStep() {
        return null;
    }

    @Override
    public StepBuilderInterface createStep() {
        return null;
    }
}
