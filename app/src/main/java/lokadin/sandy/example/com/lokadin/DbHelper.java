package lokadin.sandy.example.com.lokadin;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DbHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "db_dinas";
    public DbHelper(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS dinas(_id INTEGER PRIMARY KEY, nama TEXT, alamat TEXT, no_tlpn NUMERIC, descripsi TEXT,latitude Double,longtitude Double, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("_id", "999");
        values.put("nama", "Dinas Pendidikan & Kebudayaan ");
        values.put("alamat", "Jl. Amir Hamzah, Gotong Royong, Tj. Karang Pusat, Kota Bandar Lampung, Lampung 35119");
        values.put("no_tlpn", "0721-253752");
        values.put("deskripsi","Merupakan dinas yang bertanggung jawab untuk melaksanakan pembangunan di bidang pendidikan yang mengacu pada peningkatan SDM. Yang memiliki sasaran " +
                "terciptanya hasil didik yang mandiri dan berbudi pekerti yang luhur.");
        values.put("latitude","-5.4332973");
        values.put("longtitude","105.2568225");
        values.put("img", R.drawable.dinas_pendidikan); //im31 nama file gambar dengan ukuran 80 x 80 pixel yang ada di folder res/drawable pada project
        db.insert("dinas","_id", values);

        values.put("_id", "112");
        values.put("nama", "Dinas Kesehatan ");
        values.put("alamat", "Jl. Supratman No.73 Bandung");
        values.put("no_tlpn", "022-4203752");
        values.put("descripsi","Dinas Kesehatan Kota Bandung adalah salah satu intansi pemerintah yang" +
                "sudah ada sejak jaman kependudukan Belanda. Pada tahun 1946 sampai dengan tahun 1949 Dinas" +
                " Kesehatan disebut juga ”Plaatselijke gezond Heidsdienst Bandung ” yan berkantor di Gemeente Bandung. " +
                "Pimpinannya adalah Dr.Molte V.Kuhlewein sebagai HOoofd Gouvermentsart Hoofd V.D Plaatselijke Gezondheids Bandung");
        values.put("latitude","-6.900744");
        values.put("longtitude","107.626452");
        values.put("img", R.drawable.dinas_kesehatan);//im32 nama file gambar dengan ukuran 80 x 80 pixel yang ada di folder res/drawable pada project
        db.insert("dinas", "_id", values);

        values.put("_id", "113");
        values.put("nama", "Dinas Pekerjaan Umum");
        values.put("alamat", "Jl. Soekarno Hatta No 205 Bandung");
        values.put("no_tlpn", "022 5220768");
        values.put("descripsi","Dinas perhubungan Kota Bandung dibentuk berdasarkan Peraturan Daerah Kota Bandung Nomor 5 tahun 2001 tentang " +
                "pembentukan dan susunan organisasi dinas daerah dan lingkungan Pemerintah Kota Bandung. Sebelum berubah menjadi Dinas Perhubungan, nomenklaturnya adalah sebagai berikut:" +
                "Dinas lalulintas dan angkatan jalan provinsi daerah tingkat I Jawa Barat cabang kotamadya daerah tingkat II bandung, sampai dengan 1997. Dari tahun 1997 sampai dengan tahun 2001" +
                " dirubah menjadi Dinas lalu Lintas daerah Kota Bandung Nomor 21 Tahun 1997 tanggal 1 April 1997 tentang Pembentukan Dinas lalu Lintas dan Angkatan Jalan Kota Madya daerah tingkat II Bandung." +
                " Dan sejak tahun 2001 sampai dengan sekarang menjadi Dinas Perhubungan Kota Bandung.");
        values.put("latitude","-6.9446524");
        values.put("longtitude","107.5850978");
        values.put("img", R.drawable.dinas_pekerjaan_umum);//im33 nama file gambar dengan ukuran 80 x 80 pixel yang ada di folder res/drawable pada project
        db.insert("dinas", "_id", values);

        values.put("_id", "114");
        values.put("nama","Dinas Penataan Ruang dan Kota");
        values.put("alamat", "Jalan Cianjur No. 34 Bandung");
        values.put("no_tlpn", "022-7217451");
        values.put("descripsi","Dinas Tata Ruang dan Cipta Karya dibentuk berdasarkan Peraturan Daerah Kota Bandung Nomor 13 Tahun 2007 Tentang Pembentukan dan Susunan Organisasi Dinas Daerah Kota Bandung.\n" +
                "\n" +
                "Dinas Tata Ruang dan Cipta Karya merupakan integrasi dari :\n" +
                "\n" +
                "DINAS TATA KOTA\n" +
                "DINAS BANGUNAN\n" +
                "DINAS PERUMAHAN");
        values.put("latitude","-6.916501");
        values.put("longtitude","107.633551");
        values.put("img", R.drawable.dinas_tataruang); //im34 nama file gambar dengan ukuran 80 x 80 pixel yang ada di folder res/drawable pada project
        db.insert("dinas", "_id", values);

        values.put("_id","115");
        values.put("nama","Dinas Tenaga Kerja");
        values.put("alamat","Jl. RE. Martanegara No.4 Bandung");
        values.put("no_tlpn","022-7311330");
        values.put("descripsi","Otonomi Daerah sebagai manifestasi Undang-Undang (UU) Nomor 32 Tahun 2004 tentang Pemerintahan Daerah, masih memberikan berbagai bentuk keleluasaan dalam pengimplementasiannya di daerah." +
                " Keleluasaan ini, bukan semata-mata disebabkan oleh keragaman persepsi, tapi juga disebabkan oleh faktor lain, seperti heterogenitas kondisi sosial dan budaya, beragamnya potensi dan karakteristik masing-masing daerah." +
                " Akibatnya, diperlukan suatu rancangan bangunan sistem yang adaftik dan handal dalam memenuhi dan menanggulangi permasalahan yang kompleks dan dinamis");
        values.put("latitude","-6.93328");
        values.put("longtitude","107.626528");
        values.put("img",R.drawable.dinas_tenagakerja);
        db.insert("dinas","_id", values);

        values.put("_id","116");
        values.put("nama","Dinas Pangan dan Pertanian");
        values.put("alamat","Jl. Arjuna No.45, Husen Sastranegara, Cicendo, Kota Bandung, Jawa Barat 40174");
        values.put("no_tlpn","022 6015102");
        values.put("descripsi","Dinas Pertanian dan Ketahanan Pangan Kota Bandung di bentuk pada tanggal 15 April Tahun 2001, berdasarkan Perda Kota Bandung No. 26 tahun 2001 yang merupakan gabungan dari 3 dinas yaitu, Dinas Pertanian Tanaman Pangan," +
                " Dinas Peternakan dan Dinas Perikanan, oleh karena nya kewenangan Dinas Pertanian dan Ketahanan Pangan Kota Bandung meliputi kewenangan subsektor pertanian tanaman pangan, peternakan, perikanan, dan bidang perkebunan.");
        values.put("latitude","-6.93328");
        values.put("longtitude","107.626528");
        values.put("img",R.drawable.dinas_pertanian);
        db.insert("dinas","_id", values);

        values.put("_id","117");
        values.put("nama","Dinas Perhubungan ");
        values.put("alamat","Jl. Soekarno Hatta No.205");
        values.put("no_tlpn","022 5220768");
        values.put("descripsi","Dinas perhubungan Kota Bandung dibentuk berdasarkan Peraturan Daerah Kota Bandung Nomor 5 tahun 2001 tentang pembentukan dan susunan organisasi dinas daerah dan lingkungan Pemerintah Kota Bandung. Sebelum berubah menjadi Dinas Perhubungan," +
                " nomenklaturnya adalah sebagai berikut:\n1. Dinas lalulintas dan angkatan jalan provinsi daerah tingkat I Jawa Barat cabang kotamadya daerah tingkat II bandung, sampai dengan 1997. Dari tahun 1997 sampai dengan tahun 2001 dirubah menjadi Dinas lalu Lintas " +
                "daerah Kota Bandung Nomor 21 Tahun 1997 tanggal 1 April 1997 tentang Pembentukan Dinas lalu Lintas dan Angkatan Jalan Kota Madya daerah tingkat II Bandung. Dan sejak tahun 2001 sampai dengan sekarang menjadi Dinas Perhubungan Kota Bandung.");
        values.put("latitude","-6.917822");
        values.put("longtitude",",107.632253");
        values.put("img",R.drawable.dinas_perhubungan);
        db.insert("dinas","_id", values);

        values.put("_id","118");
        values.put("nama","Dinas Pemuda dan Olahraga");
        values.put("alamat"," Jln. Tamansari No. 76 Bandung");
        values.put("no_tlpn","022-4212656");
        values.put("descripsi","Perencanaan Program Dinas Pemuda dan Olahraga Kota Bandung disesuaikan dengan arah kebijakan pembangunan yang tertuang dalam Rencana Strategis Kota Bandung tahun 2009-2013 pada misi ke 3 (tiga) yaitu :" +
                " “Mengembangkan sosial budaya kota yang ramah dan berkesadaran tinggi serta berhati nurani” mengacu pada hal tersebut, salah satu agenda prioritas Kota Bandung adalah meningkatkan prestasi olahraga dan kepemudaan");
        values.put("latitude","-6.909754");
        values.put("longtitude","107.615748");
        values.put("img",R.drawable.dinas_pemudaolahraga);
        db.insert("dinas","_id", values);

        values.put("_id","119");
        values.put("nama","Dinas Perpustakaan dan Kearsipan");
        values.put("alamat","Jl. Caringin No. 103 Bandung ");
        values.put("no_tlpn","022 4231921");
        values.put("descripsi","Enam tahun berjalan Kantor Umum dan arsip Daerah Kota Bandung berdasarkan peraturan daerah Kota Bandung No. 12 tahun 2007 tentang pembentukan dan susunan Organisasi Lembaga Teknis Daerah Kota Bandung, nama Lembaganya" +
                " berubah menjadi Kantor Perpustakaan dan Arsip Daerah Kota Bandung dengan alamat masih tetap di Wastukancana No. 2 Bandung.Kemudian sejak tahun 2012 Kantor Perpustakaan dan Arsip Daerah Kota Bandung berpindah ke Gedung baru yang beralamat" +
                " di Jl. Caringin No. 103 Bandung hingga saat ini");
        values.put("latitude","-6.945546");
        values.put("longtitude",",107.583033");
        values.put("img",R.drawable.dinas_perpustakaan);
        db.insert("dinas","_id", values);

        values.put("_id","120");
        values.put("nama","Dinas Kebudayaan dan pariwisata");
        values.put("alamat","JL. Ahmad Yani No. 227 Bandung");
        values.put("no_tlpn","022 7271724");
        values.put("descripsi","(Dinas Kebudayaan Dan Pariwisata Kota Bandung Adalah Salah Satu Satuan Kerja Perangkat Dinas (SKPD) Dari Pemerintah Kota Bandung Yang Mempunyai Tugas Pokok Melaksanakan Urusan Pemerintahan Di Bidang Kebudayaan Dan Pariwisata " +
                "Berdasarkan Asas Otonomi Dan Pembantuan. Dinas Ini Terdiri Dari 4 Bidang Yaitu Bidang Objek Wisata, Bidang Sarana Wisata, Bidang Pemasaran, Bidang Seni Budaya Dan 1 Sekretariat'),\n");
        values.put("latitude","-6.917139");
        values.put("longtitude","107.627259");
        values.put("img",R.drawable.dinas_kebudayaan);
        db.insert("dinas","_id", values);

        values.put("_id","121");
        values.put("nama","Dinas Komunikasi dan Informatika");
        values.put("alamat","Jl. Wastukancana No 2 Bandung");
        values.put("no_tlpn","022-4234892");
        values.put("descripsi","BAKOMINFO Kota Bandung merupakan Lembaga Teknis Daerah dibentuk berdasarkan Peraturan Daerah Kota BandungNomor 12 Tahun 2007, Tanggal 4 Desember 2007 serta merupakanpenggabungan " +
                "Satuan Kerja Pemerintah Daerah (SKPD) Dinas danKantor di lingkungan Pemerintah Kota Bandung yaitu DinasInformasi dan Komunikasi dengan Kantor Pengolahan DataElektronik (KPDE). Dengan demikian Bakominfo berdiri sejakdiberlakukannya PERDA Nomor 12 Tahun 2007 " +
                "tentangPembentukan dan Susunan Organisasi Dinas Daerah Kota Bandung.");
        values.put("latitude","-6.911076");
        values.put("longtitude","107.609314");
        values.put("img",R.drawable.dinas_keminfo);
        db.insert("dinas","_id", values);

        values.put("_id","122");
        values.put("nama","Dinas Perdagangan dan Perindustrian");
        values.put("alamat","Jl. Asia Afrika No.146");
        values.put("no_tlpn","022 4230897");
        values.put("descripsi","Merumuskan kebijakan operasional di bidang Perindustrian dan Perdagangan yang merupakan sebagian kewenangan desentralisasi Propinsi serta kewenangan yang dilimpahkan kepada Gubernur berdasarkan azas dekonsentrasi dan tugas pembantuan.");
        values.put("latitude","-6.922273");
        values.put("longtitude","107.614467");
        values.put("img",R.drawable.dinas_perdagangan);
        db.insert("dinas","_id", values);

        values.put("_id","123");
        values.put("nama","Dinas Lingkungan Hidup Dan Kebersihan");
        values.put("alamat","JL. Sadang Tengah No. 4 & 6 Sadang Serang");
        values.put("no_tlpn","0222514327");
        values.put("descripsi","");
        values.put("latitude","-6.888809");
        values.put("longtitude","107.625522");
        values.put("img",R.drawable.dinas_lingkunganhidup);
        db.insert("dinas","_id", values);

        values.put("_id","124");
        values.put("nama","Dinas Kependudukan dan Pencatatan Sipil");
        values.put("alamat","Jl. Ambon No.1 Bandung");
        values.put("no_tlpn","022-4209891");
        values.put("descripsi","Dinas kependudukan dan Pencatatan sipil Kantor\\r\\nPemerintah Kota BANDUNG  merupakan Lembaga Teknis Daerah yang dibentuk berdasarkan Peraturan Daerah Kota Bandung Nomor 9 Tahun 2008, serta merupakan penggabungan Satuan Kerja Pemerintah Daerah (SKPD) Dinas" +
                " dan Kantor di lingkungan Pemerintah Kota Bandung Barat yaitu Dinas Kependudukan dan Pencatanan Sipil Kantor PEMERINTAHAN Kota BANDUNG.");
        values.put("latitude","-6.908777");
        values.put("longtitude","107.61385");
        values.put("img",R.drawable.dinas_kependudukan);
        db.insert("dinas","_id", values);

        values.put("_id","125");
        values.put("nama","Dinas Sosial dan penangulangan Kemiskinan");
        values.put("alamat","Jl. Sindang sirna no 40 Bandung");
        values.put("no_tlpn","022-2013139");
        values.put("descripsi","Dinas Sosial dan Penanggulangan Kemiskinan mempunyai tugas pokok yaitu menyelenggarakan urusan pemerintahan bidang sosial dan aspek penanggulangan kemiskinan.");
        values.put("latitude","-6.877675");
        values.put("longtitude","107.591042");
        values.put("img",R.drawable.dinas_sosial);
        db.insert("dinas","_id", values);

        values.put("_id","126");
        values.put("nama","Dinas Koperasi dan UMKM");
        values.put("alamat","Jl. Kawaluyaan No. 2 Bandung");
        values.put("no_tlpn","022-7308358");
        values.put("descripsi","Dinas Koperasi, Usaha Kecil Menengah dan Perindustrian Perdagangan Kota Bandung terbentuk berdasarkan peraturan daerah kota Bandung No. 13 Tahun 2007, merupakan penggabungan dua" +
                " dinas yaitu dinas koperasi kota Bandung dan dinas perdagangan perindustrian kota Bandung. Dinas koperasi kota Bandung sebelumnya instansi vertikal dibawah departemen koperasi di tingkat kabupaten kota yang diberi nama kantor departemen koperasi pengusaha kecil perdagangan.");
        values.put("latitude","-6.937995");
        values.put("longtitude","107.663761");
        values.put("img",R.drawable.dinas_koperasi);
        db.insert("dinas","_id", values);

        values.put("_id","127");
        values.put("nama","Dinas Penanaman Modal dan Perijinan Terpadu");
        values.put("alamat","Jl.Sumatera No.50, Citarum, Bandung ");
        values.put("no_tlpn","022 4237369");
        values.put("descripsi","");
        values.put("latitude","-6.907981");
        values.put("longtitude",",107.61199");
        values.put("img",R.drawable.dinas_penanaman_modal);
        db.insert("dinas","_id", values);

        values.put("_id","128");
        values.put("nama","Dinas Pengendalian Kependudukan dan KB");
        values.put("alamat","Jln. Jenderal Abdul Haris Nasution Palopat Pijorkoling");
        values.put("no_tlpn","022 7366227");
        values.put("descripsi","Menyikapi berbagai perubahan dan perkembangan yang terjadi secara global, menuntut Pemerintah Daerah dalam hal reformasi pemerintahan, baik pada tingkat Pusat maupun Daerah, serta dalam rangka pelaksanaan otonomi daerah, Dinas Pengendalian Penduduk dan" +
                " Keluarga Berencana Kota Padangsidimpuan harus mampu secara berkualitas, kuantitas, efisien");
        values.put("latitude","-6.913198");
        values.put("longtitude","107.609027");
        values.put("img",R.drawable.dinas_pengendaliandiri);
        db.insert("dinas","_id", values);

        values.put("_id","129");
        values.put("nama","Dinas Kebakaran dan Penanggulangan Bencana");
        values.put("alamat","Jl. Sukabumi No.17 Bandung");
        values.put("no_tlpn","022-7207113");
        values.put("descripsi","Pada Zaman Kota Bandung berstatus Gemente, penanggulangan kebakaran di integrasikan dengan pembangunan jalan-jalan utama, dibuat hidran yang sumber airnya dihubungkan dengan pipa air minum. Untuk memeperkuat daya semprot air dibantu dengan pompa beroda disebut" +
                " . Saat Kota Bandung berubah status menjadi Kota Praja, Walikota Bandung pada waktu itu dijabat oleh Bapak R.Enoch dan dilanjutkan oleh R.Priatna Kusumah menyediakan Mobil Pemadam Kebakaran yang lebih dikenal oleh masyarakat dengan sebutan Branweer, pertama kalinya bermarkas di" +
                "Jl. Raya Timur atau lebih dikenal dengan Jl. Ahmad Yani No.296 dimana para petugas dan karyawan pemadam kebakaran juga berdomisili di komplek'),");
        values.put("latitude","-6.916811");
        values.put("longtitude","107.634136");
        values.put("img",R.drawable.dinas_damkar);
        db.insert("dinas","_id", values);

        values.put("_id","130");
        values.put("nama","Dinas Perumahan dan Kawasan Pemukiman");
        values.put("alamat","Jl. Kawaluyaan Indah Raya No.4");
        values.put("no_tlpn","022-4231921");
        values.put("descripsi","Dinas Perumahan dan Kawasan Permukiman, Pertanahan dan Pertamanan mempunyai tugas pokok yaitu menyelenggarakan urusan pemerintahan bidang perumahan dan kawasan permukiman, bidang pertanahan dan pertamanan.");
        values.put("latitude","-6.933945");
        values.put("longtitude",",107.662139");
        values.put("img",R.drawable.dinas_pertamanan);
        db.insert("dinas","_id", values);

        values.put("_id","131");
        values.put("nama","Dinas Pemberdayaan Perempuan dan Perlindungan Anak");
        values.put("alamat","Jl. Maskumambang No. 4, Bandung");
        values.put("no_tlpn"," 022 7305023");
        values.put("descripsi","Dinas mempunyai tugas pokok melaksanakan urusan pemerintahan di bidang pemberdayaan perempuan, perlindungan anak serta urusan pemerintahan di bidang pengendalian penduduk dan keluarga berencana, meliputi peningkatan kualitas hidup perempuan, peningkatan kualitas keluarga, " +
                "pemenuhan hak anak serta perlindungan perempuan dan anak.  yang menjadi kewenangan provinsi, melaksanakan tugas dekonsentrasi sampai dengan dibentuk Sekretariat Gubernur sebagai Wakil Pemerintah Pusat");
        values.put("latitude","-6.934036");
        values.put("longtitude","107.626917");
        values.put("img",R.drawable.dinas_pemberdayaaan);
        db.insert("dinas","_id", values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS dinas");
        onCreate(db);

    }
}
