package corejava;

public class inheritance {
     public void print() {
    	 System.out.println("harsh");
     }
}  
     class simpleone extends inheritance{
    	 public void show() {
    		 System.out.println("patil");
    	 }
   }
     class runmethod{
    		public static void main(String[]args) {
    			simpleone s = new simpleone();
    			s.print();
    			s.show();
    		
    		}

    	}