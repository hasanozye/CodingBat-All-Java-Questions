package DataTypes.linkedlist;

public class Main {
    public static void main(String[] args) {
        // 1. Bağlantılı liste oluştur
        BagliListe liste = new BagliListe();
        System.out.println("Başlangıçta liste: " + liste.baslik.oge); // Çıktı: "başlık"

        // 2. Listeye düğümler ekle
        liste.ekle("A", "baslik"); // "başlık" düğümünden sonra "A" eklendi
        liste.ekle("B", "A");      // "A" düğümünden sonra "B" eklendi
        liste.ekle("C", "B");      // "B" düğümünden sonra "C" eklendi

        // 3. Debug etmek için listeyi yazdır
        Dugum temp = liste.baslik;
        System.out.println("Bağlantılı Liste Durumu:");
        while (temp != null) {
            System.out.println("Düğüm: " + temp.oge);
            temp = temp.link; // Bir sonraki düğüme geç
        }

        // 4. Bir düğümü bul
        Dugum bulunanDugum = liste.bul("B");
        System.out.println("\nBulunan Düğüm: " + bulunanDugum.oge); // Çıktı: "B"

        // 5. Eğer "B" düğümü bulunursa bağlantısını kontrol et
        if (bulunanDugum.link != null) {
            System.out.println("B düğümünün bağlantısı: " + bulunanDugum.link.oge); // Çıktı: "C"
        } else {
            System.out.println("B düğümünün bağlantısı yok.");
        }
    }
}
