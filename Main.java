public class Main {
    public static void main(String[] args){
        TextDocument doc = new TextDocument("Textdokument");
        CommandManager commandManger = new CommandManager();
        ActionAppendText append1 = new ActionAppendText(doc, "Das ist ein Satz.\n");
        ActionAppendText append2 = new ActionAppendText(doc, "Das ist ein anderer Satz.\n");
        ActionSave save = new ActionSave(doc);
        ActionOpen open = new ActionOpen(doc);
        /*
        commandManger.executeCommand(append1);
        commandManger.executeCommand(append1);
        commandManger.undoCommand();
        commandManger.executeCommand(append2);
        commandManger.executeCommand(append1);
        commandManger.executeCommand(append1);
        commandManger.undoCommand();
        commandManger.undoCommand();
        commandManger.executeCommand(save);
        commandManger.undoCommand();
        commandManger.undoCommand();
        commandManger.executeCommand(open);
         */
    }
}
