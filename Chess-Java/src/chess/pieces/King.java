package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }
    public String toString(){
        return "K";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        p.setValues(position.getRow()-1,position.getColumn());
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow()+1,position.getColumn());
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow()-1,position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow()+1,position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow()-1,position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow()+1,position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }


        p.setValues(position.getRow(),position.getColumn()-1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        p.setValues(position.getRow(),position.getColumn()+1);
        if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        
        return mat;
    }
    
}
