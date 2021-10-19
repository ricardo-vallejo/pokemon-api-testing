package model;

public class PokemonMoveVersion {

    private NamedAPIResource move_learned_method;
    private NamedAPIResource version_group;
    private int level_learned_at;

    public NamedAPIResource getMove_learned_method() {
        return move_learned_method;
    }

    public void setMove_learned_method(NamedAPIResource move_learned_method) {
        this.move_learned_method = move_learned_method;
    }

    public NamedAPIResource getVersion_group() {
        return version_group;
    }

    public void setVersion_group(NamedAPIResource version_group) {
        this.version_group = version_group;
    }

    public int getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(int level_learned_at) {
        this.level_learned_at = level_learned_at;
    }
}
