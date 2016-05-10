/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memsim2;
import java.util.Stack;
import javafx.scene.layout.GridPane;
/**
 *
 * @author jeek
 */
public class MostFrequentlyUsed extends PageReplacementAlgorithm{
int[] useCount;    

public MostFrequentlyUsed(){
    super("Most Frequently Used");
    }
    @Override
    public void calculate(GridPane pages, GridPane pageTableFrames,GridPane pageTableBits,GridPane frames, Stack<Integer>memoryAddressQueue, String[] framesMap){
    frameSetter(framesMap);
    bitSetter(pageTableBits.getChildrenUnmodifiable().size());
    useCountSet(framesMap.length);
    for(int i = 0;i<memoryAddressQueue.size();i++){
        address = memoryAddressQueue.pop();
        if(this.frames.contains(address))
        {
            hitCount++;
            useCount[this.frames.indexOf(address)]++;
        }
        else
            replacePage(address,pages,pageTableFrames,pageTableBits,frames,framesMap);
    }
    }
    @Override
    public void replacePage(int newPage, GridPane pages, GridPane pageTableFrames,GridPane pageTableBits,GridPane frames, String[] framesMap){
        int findMostFreq = findMostFreq();
        int oldPage = this.frames.get(findMostFreq);
        bits[oldPage] = false;
        this.frames.set(findMostFreq,newPage);
        replaceNode(frames,framesMap[findMostFreq],"Victim!"); 
        replaceNode(frames,framesMap[findMostFreq]," ");
        replaceNode(frames,framesMap[findMostFreq],"Victim!");
        replaceNode(pageTableBits,id.validationBitId(newPage),Integer.toString(findMostFreq));
        replaceNode(frames,framesMap[findMostFreq],Integer.toString(newPage));
        replaceNode(pageTableFrames,id.pageTableId(newPage),Integer.toString(findMostFreq));
        
    }
    private int findMostFreq(){
    int biggest = 0;
    int biggestIndex = -1;
    for(int i=0 ;i<useCount.length ;i++){
        if(useCount[i]>biggest){
        biggest = useCount[i];
        biggestIndex = i;
        }
    }
    if(biggest == 0)
        return randomFrame();
    else
        return biggestIndex;
    }
    private void useCountSet(int count){
    useCount = new int[count];
    for(int i=0 ;i<useCount.length ;i++)
        useCount[i] = 0;
    }  
}
