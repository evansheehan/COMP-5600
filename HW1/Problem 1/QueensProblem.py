from Cell import Cell
from Queen import Queen

board = [Cell]

class MainClass:

    def initializeBoard():
        cellIDInput = 1
        x = 0 
        y = 0
        for x in range(25):
            for y in range(25):
                newCell = Cell(cellIDInput, -1, x, y)
                board.append(newCell)
                cellIDInput += 1
                print("Cell created...cell ID is " + str(newCell.getCellID()) 
                    + "...x position is " + str(newCell.getX()) 
                    + "...y postition is " + str(newCell.getY()))

    def addQueen():
        #nothing at the moment
        return 0        

    def generateScore(cell):

        north = cell.getID()
        while north > 24:
            currCell = board[north - 25]
            if currCell.hasQueen():
                cell.cellScore += 1

        east = cell.getID()
    


        


