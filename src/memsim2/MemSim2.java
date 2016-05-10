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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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
        String[] s = AddressGenerator.letterGenerator(15);
        
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
        

        String[] b = AddressGenerator.letterGenerator(15);
   
        ShapeCreator bitCreator = new ShapeCreator(b, 15,"bit");

        String[] data = AddressGenerator.letterGenerator(15);
        
        ShapeCreator logicalData = new ShapeCreator(data, 15,"logicalData");
       
        GridPane logicalDataGrid = logicalData.getGrid();
        //bits.setPadding(insets);

        logicalDataGrid.setGridLinesVisible(true);


        logicalDataGrid.setGridLinesVisible(true);

        //*****End create logical data grid

        
        //*****End create single bit grid
        
        //***Begin create main memory grid****
        
        String[] m = AddressGenerator.addressGenerator(256);
        ShapeCreator mainM = new ShapeCreator(m, 256,"main");
        GridPane mainMemory = mainM.getGrid();
        mainMemory.setGridLinesVisible(true);
        
        //***Begin create page table A page # ******
        
        String[] pageA = AddressGenerator.labelGenerator(15);
        
        ShapeCreator pageTableAPageNumber = new ShapeCreator(pageA, 15, 2);
        GridPane  pageTableAPageNumberGrid = pageTableAPageNumber.getGrid();
        pageTableAPageNumberGrid.setGridLinesVisible(true);
        
        
          //***Begin create page table B page # ******
          String[] pageB = AddressGenerator.labelGenerator(15);
          ShapeCreator pageTableBPageNumber = new ShapeCreator(pageB, 15, 2);
          GridPane pageTableBPageNumberGrid = pageTableBPageNumber.getGrid();
          pageTableBPageNumberGrid.setGridLinesVisible(true);
          
          
          //***Begin create pageTableAframe****
          String[] frameA = AddressGenerator.numberGenerator(15);
          ShapeCreator pageTableAFrameNumber = new ShapeCreator(frameA, 15, "pageTableAFrame");
          GridPane pageTableAFrameNumberGrid = pageTableAFrameNumber.getGrid();
          pageTableAFrameNumberGrid.setGridLinesVisible(true);
          
          
        //***Begin create pageTableBframe****
          String[] frameB = AddressGenerator.numberGenerator(15);
          ShapeCreator pageTableBFrameNumber = new ShapeCreator(frameB, 15, "pageTableAFrame");
          GridPane pageTableBFrameNumberGrid = pageTableBFrameNumber.getGrid();
          pageTableBFrameNumberGrid.setGridLinesVisible(true);
          
          //c = 1 for validationBit  c = 2 for pageTableId  c = 3 for Physical memory
          //***Begin create pageTableAValidBit ****
          String[] validA = AddressGenerator.bitGenerator(15);
          ShapeCreator pageTableAValidBit = new ShapeCreator(validA, 15, 1);
          GridPane pageTableAValidBitGrid = pageTableAValidBit.getGrid();
          pageTableAValidBitGrid.setGridLinesVisible(true);
          
          
          //***Begin create pageTableBValidBit ***
          String[] validB = AddressGenerator.bitGenerator(15);
          ShapeCreator pageTableBValidBit = new ShapeCreator(validB, 15, 1);
          GridPane pageTableBValidBitGrid = pageTableBValidBit.getGrid();
          pageTableBValidBitGrid.setGridLinesVisible(true);
          
          
          
        //***Begin create pageTableADirtyBit ****
          String[] dirtyA = AddressGenerator.bitGenerator(15);
          ShapeCreator pageTableADirtyBit = new ShapeCreator(dirtyA, 15, "pageTableADirty");
          GridPane pageTableADirtyBitGrid = pageTableADirtyBit.getGrid();
          pageTableADirtyBitGrid.setGridLinesVisible(true);
          
          
          //***Begin create pageTableBDirtyBit ***
          String[] dirtyB = AddressGenerator.bitGenerator(15);
          ShapeCreator pageTableBDirtyBit = new ShapeCreator(dirtyB, 15, "pageTableBDirty");
          GridPane pageTableBDirtyBitGrid = pageTableBDirtyBit.getGrid();
          pageTableBDirtyBitGrid.setGridLinesVisible(true);
        
                //******Begin create phsycial page  grid*************
 
        String[] phys = AddressGenerator.mainMemoryGenerator(15);
        ShapeCreator physicalPage = new ShapeCreator(phys, 15,3);
        GridPane physicalPageGrid = physicalPage.getGrid();
        //bits.setPadding(insets);
        physicalPageGrid.setGridLinesVisible(true);
        
        
        String[] pData = AddressGenerator.letterGenerator(15);
        ShapeCreator physicalData = new ShapeCreator(pData, 15, "phsyicalData");
        GridPane physicalDataGrid = physicalData.getGrid();
        physicalDataGrid.setGridLinesVisible(true);
        
        
        
        
        //*****End create physical data grid
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        
        logicalMemory.getChildren().addAll(logicalPageNumberGrid, logicalDataGrid);

        /*
           PageTableA Hbox
        */
        
        HBox pageTableA = new HBox(0);  //0 = spacing between nodes
        Label pageTableALabel = new Label();
        pageTableALabel.setText("Page Table A");
        pageTableALabel.setLayoutX(394);
        pageTableALabel.setLayoutY(174);
        

        

        

        pageTableA.setStyle("-fx-background-color: lemonchiffon");
        pageTableA.setLayoutX(394);
        pageTableA.setLayoutY(192);


        
        pageTableA.getChildren().addAll(pageTableAPageNumberGrid, pageTableAFrameNumberGrid, pageTableAValidBitGrid, pageTableADirtyBitGrid);  //add 3 grids  
        /*
        End pageTableA box***
        */
        
        
        
        /*
            PageTableB Hbox
        */
        
        HBox pageTableB = new HBox(0);  //0 = spacing between nodes
        Label pageTableBLabel = new Label();
        pageTableBLabel.setText("Page Table B");
        pageTableBLabel.setLayoutX(394);
        pageTableBLabel.setLayoutY(464);
        
        pageTableB.setStyle("-fx-background-color: lemonchiffon");
        pageTableB.setLayoutX(394);
        pageTableB.setLayoutY(484);
        
        pageTableB.getChildren().addAll(pageTableBPageNumberGrid, pageTableBFrameNumberGrid, pageTableBValidBitGrid, pageTableBDirtyBitGrid);
        
        
        //end PageTableB
        
        
        
        /*
        physical memory hbox
        */

        HBox physicalMemory = new HBox(0);
        Label physicalMemoryLabel = new Label();
        physicalMemoryLabel.setText("Physical Memory");
        physicalMemoryLabel.setLayoutX(749);
        physicalMemoryLabel.setLayoutY(174);
        
        physicalMemory.setStyle("-fx-background-color: yellow");
        physicalMemory.setLayoutX(749);
        physicalMemory.setLayoutY(192);
        
        physicalMemory.getChildren().addAll(physicalPageGrid, physicalDataGrid);
        
        //end physical memory hbox
        
        
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
        
        pane.getChildren().addAll(logicalMemory, logicalMemoryLabel, pageTableALabel, pageTableA, pageTableB, pageTableBLabel, physicalMemory, physicalMemoryLabel, buttonBox);
        
        //pane.setPadding(insets);
        

        
        
        
        
        Scene scene = new Scene(pane, 1200, 800, DODGERBLUE);
        
        
        primaryStage.setTitle("Memory Sim");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
               btnSim1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                Text changeNode = new Text(); 
                
                changeNode = (Text) scene.lookup("#page0010"); //this searches for CSS id
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
