public class ActionOpen implements ActionListenerCommand{
    private TextDocument document;

    public ActionOpen(TextDocument doc){
        this.document = doc;
    }
    @Override
    public void execute() {
        document.openFile();
    }
    @Override
    public boolean undo(){
        System.out.println("Cannot undo Action: "+ this);
        return false;
    }
}
