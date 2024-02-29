public class Main {
    public static void main(String[] args) {
        
        GenArrayList<ATK> kumpulanATK = new GenArrayList<> (5);
        GenArrayList<Bag> kumpulanBag = new GenArrayList<> (5);

        kumpulanATK.addData(new ATK("A005", "Pensil", "Joyko", 20));
        kumpulanATK.addData(new ATK("A008", "Pulpen", "Sahara", 30));
        kumpulanATK.addData(new ATK("A002", "Spidol", "Faber Castell", 10));
        kumpulanATK.addData(new ATK("B003", "Buku Tulis", "Sidu", 50));
        kumpulanATK.addData(new ATK("B007", "Kertas HVS", "Sidu", 80));

        kumpulanBag.addData(new Bag("C002", "Tempat Pensil", "Elsa", 30));
        kumpulanBag.addData(new Bag("C007", "Tas", "Tas Polo", 20));
        kumpulanBag.addData(new Bag("C005", "Tipe X", "Joyko", 10));
        kumpulanBag.addData(new Bag("C004", "Kacamata", "Kacamata besi", 10));
        kumpulanBag.addData(new Bag("C008", "Mouse", "Mouse Logitech", 60));
    
        kumpulanATK.display();
        kumpulanBag.display();
    
        
    }
}
