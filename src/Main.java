public class Main {
    public static void main(String[] args) {

        Musica datoscanciones []=new Musica [1];
        datoscanciones[0]=new Musica("Rock Latino",100000);
       Musica musci1 =new Musica("ROCK LATINO",100000);
       Banda band1 =new Banda("ROCK LATINO",1000000,"SODA STEREO","GUSTAVO CERATI");
       Datos data1=new Datos("ROCK LATINO",100000,"SODA STEREO","GUSTAVO CERATI","DE MUSICA LIGERA");
       data1.setPrimer_album("CANCION ANIMAL");
       musci1.mostrar();
       band1.mostrar();
       data1.mostrar();
        System.out.println("SU PRIMER ALBUM FUE : "+data1.getPrimer_album());
        System.out.println("datos del genero es :"+datoscanciones[0]);
    }
}