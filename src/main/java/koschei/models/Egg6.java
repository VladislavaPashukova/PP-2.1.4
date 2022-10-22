package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private final Deth8 deth;

    public Egg6(Deth8 deth) {
        this.deth = deth;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + deth.toString();
    }
}
