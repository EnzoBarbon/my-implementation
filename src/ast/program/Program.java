package ast.program;

import ast.AbstractASTNode;
import ast.Definition;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Root node that holds all global definitions of a C-- program.
 */
public class Program extends AbstractASTNode {

    private final List<Definition> definitions;

    public Program(int line, int column, List<Definition> definitions) {
        super(line, column);
        this.definitions = Collections.unmodifiableList(Objects.requireNonNull(definitions));
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }
} 