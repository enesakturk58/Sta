public class Telefon {
    private ITema tema;

    public void setTema(ITema tema){
        this.tema=tema;
    }
    public void goster(){
        this.tema.gorunum();
    }

}
