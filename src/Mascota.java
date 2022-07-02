public abstract class Mascota {

    public String name;

    public String raza;

    public Mascota(String name, String raza){
        this.name = name;
        this.raza = raza;
    }
    public abstract void Hablar();
}
