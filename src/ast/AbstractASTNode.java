package ast;

/**
 * Common superclass for concrete AST nodes that stores the source position
 * (line and column). All concrete nodes created in the first two sessions
 * should extend from this class to inherit the *locatable* behaviour.
 */
public abstract class AbstractASTNode implements ASTNode {

    private final int line;
    private final int column;

    protected AbstractASTNode(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
} 