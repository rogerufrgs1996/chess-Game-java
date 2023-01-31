package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;


public class Pawn extends ChessPiece{
    public Pawn(Board board, Color color) {
        super(board, color);
    }
    public String toString(){
        return "P";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);
        
        if(getColor()== Color.WHITE){
            p.setValues(position.getRow()-1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
                p.setValues(p.getRow()-1, position.getColumn());
                if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && position.getRow() == 6){
                    mat[p.getRow()][p.getColumn()] = true; 
                }
            }
            p.setValues(position.getRow()-1, position.getColumn()-1);
            if(getBoard().positionExists(p) && isThereOponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow()-1, position.getColumn()+1);
            if(getBoard().positionExists(p) && isThereOponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
        }
        else{
            p.setValues(position.getRow()+1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
                p.setValues(p.getRow()+1, position.getColumn());
                if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && position.getRow() == 1){
                    mat[p.getRow()][p.getColumn()] = true; 
                }
            }
            p.setValues(position.getRow()+1, position.getColumn()+1);
            if(getBoard().positionExists(p) && isThereOponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow()+1, position.getColumn()-1);
            if(getBoard().positionExists(p) && isThereOponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
        }

        return mat;
    }
}
