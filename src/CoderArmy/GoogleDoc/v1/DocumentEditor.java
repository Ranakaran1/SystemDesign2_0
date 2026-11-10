package CoderArmy.GoogleDoc.v1;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    List<String> documentElement;
    StringBuilder renderDocument;

    public DocumentEditor() {
        documentElement = new ArrayList<>();
        renderDocument = new StringBuilder();
    }

    public void addText(String text){
        documentElement.add(text);
    }
    public void addImage(String image){
        documentElement.add(image);
    }
    String renderDocument(){
        if(renderDocument.isEmpty()){
            for(String ele : documentElement){
                if(ele.endsWith(".jpg")){
                    renderDocument.append("Image: [ " + ele+ " ]");
                }else{
                    renderDocument.append(ele);
                }
                renderDocument.append("\n");
            }
        }
        return renderDocument.toString();
    }
    void save(String doc){
        System.out.println("Saved to file");
        System.out.println(doc);
    }

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.addText("Henna");
        documentEditor.addText("Monn");
        documentEditor.addImage("Mohit.jpg");
        String str = documentEditor.renderDocument();
        documentEditor.save(str);
    }
}
