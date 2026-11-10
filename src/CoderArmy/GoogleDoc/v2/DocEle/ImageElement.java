package CoderArmy.GoogleDoc.v2.DocEle;

public class ImageElement extends DocumentElement {
    String path;

    public ImageElement(String path) {
        this.path = path;
    }

    @Override
    public void addElement(String element) {
        this.path = element;
    }

    @Override
    public String renderElement() {
        return "Image:[ " +this.path + " ]";
    }
}
