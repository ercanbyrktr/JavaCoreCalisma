package day12_forLoop_Faktoriyel;

public class C06_StringiTersCevirme {
    public static void main(String[] args) {
        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //        ve String’i tersine cevirip kaydedin.
        String input = "Java Candir, Can.";
        // output : ridnaC avaJ
        String output="";
        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
