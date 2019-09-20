import Cell

class Queen:
    queenID = -1
    position = [-1, -1]

    def __init__ (self, queenID, position):
        self.queenID = queenID
        self.position = position

    def getQueenID(self):
        return self.queenID

    def getPosition(self):
        return self.position