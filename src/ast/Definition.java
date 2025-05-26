package ast;

/**
 * Represents a definition construct (variables, functions, structs…). It is
 * locatable and names an entity in the program.
 */
public interface Definition extends ASTNode {

    /**
     * @return the identifier that names this definition.
     */
    String getName();

} 