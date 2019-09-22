class QueensProblem2:
    board = [[2]*25]*25
    #print(board)

    x = int
    y = int
    x = 0
    y = 0
    for i in range(25):
        board[x][y] = 26
        print("Successfully added...x is currently " + str(x) + "...y is currently " + str(y))
        print(board[x][0])
        x += 1
        y += 1

    print(board)



