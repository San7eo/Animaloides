public class Pez extends Mascota {

    public Pez(String name, String raza) {
        super(name, raza);
    }

    @Override
    public void Hablar() {

        System.out.println(this.name + ": gluglu " + this.raza);
    }
}
