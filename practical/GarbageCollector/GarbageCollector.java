package corejava;

 class GarbageCollector {
	
	 public void finalize() {
		 //print 
	 System.out.println("Garbage collected object");
	 }
	public static void main(String[] args) {
	//create the object
       GarbageCollector g1 = new GarbageCollector();
       GarbageCollector g2 = new GarbageCollector();
       
       g1=null;
       g2=null;
       //use garbage collector method
       System.gc();
	}

}
