/**
 * dog
 */
public class dog {
    public int weightinpound;
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
    
}
