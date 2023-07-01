import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;
import java.util.ArrayList;

public class TextDocument {
    private File file;
    private ArrayList<String> textPrevious = new ArrayList<String>();
    private String textTemp = "";

    public TextDocument(String filename){
        this.file = new File(filename+".txt");
        try{
            if (file.createNewFile()) {
                System.out.println("File created: "+file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    public String getTextTemp() {
        return textTemp;
    }

    public void setTextTemp(String text){
        this.textTemp = text;
    }
    public void addTextPrevious(String text){
        this.textPrevious.add(text);
    }
    public String popTextPrevious(){
        String temp = this.textPrevious.get(textPrevious.size()-1);
        this.textPrevious.remove(textPrevious.size()-1);
        return temp;
    }

    public void openFile(){
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) {
            try {
                desktop.open(file);
                System.out.println("File \"" + file.getName() + "\" opened");
            } catch (IOException e) {
                System.out.println("An error occured");
            }
        } else {
            System.out.println("File was not found");
        }
    }

    public void saveFile(){
        try{
            FileWriter fileWriter = new FileWriter(this.file, true);
            fileWriter.append(textTemp);
            fileWriter.close();
            setTextTemp("");
            textPrevious.clear();
            System.out.println("File \""+ file.getName()+ "\" saved");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
