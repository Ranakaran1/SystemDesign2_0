package CoderArmy.GoogleDoc.v2.Document_;

import CoderArmy.GoogleDoc.v2.DocEle.DocumentElement;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class Document {
    List<DocumentElement> documentElementList;
    StringBuilder doc;

    public Document() {
        documentElementList = new ArrayList<>();
        doc = new StringBuilder();
    }
    public void addElement(DocumentElement documentElement){
        documentElementList.add(documentElement);
    }

    public String render(){
        for(DocumentElement documentElement : documentElementList){
            doc.append(documentElement.renderElement()).append("\n");
        }
        return doc.toString();
    }
}
