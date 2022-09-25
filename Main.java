/*
Core implementation has unlimited submissions
o This will help you make sure the basic actions of your program are working properly in the
environment
• Final submission is limited to 15 submissions
o White space will be checked
MUST BE IN .DOCX OR .PDF FORMAT
 *
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{

//    int[ ][ ] a = new int[2][4];  // Two rows and four columns.
//    a[0][0] a[0][1] a[0][2] a[0][3]
//    a[1][0] a[1][1] a[1][2] a[1][3]
//    a[0] ->  [0] [1] [2] [3]
//    a[1] ->  [0] [1] [2] [3]
    static Creature[][] creatures = new Creature[10][10];
    final static char NORTH = 'N', EAST = 'E', SOUTH = 'S', WEST = 'W';
    final static int BOARD_SIZE = 10;
    static int turns = 0;

    public static void main(String args[]) throws IOException {
        FileInputStream file = setUserSettings();
        initializeGameBoard(file);
        int count = 1;
        while(turns > 0){
            System.out.println("TURN " + count);
            drawBoard();
            nextRound();
            turns--;
            count++;
        }

    }


    static void moveCreature(Creature creature, int ypos, int xpos){
        //swap creature to new space, set old space to null
    }


    static void nextRound(){


    }



    static void beetlesMove(){
        for(int x = 0; x < 10; x++){
            for(int y = 0; y <10; y++){
                if(creatures[y][x] instanceof Beetle){

                }
            }
        }
    }


    static void antsMove(){

    }


    public static void beetlesStarve() {

    }


    public static void antsBreed(){

    }

    public static void beetlesBreed(){

    }



    //==========Ancilarry functions
    static void initializeGameBoard(FileInputStream file) throws IOException {
        Reader reader = new InputStreamReader(file);
        Ant tempAnt;
        Beetle tempBeetle;
        char character;

        for(int y = 0; y <= BOARD_SIZE; y++) {
            for (int x = 0; x <= BOARD_SIZE; x++) {
                character = (char) reader.read();
                if (character == Ant.icon) {
                    creatures[y][x] = new Ant();
                }
                if (character == Beetle.icon) {
                    creatures[y][x] = new Beetle();
                }
            }
        }

    }

    static void drawBoard(){
        for(int y = 0; y < BOARD_SIZE; y++) {
            for (int x = 0; x < BOARD_SIZE; x++) {
                if(creatures[y][x] instanceof Ant){
                    System.out.print(Ant.icon);
                } else if(creatures[y][x] instanceof Beetle){
                    System.out.print(Beetle.icon);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static FileInputStream setUserSettings() throws IOException {
        char icon;
        Scanner scnner = new Scanner(System.in);

        System.out.print("Please enter the name of the file: ");
        //REPLACE FOR FINAL FileInputStream file = new FileInputStream(scnner.nextLine());
        FileInputStream file = new FileInputStream("./Text files/world.txt");


        System.out.print("\nWhat character would you like to represent ants?: ");
        //icon = scnner.next().charAt(0);
        //Ant.icon = icon;
        Ant.icon = 'a';


        System.out.print("\nWhat character would you like to represent beetles?: ");
        //icon = scnner.next().charAt(0);
        //Beetle.icon = icon;
        Beetle.icon = 'B';

        System.out.print("\nHow many turns would you like to watch?: ");
        turns = Integer.parseInt(scnner.next());

        scnner.close();
        return file;
    }
}

/*    static void drawBoard(){
        int BOARD_SIZE = 10;
        boolean printflag = false;
        char icon;
        for(int y = 0; y <= BOARD_SIZE; y++) {
            for (int x = 0; x <= BOARD_SIZE; x++) {
                for(Beetle beetle : Beetle.beetleList){
                    if(beetle.[0] == x && beetle.[1] == y) {
                        System.out.print(Beetle.icon);
                        printflag = true;
                    }
                }
                for(Ant ant : Ant.antList){
                    if(ant.[0] == x && ant.[1] == y) {
                        System.out.print(ant.icon);
                        printflag = true;
                    }
                }
                if(!printflag){
                    System.out.print(" ");
                }
                printflag = false;
            }
            System.out.println();
        }
    }

 */