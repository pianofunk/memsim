/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memsim2;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author midget
 */
public class ShapeCreator {
    
        int col = 0;
        int row = 0;

        Text text = new Text();
        Rectangle rectangle = new Rectangle();
        GridPane gridPane = new GridPane();
        Insets insets = new Insets(10.0,10.0,10.0,10.0);
        
        
        
       public ShapeCreator(String[] addresses, int memoryLength, String prefix){
//        
//            InvalidationListner myListner = new InvalidationListener(){
//                @Override
//                public void invalidated(Observable observable) {
//                    text.setStyle("-fx-background-color: green");
//                }
//                
//            };
            
            
            
            for(int i = 0; i < addresses.length; i++){
                
                rectangle = new Rectangle(40, 15, BLANCHEDALMOND);
                
                
                
                text = new Text(addresses[i]);
                text.setId(prefix + text.getText());
                //System.out.println(text.getId());
                
              //  text.textProperty().addListener(myListener);
                
                    gridPane.add(rectangle, col, row);
                    gridPane.add(text, col, row); 
                    
                    
                    

                row++;
            
                if((i+1)% memoryLength == 0){
                    col++;
                    row = 0;
                }
        }
        }
        
        
        public GridPane getGrid(){
            return gridPane;
        }

}
