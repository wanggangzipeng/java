/**
 * dog
 */
public class dog {
    public int weightinpound;
    public static String bineon ="the dog 's dna'";
    public dog(int s){
        weightinpound =s;
    }
 public void makenoise() {
     if(weightinpound<10){
         System.out.println("yip");
     }else if(weightinpound <30 ){
         System.out.println("barkf");
     }
     else{
         System.out.println("large dog");
     }
    
 }
  public  static dog maxDog(dog d1,dog d2){
      if(d1.weightinpound > d2.weightinpound){
          return d1;
      }
      return d2;

  }  
}
