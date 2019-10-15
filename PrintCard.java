
package card;

/**
 *
 * @author Parthu
 */
public class PrintCard {
    
    public static void main(String[] args){
    
         GenerateArray ga = new GenerateArray();
         ga.generate();//calls method to generate cards
        
         for(Card c1 : ga.deck){
            System.out.println(c1.getColors() + " " + c1.getValue());
         }
        
    }
    
}
