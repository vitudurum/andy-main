package ch.bbw;

import java.util.Scanner;

public class JavaStringsVerketten
{


        public static void main(String[] args) {
            String [] texte = new String [2];

            Scanner scan = new Scanner(System.in);

            for (int i =0 ; i< texte.length;i++){
                System.out.println("gib Text ein!");
                texte[i]=scan.next();
            }

            System.out.println(texte[0]+texte[1]);
        }
    }
