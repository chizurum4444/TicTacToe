# TicTacToe

## Overview
In this project, I implemented a tree data structure and then used that tree to store the available moves in a tic tac toe game.

```
public static void main(String[] args) {
    String board = "x ox xo o";
    TicTacToeTreeNode root = TicTacToeTree.createNode(board, "x");
    System.out.print(TicTacToeTree.treeToString(root));
}
```

```
public static String makeMove(String oldBoard, int position, String player) {
    return oldBoard.substring(0, position) + player + oldBoard.substring(position + 1);
}
```

The driver code, above, should generate the following output:

```
'x ox xo o'
    'xxox xo o'
        'xxoxoxo o'
            'xxoxoxoxo'
        'xxox xooo'
            'xxoxxxooo'
    'x oxxxo o'
        'xooxxxo o'
            'xooxxxoxo'
        'x oxxxooo'
            'xxoxxxooo'
    'x ox xoxo'
        'xoox xoxo'
            'xooxxxoxo'
        'x oxoxoxo'
            'xxoxoxoxo'
```

## Compiling and Running Your Program
To compile and run your program, use the following command:
`gradle run`

If you want to see if your program passes the tests, i.e. is correct, use the following command:
`gradle test`
