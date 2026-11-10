package CoderArmy.GoogleDoc.v2;

import CoderArmy.GoogleDoc.v2.DocEle.DocumentElement;
import CoderArmy.GoogleDoc.v2.DocEle.ImageElement;
import CoderArmy.GoogleDoc.v2.DocEle.TextElement;
import CoderArmy.GoogleDoc.v2.Document_.Document;
import CoderArmy.GoogleDoc.v2.Repo.Dao;

import java.awt.*;

public class DocumentEditor {
    Document document;
    Dao db;

    public DocumentEditor(Document document, Dao db) {
        this.document = document;
        this.db = db;
    }
    public void addText(String text){
        DocumentElement documentElement = new TextElement(text);
        document.addElement(documentElement);
    }
    public void addImage(String path){
        DocumentElement documentElement = new ImageElement(path);
        document.addElement(documentElement);
    }
    public String render(){
        String doc = document.render();
        return doc;
    }
    public void saveToDB(String doc){
        db.save(doc);
    }
}
