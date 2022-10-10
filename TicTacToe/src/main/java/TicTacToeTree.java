public class TicTacToeTree {

    public static String makeMove(String oldBoard, int position, String player) {
        return oldBoard.substring(0, position) + player + oldBoard.substring(position + 1);
    }   
    
    public static String treeToString(TicTacToeTreeNode root) {

        String result = "";
        result+= nodeToString(root,1);
        return result;
    }

    public static TicTacToeTreeNode createNode(String board, String player) {
        int i;
        TicTacToeTreeNode node = new TicTacToeTreeNode();
        node.board = board;
        String newboard = "";
       for(i = 0; i < board.length() ;i++)
        {
            if(board.charAt(i) == ' ' && player == "x")
            {
                newboard = makeMove(board,i,player);
                node.children.add(createNode(newboard, "o"));
            }
            else if(board.charAt(i) == ' ' && player == "o")
            {
                newboard = makeMove(board,i,player);
                node.children.add(createNode(newboard, "x"));

            }
        }
       return node;
    }

    public static String nodeToString(TicTacToeTreeNode node, int inden){
        String result ="";
        result += "'"+node.board+"'";
        result+="\n";
        for( int x = 0; x< node.children.size(); x++ )
        {
            for(int a = 0; a< inden; a++)
            {
                result+="\t";
            }
            result+=nodeToString(node.children.get(x), ++inden);
            inden--;
        }
        return result;

    } 
}
