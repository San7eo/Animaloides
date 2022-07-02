public class Pesho extends Mascota {

    public Pesho(String name, String raza) {
        super(name, raza);
    }

    @Override
    public void Hablar() {
        System.out.println(this.name + ": waaaw " + this.raza);
    }
}
