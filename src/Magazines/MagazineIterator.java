package magazine;

public class MagazineIterator implements MagazineAbstractIterator {

	Magazine[] magazineList;
	public int index = 0;
	public MagazineIterator(Magazine[] magazineList) {

		this.magazineList = magazineList;
	}

	@Override
	public boolean hasnext()
	{		
		if (index >= magazineList.length ||
		magazineList[index] == null)
	            return false;
	        else
	            return true;
	 }

	@Override
	public Object next() {
		 Magazine ham =  magazineList[index];
	        index += 1;
	        return ham;
	}

}
