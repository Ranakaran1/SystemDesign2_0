package CoderArmy.GoogleDoc.v2;

import CoderArmy.GoogleDoc.v2.DocumentEditor;
import CoderArmy.GoogleDoc.v2.Document_.Document;
import CoderArmy.GoogleDoc.v2.Repo.Dao;
import CoderArmy.GoogleDoc.v2.Repo.SaveToFile;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Dao saveToFile = new SaveToFile();

        DocumentEditor documentEditor = new DocumentEditor(document,saveToFile);
        documentEditor.addText("Mohana");
        documentEditor.addText("Sohana");
        documentEditor.addImage("imkl.jpg");
        String render = documentEditor.render();
        documentEditor.saveToDB(render);
    }
}
