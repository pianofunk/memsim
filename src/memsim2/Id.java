/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memsim2;

/**
 *
 * @author jeek
 */
public class Id {
    public String pageTableId(int id){
    switch(id){
        case 0:
            return PageTableEnum.PT_ZERO.toString();
        case 1:
            return PageTableEnum.PT_ONE.toString();
        case 2:
            return PageTableEnum.PT_TWO.toString();
        case 3:
            return PageTableEnum.PT_THREE.toString();
        case 4:
            return PageTableEnum.PT_FOUR.toString();
        case 5:
            return PageTableEnum.PT_FIVE.toString();
        case 6:
            return PageTableEnum.PT_SIX.toString();
        case 7:
            return PageTableEnum.PT_SEVEN.toString();
        case 8:
            return PageTableEnum.PT_EIGHT.toString();
        case 9:
            return PageTableEnum.PT_NINE.toString();
        case 10:
            return PageTableEnum.PT_TEN.toString();
        case 11:
            return PageTableEnum.PT_ELEVEN.toString();
        case 12:
            return PageTableEnum.PT_TWELVE.toString();
        case 13:
            return PageTableEnum.PT_THIRTEEN.toString();
        case 14:
            return PageTableEnum.PT_FOURTEEN.toString();
        default:
            return null;            
    }
    }
    public String physicalMemoryId(int id){
    switch(id){
        case 0:
            return PhysicalMemoryEnum.PM_ZERO.toString();
        case 1:
            return PhysicalMemoryEnum.PM_ONE.toString();
        case 2:
            return PhysicalMemoryEnum.PM_TWO.toString();
        case 3:
            return PhysicalMemoryEnum.PM_THREE.toString();
        case 4:
            return PhysicalMemoryEnum.PM_FOUR.toString();
        case 5:
            return PhysicalMemoryEnum.PM_FIVE.toString();
        case 6:
            return PhysicalMemoryEnum.PM_SIX.toString();
        case 7:
            return PhysicalMemoryEnum.PM_SEVEN.toString();
        case 8:
            return PhysicalMemoryEnum.PM_EIGHT.toString();
        case 9:
            return PhysicalMemoryEnum.PM_NINE.toString();
        case 10:
            return PhysicalMemoryEnum.PM_TEN.toString();
        case 11:
            return PhysicalMemoryEnum.PM_ELEVEN.toString();
        case 12:
            return PhysicalMemoryEnum.PM_TWELVE.toString();
        case 13:
            return PhysicalMemoryEnum.PM_THIRTEEN.toString();
        case 14:
            return PhysicalMemoryEnum.PM_FOURTEEN.toString();
        default:
            return null;            
    }
    }
    public String validationBitId(int id){
    switch(id){
        case 0:
            return ValidationBitsEnum.VB_ZERO.toString();
        case 1:
            return ValidationBitsEnum.VB_ONE.toString();
        case 2:
            return ValidationBitsEnum.VB_TWO.toString();
        case 3:
            return ValidationBitsEnum.VB_THREE.toString();
        case 4:
            return ValidationBitsEnum.VB_FOUR.toString();
        case 5:
            return ValidationBitsEnum.VB_FIVE.toString();
        case 6:
            return ValidationBitsEnum.VB_SIX.toString();
        case 7:
            return ValidationBitsEnum.VB_SEVEN.toString();
        case 8:
            return ValidationBitsEnum.VB_EIGHT.toString();
        case 9:
            return ValidationBitsEnum.VB_NINE.toString();
        case 10:
            return ValidationBitsEnum.VB_TEN.toString();
        case 11:
            return ValidationBitsEnum.VB_ELEVEN.toString();
        case 12:
            return ValidationBitsEnum.VB_TWELVE.toString();
        case 13:
            return ValidationBitsEnum.VB_THIRTEEN.toString();
        case 14:
            return ValidationBitsEnum.VB_FOURTEEN.toString();
        default:
            return null;            
    }
    }
}
