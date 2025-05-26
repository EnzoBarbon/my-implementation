package ast;



/**
 * Marker for type nodes. Every distinct C-- type must implement this marker
 * interface so that semantic passes can reference them generically.
 */
public interface Type extends ASTNode {
} 