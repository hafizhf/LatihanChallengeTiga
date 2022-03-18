package andlima.hafizhfy.latihanchallengetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_screen4.*

class MainScreen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen4)

        // Get nama dari MainScreen3 ---------------------------------------------------------------
        val nama = intent.getStringExtra("nama")

        backToScreen3.setOnClickListener {
            // Get data dari input EditText --------------------------------------------------------
            val usia = inputUsia.text.toString().toInt()
            val alamat = inputAlamat.text.toString()
            val pekerjaan = inputPekerjaan.text.toString()

            // Cek usia ganjil/genap ---------------------------------------------------------------
            val isUsia : String = if (usia % 2 == 0) {
                "Genap"
            } else {
                "Ganjil"
            }

            // Deklarasi Intent --------------------------------------------------------------------
            val intent = Intent(this, MainScreen3::class.java)

            // Pake Bundle -------------------------------------------------------------------------
            val bund = Bundle()
            bund.putString("nama", nama)
            bund.putString("usia", usia.toString())
            bund.putString("isUsia", isUsia)
            bund.putString("alamat", alamat)
            bund.putString("pekerjaan", pekerjaan)

            // Start Intent ------------------------------------------------------------------------
            intent.putExtras(bund)
            startActivity(intent)
            finish()
        }
    }
}