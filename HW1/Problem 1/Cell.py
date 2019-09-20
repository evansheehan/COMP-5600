import Queen

class Cell:
    cellID = int
    cellScore = int
    xPos = int 
    yPos = int
    hasQueen = False

    def __init__(self, cellID, cellScore, xPos, yPos):
        self.cellID = cellID
        self.cellScore = cellScore
        self.xPos = xPos
        self.yPos = yPos

    def getCellID(self):
        return self.cellID

    def getScore(self):
        return self.cellScore

    def getX(self):
        return self.xPos

    def getY(self):
        return self.yPos

    def hasQueen(self):
        return self.hasQueen