public class Main {
    public static void main(String[] args) {


        Klient Klient  = new Klient( 12, "Olka", "Kiesz", "Kielce");
        System.out.println(Klient.toString());
        Klient.setImie("Kaska");
        Klient.setNazwisko("Grabie");
        Klient.setMiejscowosc("Radom");
        System.out.println("Nowe imie klienta: " + Klient.getImie() + "\nNowe nazwisko klienta: " + Klient.getNazwisko() + "\nNowa miejscowosc klienta: " + Klient.getMiejscowosc());


        Car Car = new Car(100,"Saab", "93 II", "2019", "1900", "156000","ON","Szwecja","Czarny","458000" );
        System.out.println(Car.toString());
        Car.setMarka("Opel");
        Car.setModel("Zafira");
        Car.setRok_produkcji("2022");
        Car.setPojemnosc_silnika("1600");
        Car.setPrzebieg("1200");
        Car.setPaliwo("Pb-98");
        Car.setKraj_pochodzenia("Niemcy");
        Car.setKolor("Szary");
        Car.setCena("89 000");
        System.out.println("Nowa marka: " + Car.getMarka() + "\nNowy model: " + Car.getModel() + "\nNowy rok produkcji: " + Car.getRok_produkcji() + "\nNowa pojemnosc silnika: "
                + Car.getPojemnosc_silnika() + "\nNowy przebieg: " + Car.getPrzebieg() + "\nNowe Paliwo: " + Car.getPaliwo() + "\nNowy kraj pochodzenia: " + Car.getKraj_pochodzenia()
         + "\nNowy kolor: " + Car.getKolor() + "\nNowa cena:" + Car.getCena());


        Sprzedawca Sprzedawca = new Sprzedawca(23,"Zoska","Poniedzielska","Kozia Wolka");
        System.out.println(Sprzedawca.toString());
        Sprzedawca.setImie("Milena");
        Sprzedawca.setNazwisko("Piwowar");
        Sprzedawca.setMiejscowosc("Lodz");
        System.out.println("Nowe imie sprzedawcy: " + Sprzedawca.getImie() + "\nNowe nazwisko sprzedawcy: " + Sprzedawca.getNazwisko() + "\nNowa miejscowosc sprzedawcy: " + Sprzedawca.getMiejscowosc());


        Sklep Sklep  = new Sklep(234,"Zabka","krakow");
        System.out.println(Sklep.toString());
        Sklep.setNazwa("Myszka");
        Sklep.setMiejscowosc("Kielce");
        System.out.println("Nowa nazwa sklepu: " + Sklep.getNazwa() + "\nNowa miejscowosc: " + Sklep.getMiejscowosc());

    }
}
