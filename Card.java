
package card;

/**
 *
 * @author Parthu
 */
public class Card {

    public enum Colors {red,yellow,green,blue};
    public enum Value { ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAW_TWO,DRAW_FOUR,WILDCARD};
    
    private final Colors color;
    private final Value value;
    
    public Card(Colors c , Value v){
        
        this.color= c;
        this.value = v;
        
    }

    /**
     * @return the suit
     */
    public Colors getColors() {
        
        return color;
        
    }

    /**
     * @return the value
     */
    public Value getValue() {
        
        return value;
        
    }
    
}

