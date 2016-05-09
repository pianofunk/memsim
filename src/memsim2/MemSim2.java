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
import javafx.scene.layout.VBox;
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
        
        
        
        //********Begin create logical page number grid**********************
        String[] pg = AddressGenerator.labelGenerator(15);
        
        ShapeCreator logicalPageNumber = new ShapeCreator(pg, 15,"logicalPageNumber");
        
        GridPane logicalPageNumberGrid = logicalPageNumber.getGrid();        
        //label.setPadding(insets);
        logicalPageNumberGrid.setGridLinesVisible(true);
        
        
        //*******End create logical page number grid***************
        
        
        //******Begin create logical  grid*************
        
        String[] data = AddressGenerator.bitGenerator(15);
        
        ShapeCreator logicalData = new ShapeCreator(data, 15,"logicalData");
        
        GridPane logicalDataGrid = logicalData.getGrid();
        //bits.setPadding(insets);
        logicalDataGrid.setGridLinesVisible(true);
        
        //*****End create logical data grid
        
        
        //***Begin create page table A page # ******
        
        String[] pageA = AddressGenerator.labelGenerator(15);
        
        ShapeCreator pageTableAPageNumber = new ShapeCreator(pageA, 15, "pageTableAPageNumber");
        GridPane  pageTableAPageNumberGrid = pageTableAPageNumber.getGrid();
        pageTableAPageNumberGrid.setGridLinesVisible(true);
        
        
        Font font = new Font("SansSerif",10);
        

        

        
//        Line line = new Line();
//        Arc arc = new Arc(1.0, 1.0, 30.0, 28.0, 43.2, 56.4);
        
        
    /*
        logical memory hbox
    */

        HBox logicalMemory = new HBox(0);
        Label logicalMemoryLabel = new Label();
        logicalMemoryLabel.setText("Logical Memory");
        logicalMemoryLabel.setLayoutX(39);
        logicalMemoryLabel.setLayoutY(174);
        
        logicalMemory.setStyle("-fx-background-color: yellow");
        logicalMemory.setLayoutX(39);
        logicalMemory.setLayoutY(192);


        /*
           PageTableA box
        */
        
        HBox pageTableA = new HBox(0);  //0 = spacing between nodes
        Label pageTableALabel = new Label();
        pageTableALabel.setText("Page Table A");
        pageTableALabel.setLayoutX(394);
        pageTableALabel.setLayoutY(174);
        
        pageTableA.setStyle("-fx-background-color: lemonchiffon");
        pageTableA.setLayoutX(394);
        pageTableA.setLayoutY(192);
        
        

        

        
        logicalMemory.getChildren().addAll(logicalPageNumberGrid, logicalDataGrid);
        pageTableA.getChildren().addAll(pageTableAPageNumberGrid);  //add 3 grids  
        /*
        End pageFile box***
        */
        
        /*
            PageTableB box
        */
        
        HBox pageTableB = new HBox(0);  //0 = spacing between nodes
        Label pageTableBLabel = new Label();
        pageTableBLabel.setText("Program Stack");
        pageTableBLabel.setLayoutX(394);
        pageTableBLabel.setLayoutY(480);
        
        pageTableB.setStyle("-fx-background-color: lemonchiffon");
        pageTableB.setLayoutX(394);
        pageTableB.setLayoutY(484);
        
        
        
        Button btnSim1 = new Button();
        btnSim1.setText("Sim 1");
        btnSim1.setStyle("-fx-background-color: lemonchiffon");
        
        Button btnSim2 = new Button();
        btnSim2.setText("Sim 2");
        btnSim2.setStyle("-fx-background-color: lemonchiffon");
        
        Button btnSim3 = new Button();
        btnSim3.setText("Sim 3");
        btnSim3.setStyle("-fx-background-color: lemonchiffon");
        
        Button btnSim4 = new Button();
        btnSim4.setText("Sim 4");
        btnSim4.setStyle("-fx-background-color: lemonchiffon");


        HBox buttonBox = new HBox(10);
        buttonBox.setPadding(insets);
        buttonBox.setMinHeight(60);
        buttonBox.setMinWidth(1000);
        buttonBox.getChildren().addAll(btnSim1, btnSim2,btnSim3, btnSim4);
        buttonBox.setLayoutX(39);
        buttonBox.setLayoutY(38);
        buttonBox.setStyle("-fx-background-color: indianred");


//add everything to pane before adding to scene
        Pane pane = new Pane();
        
        pane.getChildren().addAll(logicalMemory, logicalMemoryLabel, pageTableALabel, pageTableA, buttonBox);
        
        //pane.setPadding(insets);
        

        
        
        
        
        Scene scene = new Scene(pane, 800, 1200, DODGERBLUE);
        
        
        primaryStage.setTitle("Memory Sim");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
               btnSim1.setOnAction(new EventHandler<ActionEvent>() {
            
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
