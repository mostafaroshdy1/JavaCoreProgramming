import java.lang.Math;
import java.util.Scanner;
class binarySearch{
  public static void main(String args[]){
    int array[]=new int[1000];
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    long t1=System.currentTimeMillis();
    for(int i=0;i<array.length;i++){
      array[i]=(int)(Math.random()*1000); 
    }
    for(int i=0;i<array.length;i++){
      for(int j=i;j<array.length;j++){
        if(array[j]<array[i]){
          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;
        }
      }
    } 
    /*
    for(int i=0;i<1000;i++){
      System.out.println(array[i]);
    }
    */
    int l=0,r=array.length-1;
    
    boolean found =false;
    while(l<=r&&!found){
      int mid =l+(r-l)/2;
      if(array[mid]==num){
        found = true;
      }
      else if (array[mid]>num){
        r=mid-1;
      }
      else if (array[mid]<num){
        l=mid+1;
      }
      if(found){
        System.out.println("FOUND : "+array[mid]);
      }
    } 
     System.out.println("Time Lapsed: "+(System.currentTimeMillis()-t1));
  }
}
