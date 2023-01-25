package Memento;

import java.util.Stack;

//The CareTake class to store all previous states
public class StateHistory {
    Stack<DocumentState> history;

    /***
     * Constructor that creates an empty history
     */
    public StateHistory() {
        history = new Stack<>();
    }

    /***
     *
     * @param state latest state to store
     */
    public void saveState(DocumentState state){
        history.push(state);
    }

    /***
     *
     * @return DocumentState Last Stored State
     */
    public DocumentState restoreState(){
        if(history.isEmpty())
            return null;
        return history.pop();
    }
}
