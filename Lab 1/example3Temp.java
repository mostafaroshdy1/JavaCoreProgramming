class Example3Temp{
  public static void main(String args[]){
  if(args.length!=2){
    System.out.println("The app need 2 arguments");
    return;
  }
	try {
	  int len=Integer.parseInt(args[0]);
		for(int i=0;i<len;i++){
		  System.out.println(args[1]);
	  }   
    }catch(NumberFormatException e){
		System.out.println("First argument must be a number "+ e);
	}    
  }
}
