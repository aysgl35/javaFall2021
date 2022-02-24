package day42_AbstractClasses;

public abstract class AbsPersonel {
	
	//class ve methodu abstract olarak tanimladigimda child classlar mecburen 
	//bu methodu override edecekler
	public abstract void statu();//method body si olmaz abstract methodlarin
	public abstract void abstractMethod();
	public void cancreteMethot() {
		System.out.println("personel classindaki concrete method calisti");
		
	}
}
	

	