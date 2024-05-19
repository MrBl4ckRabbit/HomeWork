package task_1.animals;

import java.util.Objects;

public class Cat extends Mammal {
    Mammal.Backbone backbone = new Mammal.Backbone();
    static class Fur {

    }

    public Cat() {
    }

    public Cat(Backbone backbone) {
        this.backbone = backbone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(backbone, cat.backbone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(backbone);
    }
}
