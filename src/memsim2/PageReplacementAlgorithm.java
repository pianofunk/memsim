/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memsim2;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
/**
 *
 * @author jeek
 */
public abstract class PageReplacementAlgorithm {
    protected int faultCount = 0,
                  hitCount = 0,
                  address;
    protected ArrayList<Integer> frames;
    protected boolean[] bits;
    protected Id id = new Id();
    private final String name;
    protected Random random = new Random();
    public PageReplacementAlgorithm(String name){
        this.name = name;        
    }
    public abstract void calculate(GridPane pages, GridPane pageTableFrames,GridPane pageTableBits,GridPane frames, Stack<Integer>memoryAddressQueue, String[] framesMap);
    protected abstract void replacePage(int newPage,GridPane pages, GridPane pageTableFrames,GridPane pageTableBits,GridPane frames, String[] framesMap);
    protected void bitSetter(int bits){
        this.bits = new boolean[bits];
        for(int i = 0; i<this.bits.length; i++)
            this.bits[i] = false;
    }
    protected void frameSetter(String[] frames){
        this.frames = new ArrayList(frames.length);
        for(int i = 0; i<this.frames.size(); i++)
            this.frames.set(i, -1);
    }
    protected void printResults(){
    System.out.println(this.toString());
    }
    protected void replaceNode(GridPane gridPane, String id, String label){
        Text node = (Text) gridPane.lookup(id);
        node.setText(label);
    }
    protected int randomFrame(){
        return random.nextInt(frames.size());
    }
    @Override
    public String toString(){
        return name;
    }
}
