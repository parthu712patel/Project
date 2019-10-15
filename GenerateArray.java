/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author Parthu
 */
public class GenerateArray {
    
    
    public Card[] deck = new Card[60];//Array of object
    
    public void generate(){
        
         int count = 0 ;
            
         for(Card.Colors c : Card.Colors.values()){
               
                  for(Card.Value v : Card.Value.values()){
                
                           deck[count] = new Card(c,v);
                           count++;
                  }
         }
         
     }
    
}
