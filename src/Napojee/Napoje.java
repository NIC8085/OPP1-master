package Napojee;

public abstract class Napoje{
    String nazwa;
    public abstract String pij();

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getNazwa() {
        return nazwa;
    }
}
