import java.util.*;

public class Unit2 {
    //states
    enum State{
        CLEAR, CLOUDY, RAINING, SEVERE_WEATHER;
    }
    //transition logic
    static State[] stateFlow = {State.CLEAR, State.CLOUDY, State.RAINING, State.SEVERE_WEATHER};

    //simulating events with random object
    static Random random = new Random();

    public static void main(String[] args){
        //starting state
        State currentState = State.CLEAR;

        //7 days
        for (int day = 1; day <=7; day++){
            System.out.println("Day "+ day + " starting with "+ currentState);

            //5 events per day
            for (int event = 1; event <= 5; event++){
                currentState = transitionState(currentState);
                System.out.println("  Event "+event+": "+currentState);
            }
        }
    }
    //transition based on random number
    public static State transitionState(State currentState){
        int currentIndex = getStateIndex(currentState);
        int randomNum = random.nextInt(3);

        if (randomNum == 0 && currentIndex > 0){
            currentIndex--;
        }
        else if (randomNum == 1){

        }
        else if (randomNum == 2 && currentIndex < stateFlow.length - 1){
            currentIndex++;
        }
        return stateFlow[currentIndex];
    }
    //get index of current state
    public static int getStateIndex(State state){
        for (int i=0; i< stateFlow.length; i++){
            if (stateFlow[i] == state){
                return i;
            }
        }
        return -1; //error
    }
}
