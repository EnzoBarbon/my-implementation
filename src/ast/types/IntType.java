package ast.types;

import ast.AbstractASTNode;
import ast.Type;

/**
 * Singleton representing the built-in {@code int} type.
 */
public final class IntType extends AbstractASTNode implements Type {

    // We typically need only one instance of each primitive type.
    private static final IntType INSTANCE = new IntType(0, 0);

    private IntType(int line, int column) {
        super(line, column);
    }

    public static IntType getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "int";
    }
} 