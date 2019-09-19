import Cell

class Queen:
    queenID = -1
    position = Cell(-1, [-1, -1])

    def __init__ (self, queenIDIn, positionIn):
        self.queenID = queenIDIn