package model;

public class PokemonHeldItem {

    private NamedAPIResource item;
    private PokemonHeldItemVersion version_details;

    public NamedAPIResource getItem() {
        return item;
    }

    public void setItem(NamedAPIResource item) {
        this.item = item;
    }

    public PokemonHeldItemVersion getVersion_details() {
        return version_details;
    }

    public void setVersion_details(PokemonHeldItemVersion version_details) {
        this.version_details = version_details;
    }
}
