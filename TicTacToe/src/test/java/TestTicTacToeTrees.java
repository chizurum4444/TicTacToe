import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestTicTacToeTrees {
	@Test
	public void testTree1() {
        // Test #1
        String board = "xooxoxoxo";
        TicTacToeTreeNode root = TicTacToeTree.createNode(board, "x");
        assertEquals(TicTacToeTree.treeToString(root), "'xooxoxoxo'\n", "Tree output for no-move tic tac toe tree does not match");
	}

	@Test
	public void testTree2() {
        // Test #2
        String board = "xooxoxox ";
        TicTacToeTreeNode root = TicTacToeTree.createNode(board, "x");
        assertEquals(TicTacToeTree.treeToString(root), "'xooxoxox '\n\t'xooxoxoxx'\n", "Tree output for single-move tic tac toe tree does not match");
	}

	@Test
	public void testTree3() {
        // Test #3
        String board = "x ox xo o";
        TicTacToeTreeNode root = TicTacToeTree.createNode(board, "x");
        assertEquals(TicTacToeTree.treeToString(root), "'x ox xo o'\n\t'xxox xo o'\n\t\t'xxoxoxo o'\n\t\t\t'xxoxoxoxo'\n\t\t'xxox xooo'\n\t\t\t'xxoxxxooo'\n\t'x oxxxo o'\n\t\t'xooxxxo o'\n\t\t\t'xooxxxoxo'\n\t\t'x oxxxooo'\n\t\t\t'xxoxxxooo'\n\t'x ox xoxo'\n\t\t'xoox xoxo'\n\t\t\t'xooxxxoxo'\n\t\t'x oxoxoxo'\n\t\t\t'xxoxoxoxo'\n", "Tree output for complex tic tac toe tree does not match");
	}
}
