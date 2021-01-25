package wanderer;

import java.awt.*;

public class Cell {
    private Integer row;
    private Integer column;
    private CellType cellType;
    private Boolean isMarked;

    public Cell(Integer row, Integer column, CellType cellType, Boolean isMarked ) {
        this.row = row;
        this.column = column;
        this.cellType = cellType;
        this.isMarked = isMarked;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public boolean isMarked(){
        return isMarked;
    }

    public void draw(Graphics graphics, Resource resource, int imageSize){
        graphics.drawImage(resource.getImage(this.cellType),
                this.row * imageSize - imageSize,
                this.column * imageSize - imageSize,
                null);
    }
}