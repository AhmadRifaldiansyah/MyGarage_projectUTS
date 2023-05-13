package com.example.mygarage.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mygarage.DetailMovieActivity
import com.example.mygarage.Movie
import com.example.mygarage.MovieAdapter
import com.example.mygarage.R


class ExploreFragment : Fragment() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    private lateinit var adapter : MovieAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieArrayList : ArrayList<Movie>

    lateinit var image: Array<Int>
    lateinit var title: Array<String>
    lateinit var descriptions: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_movie)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
//        adapter = MovieAdapter(movieArrayList)
        recyclerView.adapter = context?.let {
            MovieAdapter(it, movieArrayList){
                val intent = Intent(context, DetailMovieActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }
        }

    }

    private fun dataInitialize() {
        movieArrayList = arrayListOf<Movie>()

        image = arrayOf(
            R.drawable.subaru,
            R.drawable.nsx,
            R.drawable.ferarrif40,
            R.drawable.aventador,
            R.drawable.r35,
            R.drawable.rx77,
            R.drawable.rx7liite,
            R.drawable.rx7s,
            R.drawable.silvia,
            R.drawable.rx7trpile,
        )

        title = arrayOf(
            "Subaru",
            "Accura NSX",
            "Ferarri",
            "Lamborgini Aventador",
            "Skyline R35",
            "Mazda RX77",
            "Mazda RX7Lite",
            "Mazda RX7S",
            "Nissan Silvia",
            "Mazda RX7 Trpple",

        )

        descriptions = arrayOf(
            "Mesin 4 silinder, Mesin tersebut dapat mengeluarkan tenaga sebesar 275 hp pada putaran 5.600 rpm dan torsi puncak 375 Nm di putaran 2.000 sampai 4.800 rpm. Tenaga dan torsi mesin ini nantinya disalurkan ke semua roda mobil lewat transmisi manual atau otomatis (Subaru Performance Transmission) 8 percepatan.",
            "Dari segi penggerak, Honda NSX SUV akan menggunakan roda penggerak belakang, dikombinasi motor listrik dan hub motor untuk membuatnya menjadi kendaraan all-wheel-drive.   ",
            "Ferrari F40 adalah mobil super Ferrari termahal, tercanggih, dan tercepat dari tahun 1987–1992. F40 adalah penerus dari Ferrari 288 GTO. F40 merupakan salah satu mobil Ferrari legendaris dan paling ikonis sepanjang sejarah karena F40 adalah mobil terakhir sebelum meninggalnya sang pembuat dan pendiri Ferrari.",
            "Aventador ditawarkan dengan banyak fitur di setiap varian, sehingga membuatnya kompeten di segmen Coupe. MEntenagai Aventador Lp 700-4 adalah mesin 6498 cc yang menghasilkan 700 hp dengan torsi maksimum 690 Nm. Varian tertinggi Aventador terbilang efisien dengan konsumsi BBM 3.8 kmpl untuk di dalam kota, dan 8.9 kmpl di jalan tol",
            "Nissan GT-R R35 menggunakan mesin V6 berkapasitas 3,8 liter VR38DETT. Mesin ini menggunakan  twin-turbo yang mampu menghasilkan tenaga sebesar 565 hp dan torsi maksimum 632 Nm. Mesin GT-R R35 inilah yang  sering disebut sebagai “Godzilla” engine, karena tenaga yang dihasilkan besar dan mampu mengalahkan mobil sport dari Eropa. Mesin tersebut dikombinasikan dengan transmisi dual-clutch dan sistem all-wheel drive yang diteruskan ke semua roda. ",
            "Generasi ketiga dan terakhir RX-7, yang dikenal sebagai FD, 2-door Sports Coupe diproduksi dalam tiga seri, 6, 7 dan 8, dan didasarkan pada mesin putar 2,6L Wankel yang diposisikan di belakang gandar depan. Total tiga output tersedia, 236 hp, 255 hp dan 276 hp, semuanya bergabung dengan transmisi manual, 5-percepatan sebagai standar. Secara opsional, transmisi otomatis 4-kecepatan juga dapat dipasang. Efisiensi pengereman dan resistensi fading ditingkatkan berkat semua cakram berventilasi bundar. FD RX-7 dinyatakan sebagai mobil Playboy tahun ini pada tahun 1993 dan banyak publikasi menilai itu sebagai salah satu mobil sport terbaik.",
            "Generasi ketiga dan terakhir RX-7, yang dikenal sebagai FD, 2-door Sports Coupe diproduksi dalam tiga seri, 6, 7 dan 8, dan didasarkan pada mesin putar 2,6L Wankel yang diposisikan di belakang gandar depan. Total tiga output tersedia, 236 hp, 255 hp dan 276 hp, semuanya bergabung dengan transmisi manual, 5-percepatan sebagai standar. Secara opsional, transmisi otomatis 4-kecepatan juga dapat dipasang. Efisiensi pengereman dan resistensi fading ditingkatkan berkat semua cakram berventilasi bundar. FD RX-7 dinyatakan sebagai mobil Playboy tahun ini pada tahun 1993 dan banyak publikasi menilai itu sebagai salah satu mobil sport terbaik.",
            "Generasi ketiga dan terakhir RX-7, yang dikenal sebagai FD, 2-door Sports Coupe diproduksi dalam tiga seri, 6, 7 dan 8, dan didasarkan pada mesin putar 2,6L Wankel yang diposisikan di belakang gandar depan. Total tiga output tersedia, 236 hp, 255 hp dan 276 hp, semuanya bergabung dengan transmisi manual, 5-percepatan sebagai standar. Secara opsional, transmisi otomatis 4-kecepatan juga dapat dipasang. Efisiensi pengereman dan resistensi fading ditingkatkan berkat semua cakram berventilasi bundar. FD RX-7 dinyatakan sebagai mobil Playboy tahun ini pada tahun 1993 dan banyak publikasi menilai itu sebagai salah satu mobil sport terbaik.",
            "Nissan Silvia S15 memang istimewa, menggunakan mesin SR20DET 2000cc dengan tenaga sampai 250hp. Tenaga sebesar didapatkan setelah Nissan melakukan upgrade ball bearing turbocharger. Untuk mesin tanpa turbo dengan kode mesin SR20DE tenaga yang dihasilkan 150hp. ",
            "Generasi ketiga dan terakhir RX-7, yang dikenal sebagai FD, 2-door Sports Coupe diproduksi dalam tiga seri, 6, 7 dan 8, dan didasarkan pada mesin putar 2,6L Wankel yang diposisikan di belakang gandar depan. Total tiga output tersedia, 236 hp, 255 hp dan 276 hp, semuanya bergabung dengan transmisi manual, 5-percepatan sebagai standar. Secara opsional, transmisi otomatis 4-kecepatan juga dapat dipasang. Efisiensi pengereman dan resistensi fading ditingkatkan berkat semua cakram berventilasi bundar. FD RX-7 dinyatakan sebagai mobil Playboy tahun ini pada tahun 1993 dan banyak publikasi menilai itu sebagai salah satu mobil sport terbaik.",
        )

        for (i in image.indices) {

            val movie = Movie(image[i],title[i], descriptions[i])
            movieArrayList.add(movie)
        }

    }

}