class QueensProblem2:
    board = [[2]*25]*25
    #print(board)

    x = 0
    y = 0
    while x < 25:
        board[x][y] = 26
        print("Successfully added...x is currently " + str(x))
        x += 1
        y += 1

    print(board)



