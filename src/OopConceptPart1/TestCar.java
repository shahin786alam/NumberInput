 package OopConceptPart1;

public class TestCar {

	public static void main(String[] args) {
		//static polymorphism/compile time 
		BMW b=new BMW(); //child class object with the child class object referane its call static or compile time poly
        b.start();
        b.stop();
        b.refuel();
        b.theftsafty();
        b.engine();
        
        System.out.println("============");
        Car c=new Car();
        c.start();
        c.stop();
        c.refuel();
        c.engine();
        System.out.println("=============");
        //dynamic polymorphism/run time polymorphism
        // 1. top casting
      Car c1=  new BMW();//child class object with the parente class object refreane its call dynamic or run time poly.
       c1.start();
       c1.stop(); 
       c1.refuel();
       c1.engine();
       
       System.out.println("=============");
       //2. down casting
     BMW b1=(BMW)  new Car();
     b1.start();
       
	}

}
