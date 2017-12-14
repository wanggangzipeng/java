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
     }else if(weightinpound < 90){
         System.out.println("woolf");
     }
     else{
         System.out.println("large dog");
     }
    
 }
    
}
