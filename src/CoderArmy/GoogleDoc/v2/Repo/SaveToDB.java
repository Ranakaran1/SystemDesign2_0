package CoderArmy.GoogleDoc.v2.Repo;

public class SaveToDB implements Dao{
    @Override
    public void save(String document) {
        System.out.println(document);
        System.out.println("Saved to DB...");
    }
}
