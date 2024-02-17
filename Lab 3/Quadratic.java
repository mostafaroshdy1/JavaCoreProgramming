import java.util.function.*;
class Quadratic implements Function<Parameters, Roots> {
    public Roots apply(Parameters par) {
        if ((par.getB() * par.getB()) - (4 * par.getA() * par.getC()) < 0) {
            return new Roots(-par.getB() / (2 * par.getA()), -par.getB() / (2 * par.getA()),
                    Math.sqrt(-1 * (par.getB() * par.getB() - 4 * par.getA() * par.getC())) / (2 * par.getA()),
                    -1 * (Math.sqrt(-1 * (par.getB() * par.getB() - 4 * par.getA() * par.getC()))) / (2 * par.getA()), false);
        } else {
            return new Roots((-par.getB() + Math.sqrt(par.getB() * par.getB() - 4 * par.getA() * par.getC())) / (2 * par.getA()),
                    (-par.getB() - Math.sqrt(par.getB() * par.getB() - 4 * par.getA() * par.getC())) / (2 * par.getA()), 0, 0, true);
        }
    }
}

