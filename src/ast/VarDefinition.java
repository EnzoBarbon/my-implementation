package ast;

/**
 * A variable definition associates a name with a {@link Type}.
 */
public class VarDefinition extends AbstractASTNode implements Definition {

    private final String name;
    private Type type;

    public VarDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("VarDefinition{name='%s', type=%s}", name, type);
    }
} 