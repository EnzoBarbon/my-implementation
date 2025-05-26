package ast;

/**
 * Integer literal expression.
 */
public class IntLiteral extends AbstractASTNode implements Expression {

    private final int value;

    /**
     * Constructs an {@code IntLiteral}.
     *
     * @param line   1-based line number in the source file
     * @param column 1-based column number in the source file
     * @param value  integer value held by the literal
     */
    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
} 