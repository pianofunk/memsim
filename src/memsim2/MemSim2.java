/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memsim2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import static javafx.scene.paint.Color.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author midget
 */
public class MemSim2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        
        
        Insets insets = new Insets(15.0,15.0,15.0,15.0);
        
        
        
        
        //************Begin create page grid *********************
        
        //String[] address = {"000", "001","010","011","101"};

        //create an array of given length of sequential binary numbers represented as strings
        String[] s = AddressGenerator.addressGenerator(15);
        
        //create gridPane
        ShapeCreator pageCreator = new ShapeCreator(s, 16,"page");
        
        GridPane page = pageCreator.getGrid();
        
        //page.setPadding(insets);
        page.setGridLinesVisible(true);
        
        
        //************End create page grid *********************
        
        
        
        //********Begin create label grid**********************
        String[] lbl = AddressGenerator.labelGenerator(15);
        
        ShapeCreator labelCreator = new ShapeCreator(lbl, 15,"label");
        
        GridPane label = labelCreator.getGrid();        
        //label.setPadding(insets);
        label.setGridLinesVisible(true);
        
        
        //*******End create label grid***************
        
        
        //******Begin create single bit grid*************
        
        String[] b = AddressGenerator.bitGenerator(15);
        
        ShapeCreator bitCreator = new ShapeCreator(b, 15,"bit");
        
        GridPane bits = bitCreator.getGrid();
        //bits.setPadding(insets);
        bits.setGridLinesVisible(true);
        
        //*****End create singe bit grid
        
        
        
        
        
        Font font = new Font("SansSerif",10);
        

        

        
//        Line line = new Line();
//        Arc arc = new Arc(1.0, 1.0, 30.0, 28.0, 43.2, 56.4);
        

        /*
            System stack box
        */
        
        HBox pageFile = new HBox(0);  //0 = spacing between nodes
        Label stack = new Label();
        stack.setText("Program Stack");
        stack.setLayoutX(10);
        stack.setLayoutY(30);
        
        
        pageFile.setLayoutX(27.0);
        pageFile.setLayoutY(55.0);
        
        

        
                     Button btn = new Button();
        btn.setText("Say 'Hello World'");
        
        
        pageFile.getChildren().addAll(label, page, bits, btn);  //add 3 grids  
        /*
        End system stack box
        */
        
        
        
        Pane pane = new Pane();
        
        pane.getChildren().addAll(stack, pageFile);
        
        //pane.setPadding(insets);
        

        
        
        
        
        Scene scene = new Scene(pane, 500, 500, DODGERBLUE);
        
        
        primaryStage.setTitle("Memory Sim");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
               btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                Text changeNode = new Text(); 
                changeNode = (Text) scene.lookup("#page0010"); //this searches for CSS id
                System.out.println(changeNode.getLayoutX() + " Y Pos: " + changeNode.getLayoutX());
                changeNode.setText("Found");
               // changeNode.setText("change");   //line throws error
                
            }
        });
        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
   
 
        
    }
    
}
