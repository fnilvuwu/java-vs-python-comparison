matrix = [[1, 0, 0],  [0, 1, 0], [0, 0, 1]]
for i in range(len(matrix)):
    for j in range(len(matrix[i])):
        print(f"{matrix[i][j]} ", end="")
    print("\n", end="")
