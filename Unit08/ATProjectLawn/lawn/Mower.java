package lawn;

public class Mower {
    private int row;
    private int column;
    private int direction;
    

    // create mower 
    public Mower(int row, int column, int direction) {
        this.row = row + 1;
        this.column = column + 1;
        this.direction = direction;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }
 
    public void setColumn(int column) {
        this.column = column;
    }

    //getting the direction
    public int getDirection() {
        return direction;
    }

    //original direction
    public void setDirection(int direction) {
        this.direction = direction;
    }

    //general movements
    public void moveForward() {
        switch (direction) {
            case 0: // up
                row--;
                break;
            case 1: // right
                column++;
                break;
            case 2: // down
                row++;
                break;
            case 3: // left
                column--;
                break;
        }
    }

  
    public void turnLeft() {
        direction = (direction + 3) % 4;
    }

    
    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    // looking for the grass
    public boolean checkGrass(Yard yard) {
        if (direction == 0) {
            return yard.getStatus(row - 1, column) == '+';
        } else if  (direction == 1) {
            return yard.getStatus(row, column + 1) == '+';
        } else if  (direction == 2) {
            return yard.getStatus(row + 1, column) == '+';
        } else if  (direction == 2) {
            return yard.getStatus(row, column - 1) == '+';
        }
        return false;
    }


    // cutting the grass
    public void cutGrass(Yard yard) {
        yard.setCellValue(row, column, 'x');

    }
 
}





  