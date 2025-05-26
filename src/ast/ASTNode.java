package ast;



/**
 * Base interface for every node in the Abstract-Syntax Tree.
 * <p>
 * It purposefully contains only the source–code coordinate helpers
 * required for the first two laboratory sessions.
 */
public interface ASTNode {

    /**
     * @return 1-based line number where the construct begins in the original source file.
     */
    int getLine();

    /**
     * @return 1-based column number where the construct begins in the original source file.
     */
    int getColumn();
} 