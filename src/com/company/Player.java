package com.company;

import java.util.HashMap;
import java.util.Map;

public class Player {

    char color;
    Map<Integer, Piece> pieces = new HashMap<Integer, Piece>();

    public Player(char clr){
        color = clr;
        if(color == 'w') {
            this.pieces.put(1, new Piece(1, 2, "wp"));
            this.pieces.put(2, new Piece(2, 2, "wp"));
            this.pieces.put(3, new Piece(3, 2, "wp"));
            this.pieces.put(4, new Piece(4, 2, "wp"));
            this.pieces.put(5, new Piece(5, 2, "wp"));
            this.pieces.put(6, new Piece(6, 2, "wp"));
            this.pieces.put(7, new Piece(7, 2, "wp"));
            this.pieces.put(8, new Piece(8, 2, "wp"));
            this.pieces.put(9, new Piece(1, 1, "wR"));
            this.pieces.put(10, new Piece(2, 1, "wN"));
            this.pieces.put(11, new Piece(3, 1, "wB"));
            this.pieces.put(12, new Piece(4, 1, "wQ"));
            this.pieces.put(13, new Piece(5, 1, "wK"));
            this.pieces.put(14, new Piece(6, 1, "wB"));
            this.pieces.put(15, new Piece(7, 1, "wN"));
            this.pieces.put(16, new Piece(8, 1, "wR"));
        }else if(color == 'b') {
            this.pieces.put(1, new Piece(1, 7, "bp"));
            this.pieces.put(2, new Piece(2, 7, "bp"));
            this.pieces.put(3, new Piece(3, 7, "bp"));
            this.pieces.put(4, new Piece(4, 7, "bp"));
            this.pieces.put(5, new Piece(5, 7, "bp"));
            this.pieces.put(6, new Piece(6, 7, "bp"));
            this.pieces.put(7, new Piece(7, 7, "bp"));
            this.pieces.put(8, new Piece(8, 7, "bp"));
            this.pieces.put(9, new Piece(1, 8, "bR"));
            this.pieces.put(10, new Piece(2, 8, "bN"));
            this.pieces.put(11, new Piece(3, 8, "bB"));
            this.pieces.put(12, new Piece(4, 8, "bQ"));
            this.pieces.put(13, new Piece(5, 8, "bK"));
            this.pieces.put(14, new Piece(6, 8, "bB"));
            this.pieces.put(15, new Piece(7, 8, "bN"));
            this.pieces.put(16, new Piece(8, 8, "bR"));
        }
    }


}
