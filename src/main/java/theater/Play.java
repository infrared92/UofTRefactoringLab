package theater;

/**
 * A Play class that has a name and type.
 */
public class Play {
    /**
     * Creates a new Play with a name and type.
     * @param name the name of the play
     * @param type the type of the play
     */
    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
