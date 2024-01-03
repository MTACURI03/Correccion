public class Musica {
    public String genero;
    public int seguidores;

    public Musica(String genero, int seguidores) {
        this.genero=genero;
        this.seguidores=seguidores;
    }
    public void mostrar(){
        System.out.println("El genero de musica es :"+genero);
        System.out.println("El numero de seguidores es :"+seguidores);
    }
}
