package com.company;


public class Board {

    /*String[][] board;
    public Board(){
        board = new String[][]{
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "},
                {"  ", "  ", "  ", "  ", "  ", "  ", "  ", "  "}
        };
    }*/

    public static void printBoard(){

        System.out.println(" +-----------------------+");
        for(int r = 0; r<8; r++){
            System.out.print(8-r + "|");
            for(int c = 0; c<8; c++){
                if(Main.engine.getPieceTypeByCoord(c+1,8-r).equals("")){
                    System.out.print("  ");
                }else{
                    System.out.print(Main.engine.getPieceTypeByCoord(c+1, 8-r));
                }
                System.out.print("|");
                if(c==7){
                    System.out.println("");
                }
            }
        }
        System.out.println(" +-----------------------+");
        System.out.println("  A  B  C  D  E  F  G  H");
    }

}
