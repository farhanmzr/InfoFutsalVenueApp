package com.example.infofutsalvenueapp;

import java.util.ArrayList;

public class LapanganData {

        public static String[][] data = new String[][]{
                {"Radja Futsal", "Rp.75.000,00", "Jl. Majapahit No.127, Gayamsari", "https://lapanganfutsal.id/wp-content/uploads/2019/01/radja-futsal-majapahit1-800x400.jpg"},
                {"Spider Futsal Stadium", "Rp.50.000,00", "Jl. Gajah Raya No.56, Pandean Lamper", "https://semarang101.files.wordpress.com/2011/06/futsal-spider-gajah-semarang.jpg"},
                {"Venus Futsal Club", "Rp.90.000,00", "Jalan Gendong Raya, Sendangmulyo, Tembalang", "https://cdn-2.tstatic.net/jateng/foto/bank/images/ini-hasil-pertandingan-liga-nusantara-futsal-jateng-22-mei-2015_20150522_200557.jpg"},
                {"Fanny Futsal Stadium", "Rp.80.000,00", "Jalan Soekarno Hatta No.212, Pedurungan", "https://ewr1.vultrobjects.com/suarapapuaweb/2016/05/Lapangan-Fultsal-Ilustrasi.jpg"},
                {"Mitra Futsal & Badminton", "Rp.100.000,00", "Jalan Satrio Wibowo I, Tlogosari Kulon", "https://lh3.googleusercontent.com/r_XQe-naXgQfFdvrPYRIwcQuHNvwGyacaeaqowVOM9WPoZ0YF9hpiMCJIjkyYrDtFiAqTTzacypMTSns=w768-h768-n-o-v1"},
                {"Stadion Futsal Undip", "Rp.105.000,00", "Jalan Prof. Soedarto, SH, Tembalang", "https://4.bp.blogspot.com/-yzdoZ63eP_k/VviF8mvYrFI/AAAAAAAAEDk/Crpz-NaY7U8h4jdn9OUveKeqJEmnTa7ag/s1600/Kampus%2BUndip%2BSemarang%2B%252812%2529.jpg"},
                {"New Golden Futsal", "Rp.120.000,00", "Jl. Subali No.6, Krapyak, Semarang Barat", "https://lh3.googleusercontent.com/p/AF1QipNw2Ewmy93_4z3-Wk8z_tSgNlVQ6-lfxFHLD_I=s1280-p-no-v1"},
                {"Media Futsal", "Rp.85.000,00", "Jl. Kendeng Bar. II, Sampangan, Gajah Mungkur", "https://blue.kumparan.com/image/upload/c_fill,w_480,f_jpg/reanuddctcen65r4efa4.jpg"},
                {"Borobudur Futsal", "Rp.70.000,00", "Jl. Borobudur Sel. No.8, Manyaran", "https://static-id.lamudi.com/static/media/cXVhbGl0eS83MA%3D%3D/2x2x2x700x340/d2088ef08817cb.jpg"},
                {"Futsal Shima", "Rp.45.000,00", "Pedurungan Tengah No.86, Semarang", "https://cdn-2.tstatic.net/jateng/foto/bank/images/kondisi-gedung-futsal-baru-di-gor-manunggal-jati-pedurungan-kota-semarang.jpg"},
                {"Mulawarman Futsal", "Rp.30.000,00", "Jl. Mulawarman Selatan Raya No.20 B, Tembalang", "https://pbs.twimg.com/media/CVtgKHsU4AAaehq.jpg"},
                {"Reham Futsal", "Rp.120.000,00", "Jalan Mulawarman Selatan No. 18 B, Tembalang", "https://www.dgci.or.id/wp-content/uploads/2018/04/ADE16B28-7B51-4687-AD4F-B01D3185DCAF.jpeg"},
                {"Estádio de Salamanmloyo", "Rp.200.000,00", "Jalan Salamanmloyo, Semarang Barat", "https://cdn-2.tstatic.net/jateng/foto/bank/images/hendi-targetkan-setiap-kecamatan-miliki-sarana-olahraga-standart-internasional.jpg"},
        };

        public static ArrayList<LapanganModel> getListData(){
            ArrayList<LapanganModel> list = new ArrayList<>();
            for (String[] aData : data) {
                LapanganModel lapanganModel = new LapanganModel();
                lapanganModel.setNama(aData[0]);
                lapanganModel.setHarga(aData[1]);
                lapanganModel.setLokasi(aData[2]);
                lapanganModel.setGambar(aData[3]);
                list.add(lapanganModel);
            }
            return list;
        }


}
