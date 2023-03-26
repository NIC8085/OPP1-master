package Napojee;

public class Woda extends Napoje {

    private Boolean gazowana;
    private String nazwa="Woda";
    private void gazuj(){

    }
    public Woda(String nazwa) {
        super(nazwa);
    }
    @Override
    public String pij() {
        String picie="pite";
        return picie;
    }
}
