package task_1.animals;

import java.util.Objects;

public class Bear extends Mammal {
    static class Fur {

    }

    public Bear() {
    }

    public Bear(String kind, String name) {
        super();
        Fur fur = new Fur();
        this.kind = kind;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bear bear)) return false;
        return Objects.equals(kind, bear.kind) && Objects.equals(name, bear.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, name);
    }
}
