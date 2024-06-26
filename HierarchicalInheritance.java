package self;
class fundamentalForce {
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}
class gravitational extends fundamentalForce {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}
class Electromagnetic extends fundamentalForce {
    void Particles() {
        System.out.println("The electromagnetic force acts between charged particles");
    }
}

class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("Child 1:");
        gravitational G = new gravitational();
        G.Force();
        G.Gravity();

        System.out.println();
        System.out.println("Child 2");
        Electromagnetic em = new Electromagnetic();
        em.Force();
        em.Particles();
    }
}
