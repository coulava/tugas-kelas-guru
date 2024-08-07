  //Driver Class
public class ObyekGuru {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        //membuat obyek
        Guru pasha = new Guru();
        pasha.id = 350;
        pasha.nama = "Pasha";
        pasha.mapel = "Produktif";
        pasha.alamat = "Malang";
        System.out.println("Ini data pasha");
        System.out.println( pasha.id);
        System.out.println( pasha.nama);
        System.out.println(pasha.mapel);
        System.out.println(pasha.alamat);
        Guru aul = new Guru();
        pasha.id = 330;
        aul.nama = "Aul";
        aul.mapel = "Produktif";
        aul.alamat = "Malang";
        System.out.println("Ini data aul");
        System.out.println(aul.id);
        System.out.println(aul.nama);
        System.out.println(aul.mapel);
        System.out.println(aul.alamat);
        Guru feni = new Guru();
        feni.id = 630;
        feni.nama = "Feni";
        feni.mapel = "Matematika";
        feni.alamat = "Malang";
        System.out.println("Ini data feni");
        System.out.println(feni.id);
        System.out.println(feni.nama);
        System.out.println(feni.mapel);
        System.out.println(feni.alamat);
        Guru diaur = new Guru();
        diaur.id = 430;
        diaur.nama = "Diaur";
        diaur.mapel = "Fisika";
        diaur.alamat = "Malang";
        System.out.println("Ini data diaur");
        System.out.println(diaur.id);
        System.out.println(diaur.nama);
        System.out.println(diaur.mapel);
        System.out.println(diaur.alamat);
        Guru andre = new Guru();
        andre.id = 530;
        andre.nama = "Andre";
        andre.mapel = "English";
        andre.alamat = "Amerika";
        System.out.println("Ini data andre");
        System.out.println(andre.id);
        System.out.println(andre.nama);
        System.out.println(andre.mapel);
        System.out.println(andre.alamat);

    }
}
