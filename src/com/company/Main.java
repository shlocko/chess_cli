package com.company;

import java.util.Scanner;

public class Main {
    static Engine engine;
    public static void main(String[] args) {
        engine = new Engine();
        Scanner scanner = new Scanner(System.in);
        while(true){
            Board.printBoard();
            System.out.println("Input the piece you'd like to move, and the new location:");
            String piece = scanner.next();
            String pieceNewLoc = scanner.next();
            if(engine.movePiece(piece, pieceNewLoc)){
                System.out.println("Piece has been moved.");
            }else{
                System.out.println("Piece could not be moved.");
            }
        }
    }
}
