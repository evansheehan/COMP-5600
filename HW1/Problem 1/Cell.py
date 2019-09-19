import Queen

class Cell:
    cellID = -1
    cellScore = -1
    cellPos = [-1, -1]
    hasQueen = False
    queenID = -1

    def __init__(self, cellIDIn, cellScoreIn, cellPosIn):
        self.cellID = cellIDIn
        self.cellScore = cellScoreIn
        self.cellPos = cellPosIn

    def getID(self):
        return self.cellID

    def getScore(self):
        return self.cellScore

    def getPos(self):
        return self.cellPos

    def getQueen(self):
        return self.queen