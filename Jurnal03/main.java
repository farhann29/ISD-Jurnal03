import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        LinkList<buku> linkList = new LinkList<>();

        while (true) {
            tampilkanMenu();
            System.out.println("Masukkan pilihan");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    masukkanBuku(s, linkList);
                    break ;
                case 2:
                    linkList.removeFromFront();
                    break ;
                case 3:
                    linkList.removeFromBack();
                    break ;
                case 4:
                    linkList.printList();
                    break ;
                case 5:
                    System.out.println("Cetak buku sesuai dengan data pada linklist yang di bentuk");
                    break ;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }

    public static void tampilkanMenu() {
        System.out.println("Masukkan Pilihan");
        System.out.println("1. Masukkan Buku");
        System.out.println("2. Hapus Buku");
        System.out.println("3. Hapus Akhir list");
        System.out.println("4. Cetak Seluruh Buku");
        System.out.println("5. Keluar");
        System.out.println("PIlih");
    }
    public static void masukkanBuku(Scanner s,LinkList linkList){

        System.out.print("Masukkan Judul Buku :");
        String judul = s.next();
        System.out.print("Masukkan Penulis :");
        String penulis = s.next();
        System.out.print("Masukkan Tahun Terbit :");
        String tahunTerbit = s.next();

        linkList.insertAtFront(new buku(judul, penulis, tahunTerbit));
    }
}