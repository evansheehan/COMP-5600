from Cell import Cell
from Queen import Queen

class MainClass:
    
    def initializeBoard():
        chessBoard = [[0][0]]
        x = 0 
        y = 0
        for x in range(24):
            for y in range(24):
                newCell = Cell(-1, [x, y])
                chessBoard[[x][y]] = newCell