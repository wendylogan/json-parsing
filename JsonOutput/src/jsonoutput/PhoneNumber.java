package jsonoutput;

public class PhoneNumber {
    private int areaCode = 0;
    private int prefix = 0;
    private int lineNum = 0;
    
    public PhoneNumber(String studentNumbers){
        String[] splitList = studentNumbers.trim().split("-");
        
        // three integer fields for areaCode, prefix, and lineNum
        this.areaCode = Integer.parseInt(splitList[0]);
        this.prefix = Integer.parseInt(splitList[1]);
        this.lineNum = Integer.parseInt(splitList[2]);
    }
    @Override
    public String toString(){
        String phone = "(" + areaCode + ") " + prefix + "-"+ lineNum;
        return phone;
    }
}