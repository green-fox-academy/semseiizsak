package wanderer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {

    private List<List<Cell>> board = new ArrayList<>();
    private GameState gameState = GameState.PROGRESS;

    public Board(int size) {
        for (int i = 0; i < size + 2; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size + 2; j++) {
                boolean isMarked = false;
                CellType cellType = CellType.FLOOR;
                if (i == 0 || j == 0 || i == size + 1 || j == size + 1) {
                    cellType = CellType.WALL;
                } else if (i == 1 || j == 4) {
                    cellType = CellType.WALL;
                    Cell cell = new Cell(i, j, cellType, isMarked);
                    row.add(cell);
                } else if (i == 2 || j == 4 || j == 6 || j == 8 || j == 9) {
                    cellType = CellType.WALL;
                    Cell cell = new Cell(i, j, cellType, isMarked);
                    row.add(cell);
                } else if (i == 3 || j == 2 || j == 3 || j == 4 || j == 6 || j == 8 || j == 9) {
                    cellType = CellType.WALL;
                    Cell cell = new Cell(i, j, cellType, isMarked);
                    row.add(cell);
                } else if (i == 4 || j == 6) {
                    cellType = CellType.WALL;
                    Cell cell = new Cell(i, j, cellType, isMarked);
                    row.add(cell);
                } else if (i == 5 || j == 1 || j == 2 || j == 3 || j == 4 || j == 6 || j == 7 || j == 8 || j == 9) {
                    cellType = CellType.WALL;
                    Cell cell = new Cell(i, j, cellType, isMarked);
                    row.add(cell);
                }
                board.add(row);
            }
        }
    }


        public void draw (Graphics graphics, Resource resource,int imageSize){
            for (int i = 1; i < board.size() - 1; i++) {
                for (int j = 1; j < board.size() - 1; j++) {
                    board.get(i).get(j).draw(graphics, resource, imageSize);
                }
            }
        }
    }