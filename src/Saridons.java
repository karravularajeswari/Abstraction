abstract class Tablets {
	static String s;
	abstract void work();
	 public void melt()
	 {
		 System.out.println("tablet is melting");
	 }
	static public void killDiseases()
	 {
		 System.out.println("killing the disease");
	 }
	static public void killDiseases(String s)
	{
		System.out.println("diseases was killed by any tablets ");
	}

}
 class Saridons extends Tablets{
	void work()
	{
		System.out.println("saridon is working");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saridons s=new Saridons();
		Tablets.killDiseases();
		s.melt();
		s.work();
		Tablets.killDiseases("paracetmol");
		System.out.println(Tablets.s="xyz");
		//System.out.println(Saridons.s="pqr");

	}

}
