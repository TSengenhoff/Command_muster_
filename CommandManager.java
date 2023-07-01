import java.util.Stack;

public class CommandManager {
    private Stack<ActionListenerCommand> undoItems = new Stack<ActionListenerCommand>();

    public void executeCommand(ActionListenerCommand cmd){
        undoItems.push(cmd);
        cmd.execute();
    }

    public void undoCommand(){
        if(undoItems.peek().undo()){
            undoItems.pop();
        }
    }
}
