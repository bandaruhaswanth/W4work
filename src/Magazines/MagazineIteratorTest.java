package magazine;

public class MagazineIteratorTest {

	public static void main(String args[])
    {
	
	 MagazineCollector magazines = new MagazineCollector() ;
	 MagazineAbstractIterator iterator = magazines.getIterator();
     System.out.println("Magazines are:");
     while (iterator.hasnext())
     {
         Magazine h = (Magazine)iterator.next();
         System.out.println(h.getId()+ ". "+h.getName()+ ". "+h.getType());
     }
}
}