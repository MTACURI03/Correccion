public class Datos extends Banda{
    private String primer_album;
    public String famosa_song;

    public Datos(String genero, int seguidores, String nombanda, String vocalista, String famosa_song) {
        super(genero, seguidores, nombanda, vocalista);
        this.famosa_song=famosa_song;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Su cancion mas famosa es :"+famosa_song);
    }

    public String getPrimer_album() {
        return primer_album;
    }

    public void setPrimer_album(String primer_album) {
        this.primer_album = primer_album;
    }
}
