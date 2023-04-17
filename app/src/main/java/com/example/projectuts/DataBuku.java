package com.example.projectuts;

import java.util.ArrayList;

public class DataBuku {
    public  static ArrayList<ModelBuku> books = generateDummyProductModels();

    private static ArrayList<ModelBuku> generateDummyProductModels() {
        ArrayList<ModelBuku> books = new ArrayList<>();
        books.add(new ModelBuku("Si Anak Spesial", "Tere Liye", "Si Anak Spesial adalah novel populer karya penulis terkenal," +
                                        " Tere Liye. Diterbitkan oleh Penerbit Republika pada tahun 2018, novel ini cocok dibaca oleh pembaca lintas usia " +
                                        "dan lintas gender. Si Anak Spesial menceritakan kehidupan keluarga dari Sumatera Selatan yang menyelipkan banyak " +
                                        "nilai moral berharga bagi pembaca sehingga membaca novel fiksi ini seperti membaca buku pengembangan diri, namun " +
                                        "dengan cara yang menyenangkan.", "https://cdn.gramedia.com/uploads/items/9786025734441_si-anak-spesi.jpg",
                            "329", "REPUBLIKA PENERBIT", "7 Desember 2018", "9786025734441", "70000"));
        books.add(new ModelBuku("Catatan Juang", "Fiersa Besari", "Buku berjudul Catatan Juang merupakan spin-off dari novel " +
                                        "best seller yang berjudul Konspirasi Alam Semesta. Dalam novel barunya ini penulis, Fiersa Besari mengajak pembaca " +
                                        "berkenalan dengan Kasuarina atau akrab disapa Suar, sang tokoh utama dalam cerita ini. Buku ini memiliki empat bagian, " +
                                        "dan tiap bagiannya memiliki satu atap yang sama tentang perjuangan Suar. Pendeskripsian kata serta pemikiran Fiersa Besari " +
                                        "sebagai \"Juang\" sang pemilik buku dituturkan dengan lugas dan apa adanya.", "https://cdn.gramedia.com/uploads/items/207959051.jpg",
                            "312", "MEDIA KITA", "21 November 2017", "9789797945497","74000"));
        books.add(new ModelBuku("I Want To Die But I Want To Eat Tteokpokki", "Baek Se Hee", "Ketika perasaan stres dan depresi lebih terkalahkan oleh rasa lapar dan keinginan makan tteokpokki atau makanan favorit kamu, apa yang akan kamu lakukan? Apakah memilih untuk menyerah atau makan saja dulu?\n" +
                "Mengambil premis menarik, Baek Se Hee selaku penulis buku ini rupanya mampu menggetarkan dunia non fiksi dengan buku motivasinya yang diangkat dengan cara unik dan menawan\n" +
                "Kendati dari judulnya saja terkesan seperti sedang bercanda namun buku ini sebenarnya memiliki kisah yang sama sekali tidak bercanda. I Want to Die but I Want to Eat Tteokpokki ini merupakan catatan pengobatan sang penulis sendiri yang dikemas sebagai sebuah buku bacaan yang menenangkan",
                "https://cdn.gramedia.com/uploads/items/9786237351030.jpg", "236", "HARU", "4 September 2019", "9786237351030","99000"));
        books.add(new ModelBuku("I Want To Die But I Want To Eat Tteokpokki 2", "Baek Se Hee", "I Want to Die but I Want to Eat Tteokpokki 2 bisa dibilang lanjutan dari kisah Baek Se Hee yang berkonsultasi dengan psikiaternya. Perawatan Kejiwaan yang dia lakukan terus berlanjut. Jika pada buku pertama, ia cenderung mengasihani diri sendiri, pada buku kedua ini ia mencoba untuk lebih menerima dirinya dan tidak membenci dirinya",
                "https://cdn.gramedia.com/uploads/items/1651_7tsvwFs.jpg", "220", "HARU SEMESTA PERSADA PT", "7 September 2020", "9786237351474","105000"));
        books.add(new ModelBuku("The Midnight Library", "Matt Haig", "Nora Seed mendapati dirinya dihadapkan pada keputusan ini. Dihadapkan dengan kemungkinan mengubah hidupnya untuk yang baru, mengikuti karir yang berbeda, membatalkan perpisahan lama, mewujudkan mimpinya menjadi ahli glasiologi, menjalani kehidupannya sebagai atlet renang kelas dunia, serta banyak hal lain yang dapat dicoba. Dia harus menemukan keinginan serta kebahagiaan di dalam dirinya saat dia melakukan perjalanan di Perpustakaan Tengah Malam untuk memutuskan apa yang benar-benar memuaskan dalam hidup, dan apa yang membuatnya layak untuk dijalani.",
                "https://cdn.gramedia.com/uploads/items/9786020649320_the_midnight_library_cov.jpg", "368", "GRAMEDIA PUSTAKA UTAMA", "9 Juni 2021", "9786020649320","105000"));
        books.add(new ModelBuku("Pulang", "Tere Liye", "Novel pertama pulang ini ceritanya bermula pada seorang laki-laki bernama Bujang atau si Babi Hutan. Bujang seorang anak kampung dari Pulau Sumatera. Saat beranjak dewasa Bujang dibawa oleh Tauke Muda ke kota untuk bergabung ke dalam keluarga Tong menjadi seorang tukang pukul, bahkan lebih dari seorang tukang pukul. Keluarga Tong memiliki harapan Bujang dapat menjadi masa depan keluarga Tong. Semenjak kedatangan Bujang ke keluarga Tong, Bujang beradaptasi dan mengikuti berbagai macam pendidikan dan pelatihan bela diri, menembak, menerbangkan pesawat, dan ninja. Selama beradaptasi dalam keluarga Tong, Bujang juga mencari tahu tentang kedua orang tuanya melalui orang-orang yang ada di lingkaran keluarga Tong. Dalam perjalanan hidupnya ini Bujang harus menghadapi beberapa konflik pertama Bujang harus menghadapi konflik mengenai shadow economy, dan konflik yang paling besar yang harus Bujang hadapi ialah konflik di dalam keluarganya sendiri.",
                "https://cdn.gramedia.com/uploads/items/9786020822129_Pulang-Cover-Baru.jpg", "404", "REPUBLIKA", "1 April 2018", "9786020822129","94000"));
        books.add(new ModelBuku("Pergi", "Tere Liye", "Novel ini adalah sekuel dari novel “Pulang” karya Tere Liye, disarankan bagi pembaca untuk membaca novel “Pulang” terlebih dahulu. Novel ini tidak hanya menceritakan tentang pertarungan sengit antar keluarga Shadow Economy, tetapi juga menceritakan bagaimana perjalanan panjang Bujang membongkar masa lalu almarhum ayahnya yang begitu rumit. Ayahnya yang dulu ia kenal memiliki perangai yang buruk, sering marahi bahkan memukulnya kini Bujang berusaha menelusuri setiap jejak kehidupan ayahnya pernah menjadi tukang jagal nomor satu, sama seperti dirinya saat ini.",
                "https://cdn.gramedia.com/uploads/items/9786025734052_9786025734052.jpg", "459", "REPUBLIKA", "6 April 2018", "9786025734052","79000"));
        books.add(new ModelBuku("Pulang - Pergi", "Tere Liye", "Buku novel Pulang - Pergi ini merupakan karya dari penulis terkenal, yaitu Tere Liye. Buku ini bercerita tentang Bujang yang kembali harus berpetualang setelah pergi dan pulang. Saat Bujang sedang berada di pusara mamak dan bapaknya, Bujang mendapatkan sebuah pesan dari Krestiny Otets, pemimpin brotherhood Bratva.",
                "https://cdn.gramedia.com/uploads/items/pulang-pergi_tere_liye.jpeg", "417", "SABAK GRIP NUSANTARA", "1 Januari 2021", "9786239554521","89000"));
        books.add(new ModelBuku("Konspirasi Alam Semesta", "Fiersa Besari", "Novel ini menyajikan kisah tentang seorang lelaki bernama Juang Astrajingga, seorang pria dengan penampilan fisik yang cukup menarik, meski memiliki brewok tipis dan kumal yang menghiasi wajahnya, serta alis tebal yang mendukung sepasang mata tajam miliknya. Juang sering dicemooh dan dicela oleh orang disekitarnya karena fakta bahwa ayahnya merupakan seorang ekstapol. Dan seorang wanita bernama Ana Tidae. Mereka berdua adalah dua orang yang berbeda, yang dipertemukan oleh semesta. Juang dan Ana menjalin sebuah kisah cinta yang dipenuhi berbagai rintangan. Melalui novel Konspirasi Alam Semesta ini, Fiersa ingin menyampaikan pesan kemanusiaan dan sosial, bahwa cinta bukan hanya di antara seorang lelaki dan seorang wanita, tetap juga dengan Tuhan, sesama, dan lingkungan.",
                "https://cdn.gramedia.com/uploads/items/9789797945350_Konspirasi-Alam-Semesta.jpg", "244", "MEDIAKITA", "2 Oktober 2017", "9789797945350","75000"));
        books.add(new ModelBuku("11.11", "Fiersa Besari", "Buku yang berjudul 11:11 ini merupakan album buku yang dibuat oleh Fiersa Besari dan diterbitkan oleh penerbit Agromedia Pustaka pada November tahun 2018. Buku ini sangat cocok untuk dibaca saat Anda ingin mengisi waktu luang. Menariknya, seperti konsep buku ini, yaitu album buku, buku ini menyertakan judul lagu pada setiap bagian cerita dengan menggunakan kode QR.\n" +
                "\n" +
                "Buku 11:11 ini berisi sebelas cerita dan sebelas lagu. Setiap cerita memiliki lagu “pengiring” yang ibarat film adalah soundtracknya. Buku ini sejatinya adalah buku kumpulan cerita pendek.",
                "https://cdn.gramedia.com/uploads/items/img110.jpg", "211", "AGROMEDIA PUSTAKA", "11 November 2018", "9789797945695","88000"));
        books.add(new ModelBuku("Arah langkah", "Fiersa Besari", "Bulan April, tahun 2013, berawal dengan niat dan tujuan yang berbeda, salah satunya karena hati yang terluka, tiga pengelana memulai sebuah perjalanan menyusuri daerah-daerah di Indonesia. Lewat cara yang seru tapi menantang, mereka tidak hanya menyaksikan langsung keindahan negeri ini, mereka juga harus menghadapi pertarungan dengan kegelisahan yang dibawa masing-masing.\n" +
                "\n" +
                "Arah Langkah bukan sekadar catatan perjalanan yang melukiskan keindahan alam, budaya, dan manusia lewat teks dan foto. Tetapi juga memberikan cerita lain tentang kondisi negeri yang tidak selalu sebagus seperti di layar televisi. Meskipun begitu, semua daerah memang memiliki cerita yang berbeda-beda, namun di dalam perbedaan itu, cinta dan persahabatan selalu bisa ditemukan.",
                "https://cdn.gramedia.com/uploads/items/arah-langkah-edit.jpg", "304", "MEDIA KITA", "1 Mei 2018", "9789797945619","88000"));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));
//        books.add(new ProductModel("", "", "", "", "", "", "", "",0));

        return books;
    }
}
