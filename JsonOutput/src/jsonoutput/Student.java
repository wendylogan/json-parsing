package jsonoutput;

import java.util.Arrays;


public class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    // PhoneNumber is of type PhoneNUmber
    private PhoneNumber phoneNumber;
    // skills is an Array of Strings
    private String[] skills;
    
    public Student(String  studentInfo){
    String[] splitList = studentInfo.split(", ");
        this.firstName = splitList[1].trim();
        this.lastName = splitList[0].trim();
        this.gpa = Double.parseDouble(splitList[2].trim());
        // Object of type PhoneNumber (areaCode, prefix, lineNum)
        this.phoneNumber = new PhoneNumber(splitList[3]);
        this.skills = splitList[4].split(";");
    }  
    @Override
    public String toString(){
        String returnLine = "[firstName: "+this.firstName + ", lastName: " + this.lastName;
        returnLine+= ", gpa: " + this.gpa + ", phoneNumber: " + this.phoneNumber + ", skills: [";
        
        // alphabetize skills in this.skills in a holder "sorted"
        String[] sorted = this.skills;
        for (int i = 0; i < sorted.length-1; i++){
            for (int j = i+1; j < sorted.length; j++){
                if (sorted[i].compareTo(sorted[j])>0){
                    String temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        returnLine += Arrays.toString(sorted);
        return returnLine;
    }
}
