public class Main {
    public static void main(String[] args) {

        ITema tema1 = new Tema1();
        ITema tema2 = new Tema2();
        Telefon telefon1 = new Telefon();

        telefon1.setTema(tema1);
        telefon1.goster();

        telefon1.setTema(tema2);
        telefon1.goster();

    }
}