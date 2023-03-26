package Napojee;

public class Napoj_gaz extends Napoje {
    private String poziom_nagazowania;

    private void wygazuj(){

    }

    public Napoj_gaz(String nazwa) {
        super(nazwa);
    }

    @Override
    public String pij() {
        String picie="pite";
        return picie;
    }
}
