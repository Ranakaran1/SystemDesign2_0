package CoderArmy.GoogleDoc.v2.DocEle;

public class TextElement extends DocumentElement {
    String text;

    public TextElement(String text) {
        this.text = text;
    }

    @Override
    public void addElement(String element) {
        this.text = element;
    }

    @Override
    public String renderElement() {
        return text;
    }
}
