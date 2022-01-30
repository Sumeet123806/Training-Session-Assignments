package project;

public class GetCategoryInfo {
  public void getcategory(int n) throws InterruptedException {
	   Fetchcategory fc = new Fetchcategory();
	    fc.getcategory();
	    
	    switch(n) {
	    
	    case 1:{
	    	System.out.println("Just a Moment....");
	    	Thread.sleep(3000);
	    	System.out.println("Here are all products under Talcum Powder category....");
	    	GetCategoryDetails gdt = new GetCategoryDetails();
	    	gdt.getres();
	    	
	    	System.out.println();
	    	System.out.println("1.Return to Main Menu \n 2.Logout");
	    
	    	
	    	
	    	
	    	break;
	    }
	    
	    case 2:{
	    	
	    	System.out.println("Just a Moment....");
	    	Thread.sleep(3000);
	    	System.out.println("Here are all products under Ayurvedic Foods category....");
	    	GetCategoryDetails gdt = new GetCategoryDetails();
	    	gdt.getres1();
	    	break;
	    	
	    }
	    
	    
	    case 3:{
	    
	    	System.out.println("Just a Moment....");
	    	Thread.sleep(3000);
	    	System.out.println("Here are all products under Disinfectants  category....");
	    	GetCategoryDetails gdt = new GetCategoryDetails();
	    	gdt.getres2();	
	    	break;
	    }
	    
	    
	    
	    
	    case 4:{
	    	
	    	System.out.println("Just a Moment....");
	    	Thread.sleep(3000);
	    	System.out.println("Here are all products under Pain Relief  category....");
	    	GetCategoryDetails gdt = new GetCategoryDetails();
	    	gdt.getres2();	
	    	break;
	     }
	    
	    
	    }
	    	
  }
}
