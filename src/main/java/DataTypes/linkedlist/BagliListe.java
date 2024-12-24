package DataTypes.linkedlist;

public class BagliListe {

    protected Dugum baslik;

    public BagliListe() {
        baslik = new Dugum("baslik");
    }

    public void ekle(Object yeniOge, Object onceki) {
        Dugum mevcut = new Dugum();
        Dugum yeniDugum = new Dugum(yeniOge);
        mevcut = bul(onceki); // Önceki düğümü bul
        yeniDugum.link = mevcut.link; // Yeni düğümün bağlantısını, mevcut düğümün bağlantısına ata
        mevcut.link = yeniDugum; // Mevcut düğümün bağlantısını yeni düğüme ata
    }

    public Dugum bul(Object oncekiOge) {
        Dugum mevcut = baslik; // Listeyi başlık düğümünden başlat
        while (mevcut.oge != oncekiOge) { // Eşleşme yoksa
            mevcut = mevcut.link; // Bir sonraki düğüme geç
        }
        return mevcut; // Eşleşen düğümü geri döndür
    }


}
