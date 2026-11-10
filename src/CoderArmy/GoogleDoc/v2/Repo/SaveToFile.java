package CoderArmy.GoogleDoc.v2.Repo;

public class SaveToFile implements Dao{
    @Override
    public void save(String document) {
        System.out.println("Saved to File");
        System.out.println(document);
    }
}
