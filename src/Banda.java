public class Banda extends Musica {
    public String nombanda;
    public String vocalista;

    public Banda(String genero, int seguidores, String nombanda, String vocalista) {
        super(genero, seguidores);
        this.nombanda = nombanda;
        this.vocalista = vocalista;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        try {
            System.out.println("El nombre de la banda es :" + nombanda);
            System.out.println("El vocalista de la banda es :" + vocalista);
        }catch(Exception e){
            System.out.println("INVALIDO");
        }
    }
}