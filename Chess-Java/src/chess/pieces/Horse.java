package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece{

    public Horse(Board board, Color color) {
        super(board, color);
    }
    public String toString(){
        return "H";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);
        //nordeste
        p.setValues(position.getRow()-1,position.getColumn()+2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //noroeste
        p.setValues(position.getRow()-1,position.getColumn()-2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //sudeste
        p.setValues(position.getRow()+1,position.getColumn()+2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //sudoeste
        p.setValues(position.getRow()+1,position.getColumn()-2);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //norte direita        
        p.setValues(position.getRow()-2,position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //norte esquerda
        p.setValues(position.getRow()-2,position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //sul dirteita
        p.setValues(position.getRow()+2,position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        //sul esquerda
        p.setValues(position.getRow()+2,position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        
        return mat;
    }
    
}
