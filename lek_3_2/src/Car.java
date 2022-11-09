public class Car {

    public int id;
    public String marka;
    public String model;
    public String rok_produkcji;
    public String pojemnosc_silnika;
    public String przebieg;
    public String paliwo;
    public String kraj_pochodzenia;
    public String kolor;
    public String cena;
    public Car (int id, String marka, String model, String rok_produkcji, String pojemnosc_silnika, String przebieg, String paliwo, String kraj_pochodzenia, String kolor , String cena) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
        this. kraj_pochodzenia =  kraj_pochodzenia;
        this.kolor = kolor;
        this.cena = cena;
    }
    public int getIdId () {return id;}
    public String getMarka() {return marka;}
    public String getModel () {return model;}
    public String getRok_produkcji () {return rok_produkcji;}
    public String getPojemnosc_silnika() {return pojemnosc_silnika;}
    public String getPrzebieg() {return przebieg;}
    public String getPaliwo() {return paliwo;}
    public String getKraj_pochodzenia() {return kraj_pochodzenia;}
    public String getKolor() {return kolor;}
    public String getCena() {return cena;}


    public void setId ( int id){this.id = id;}
    public void setMarka(String marka){this.marka = marka;}
    public void setModel (String model){this.model = model;}
    public void setRok_produkcji ( String rok_produkcji){this.rok_produkcji = rok_produkcji;}
    public void setPojemnosc_silnika ( String pojemnosc_silnika){this.pojemnosc_silnika = pojemnosc_silnika;}
    public void setPrzebieg ( String przebieg){this.przebieg = przebieg;}
    public void setPaliwo (String paliwo){this.paliwo = paliwo;}
    public void setKraj_pochodzenia (String kraj_pochodzenia){this.kraj_pochodzenia = kraj_pochodzenia;}
    public void setKolor (String kolor){this.kolor = kolor;}
    public void setCena ( String cena){this.cena = cena;}

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", pojemnosc_silnika=" + pojemnosc_silnika +
                ", przebieg=" + przebieg +
                ", paliwo='" + paliwo + '\'' +
                ", kraj_pochodzenia='" + kraj_pochodzenia + '\'' +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}

