import java.util.ArrayList;

public class ActionAppendText implements ActionListenerCommand{
    private String toAppend;
    private TextDocument doc;

    public ActionAppendText(TextDocument doc_, String text){
        this.doc = doc_;
        this.toAppend = text;
        doc.addTextPrevious(doc.getTextTemp());
    }
    @Override
    public void execute() {
        doc.addTextPrevious(doc.getTextTemp());
        doc.setTextTemp(doc.getTextTemp()+toAppend);
    }
    @Override
    public boolean undo(){
        doc.setTextTemp(doc.popTextPrevious());
        return true;
    }
}
