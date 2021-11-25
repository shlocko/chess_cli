package com.company;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    Player white;
    Player black;
    Map<Character, Integer> letterToNumber = new HashMap<Character, Integer>();

    public Engine(){
        white = new Player('w');
        black = new Player('b');
        letterToNumber.put('a', 1);
        letterToNumber.put('b', 2);
        letterToNumber.put('c', 3);
        letterToNumber.put('d', 4);
        letterToNumber.put('e', 5);
        letterToNumber.put('f', 6);
        letterToNumber.put('g', 7);
        letterToNumber.put('h', 8);
    }

    public String getPieceTypeByCoord(int x, int y){
        final String[] type =  new String[1];
        type[0] = "";
        white.pieces.forEach((k, v) -> {
            if(x==v.x && y==v.y){
                type[0] = v.type;
            }
        });
        black.pieces.forEach((k, v) -> {
            if(x==v.x && y==v.y){
                type[0] = v.type;
            }
        });

        return type[0];
    }
    public int getPieceIDByCoord(int x, int y){
        final int[] id =  new int[1];
        id[0] = -1;
        white.pieces.forEach((k, v) -> {
            if(x==v.x && y==v.y){
                id[0] = k;
            }
        });
        black.pieces.forEach((k, v) -> {
            if(x==v.x && y==v.y){
                id[0] = k;
            }
        });

        return id[0];
    }

    public boolean movePiece(String piece, String newLoc){
        boolean moved = false;
        int px = letterToNumber.get(piece.charAt(0));
        System.out.println("PX:" + px);
        int py = piece.charAt(1)-48;
        System.out.println("PY:" + py);
        String pt = getPieceTypeByCoord(px,py);
        int pid = getPieceIDByCoord(px,py);

        int nx = letterToNumber.get(newLoc.charAt(0));
        int ny = newLoc.charAt(1)-48;

        if(px>=1 && px<=8 && py>=1 && py<=8 && nx>=1 && nx<=8 && ny>=1 && ny<=8 ){
            if(!getPieceTypeByCoord(px,py).equals("")){
                if(pt.charAt(0) == 'w'){
                    white.pieces.get(pid).x = nx;
                    white.pieces.get(pid).y = ny;
                    moved = true;
                }else if(pt.charAt(0) == 'b'){
                    black.pieces.get(pid).x = nx;
                    black.pieces.get(pid).y = ny;
                    moved = true;
                }
            }else{System.out.println("Failed 2");}
        }else{System.out.println("Failed 1");}

        return moved;
    }


}
