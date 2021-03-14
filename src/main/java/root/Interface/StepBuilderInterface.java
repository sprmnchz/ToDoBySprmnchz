package root.Interface;

import java.util.HashMap;

public interface StepBuilderInterface {
    HashMap<Integer, String> getStep();
    StepBuilderInterface createStep();
}
