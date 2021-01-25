package wanderer;

public class PathRevealer {
    /* private List<List<Cell>> grid = new ArrayList<>();

    Random random = new Random();
        for (int i = 0; i < size + 2; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size + 2; j++) {
                boolean isMarked = false;
                CellType cellType = CellType.FLOOR;
                if(i == 0 || j == 0 || i == size + 1 || j == size + 1) {
                    cellType = CellType.WALL;
                }else if (random.nextInt(3) == 0)
                    cellType = CellType.WALL;
                Cell cell = new Cell(i, j, cellType, isMarked);
                row.add(cell);
            }
            board.add(row);
        }


    public PathRevealer(int size) {
        Random random = new Random();
        for (int i = 0; i < size + 2; i++) {
            List<Cell> row = new ArrayList<>();
            for (int j = 0; j < size + 2; j++) {
                boolean isMine = false;
                // üres pályával kezdünk
                if ((i == 0 || j == 0 || i == size + 1 || j == size + 1) && i != 1 && j != 1) {
                    // a szélén fal van
                } else {
                    isThereAWayToBottomRow = true;
                    while(isThereAWayToBottomRow){
                        // sorsolunk egy random fal pozíciót
                        isThereAWayToBottomRow = IsBottomRowReachable();
                    }
                    // besorsolunnk egy falat
                    // ellenőrítni kell, hogy átájárható-e a pálya
                    // ha igen => fal lerak
                    // ha nem átjáárható => akkor legyen TILE, és kész a pálya
                }
                Cell cell = new Cell(i, j, cellType, isMine);
                row.add(cell);
            }
            grid.add(row);
        }
    }
    public boolean IsBottomRowReachable(int row, int column) {
        if(row == utolsó sor){ //
            return true;
        }
        //This is the way
        for (int rowNumber = -1; rowNumber <= 1; rowNumber++) {
            for (int columnNumber = -1; columnNumber <= 1; columnNumber++) {
                if (this.grid.get(row + i).get(column + j).getCellType() == CellType.TILE) { // átlók nyista
                    IsBottomRowReachable(row + i, column + j);
                }
            }
        }
    }
    else
    {
        this.grid.get(row).get(column).setCellType(CellType.values()[neighbourMineCount - 1]);
    } */
}
