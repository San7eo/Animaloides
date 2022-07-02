public class Gato extends Mascota {

    public Gato(String name, String raza) {
        super(name, raza);
    }

    @Override
    public void Hablar() {
        System.out.println(this.name + ": miaaau " + this.raza);
    }
}
