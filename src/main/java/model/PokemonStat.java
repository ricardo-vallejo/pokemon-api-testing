package model;

public class PokemonStat {

    private NamedAPIResource stat;
    private int effort;
    private int base_stat;

    public NamedAPIResource getStat() {
        return stat;
    }

    public void setStat(NamedAPIResource stat) {
        this.stat = stat;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }
}
