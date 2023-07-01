public class ActionSave implements ActionListenerCommand{
    private TextDocument document;
    public ActionSave(TextDocument doc){
        this.document = doc;
    }

    @Override
    public void execute() {
        document.saveFile();
    }

    @Override
    public boolean undo(){
        System.out.println("Cannot undo Action: "+ this);
        return false;
        }
}
