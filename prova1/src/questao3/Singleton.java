package questao3;

public class Singleton {
	 
	 private static Singleton instance;
	 private int id;	 
	 
	 public static Singleton getInstance(){  
		 
	   if (instance == null){
	      instance = new Singleton();
	   }
	   
	   return instance;
	 }

	 private Singleton(){
		id = 123;
	 }
	 

//atributos e m�todos da classe 
   public int getId(){
   	return id;
   }
   
   public void setId(int vId){
   	id = vId;
   }  
   
}