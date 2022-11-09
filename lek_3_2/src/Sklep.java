public class Sklep {
    public int id;
    public String nazwa;
    public String miejscowosc;

    public Sklep (int id, String nazwa, String miejscowosc) {
    this.id = id;
    this.nazwa = nazwa;
    this.miejscowosc = miejscowosc;
    }

    public int getId() {return id;}
    public String getNazwa() {return nazwa;}
    public String getMiejscowosc() {return miejscowosc;}

    public void setId ( int id){this.id = id;}
    public void setNazwa (String nazwa){this.nazwa = nazwa;}
    public void setMiejscowosc (String miejscowosc){this.miejscowosc = miejscowosc;}

    @Override
    public String toString() {
        return "Sklep{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
