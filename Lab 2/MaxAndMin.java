import java.lang.Math;
class Boundaries{
  public static void main(String args[]){
    long t1=System.currentTimeMillis();
    int array[]=new int[1000];
    int min,max;
    for(int i=0;i<1000;i++){
      array[i]=(int)(Math.random()*1000); 
    }
    min=max=array[0];
    for(int i=0;i<1000;i++){
      if(array[i]>max){
        max=array[i];
      }
      else if(array[i]<min){
        min=array[i];
      }
    }
    System.out.println("Max: "+max+" Min: "+min);
    System.out.println("Time Lapsed: "+(System.currentTimeMillis()-t1));
  }
}
