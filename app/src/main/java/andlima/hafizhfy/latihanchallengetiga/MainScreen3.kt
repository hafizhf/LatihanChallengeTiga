package andlima.hafizhfy.latihanchallengetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_screen3.*

class MainScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen3)

        // Ini dari MainScreen2 --------------------------------------------------------------------
        val nama = intent.getStringExtra("nama")
        showNama.text = nama

        // Ini dari MainScreen4 --------------------------------------------------------------------
        val getBund = intent.extras

        // Cek apakah ada data dari MainScreen4 ----------------------------------------------------
        if (getBund?.getString("usia") != null) {
            // Show container visibility -----------------------------------------------------------
            showMoreData.visibility = View.VISIBLE

            // Show more data dari MainScreen4 -----------------------------------------------------
            showNama.text = getBund.getString("nama")
            showUsia.text = getBund.getString("usia")
            showUsia.append(", bernilai " + getBund.getString("isUsia"))
            showAlamat.text = getBund.getString("alamat")
            showPekerjaan.text = getBund.getString("pekerjaan")
        }

        gotoScreen4.setOnClickListener {
            // Start Intent ke MainScreen4 ---------------------------------------------------------
            val intent = Intent(this, MainScreen4::class.java)
            intent.putExtra("nama", nama)
            startActivity(intent)
        }
    }
}