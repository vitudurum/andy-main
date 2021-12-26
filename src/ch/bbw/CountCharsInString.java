package ch.bbw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountCharsInString
{


    public static void main(String[] args) throws IOException
    {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Gib was ein: ");
        String eingabe = br.readLine();
        System.out.println("Du hast " + eingabe + " eingegeben.");
        int length = eingabe.length();
        System.out.println("Dieser String enthält " +eingabe.length() +" Zeichen");
//Ich weiss nicht wie b und c gehen
//
}
}

