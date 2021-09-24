package magazine;

public class MagazineCollector implements MagazineAbstractCollector {

	static final int MAX = 5;
    int items = 0;
    Magazine[] magazineList;
  
    public MagazineCollector()
    {
        magazineList = new Magazine[MAX];
  
        // Let us add some dummy notifications
        addItem(1, "Fashion Magazine", "Fashion Trends");
        addItem(2, "Techology Magazine","Technology Trends");
        addItem(3, "Food Magazine","Food Trends");
    }
  
    public void addItem(int id, String str, String type)
    {
        Magazine magazine = new Magazine(id, str, type);
        if (items >= MAX)
            System.err.println("Full");
        else
        {
            magazineList[items] = magazine;
            items = items + 1;
        }
    }
  
	@Override
	public MagazineAbstractIterator getIterator() {
		return new MagazineIterator(magazineList);
	}

}
