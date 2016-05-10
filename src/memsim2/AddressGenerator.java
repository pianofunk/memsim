/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memsim2;


/**
 *
 * @author midget
 */
public class AddressGenerator {
    //cllass generates addresses
    
    static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    //create an array of strings in the format {"1","2","3"..."n"}
    public static String[] labelGenerator(int size){
        
        String[] label = new String[size];
        
        for(int i = 0; i < size; i++){
            label[i] = Integer.toString(i);
        }
        
        return label;
    }
    
    //create an array of 0s
    public static String[] bitGenerator(int size){
        String[] bits = new String[size];
        
        for(int i= 0; i< size; i++){
            bits[i] = Integer.toString(0);
        }
        
        return bits;
        }

    

    
    
    public static String[] mainMemoryGenerator(int size){
        
        String[] mainMemory = new String[size];
        
        for(int i = 0; i < size; i++){
            mainMemory[i] = Integer.toString(i);
        }
        
        return mainMemory;
    }
    


    public static String[] numberGenerator(int size){
         String[] numbers = new String[size];

        for(int i=0; i< size; i++){
            numbers[i] = Integer.toString(i);
        }
        
        return numbers;

    }


    

    public static String[] letterGenerator(int size){
        String[] letters = new String[size];
        
        for(int i=0; i<size; i++){
            letters[i] = alphabet[i];
        }
        
        return letters;
    }

    
    //create an array of strings in the format {"0001","0010","0011","0100",...}
    public static String[] addressGenerator(int size){
    
        String[] ram = new String[size];
        
        for(int i = 0; i < size; i++){
            ram[i] = addZeros(i);
            }
        
        
        return ram;
    }
    
    
    //add leading zeros
    private static String addZeros(int i){
        switch (i){
            case 0:
            case 1: 
                return "000" + Integer.toBinaryString(i);
            
            case 2:
            case 3:
                return "00" + Integer.toBinaryString(i);
            
            case 4:
            case 5:
                return "0" + Integer.toBinaryString(i);
            
            case 6:
            case 7:
                return "0" + Integer.toBinaryString(i);
            
            default:
                return Integer.toBinaryString(i);
    }
}
    
    

}
    
    

