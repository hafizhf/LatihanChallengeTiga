package andlima.hafizhfy.latihanchallengetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_screen2.*

class MainScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen2)

        gotoScreen3.setOnClickListener {
            // Get data dari EditText --------------------------------------------------------------
            val inputNama = inputNama.text.toString()

            // Deklarasi Intent + kirim data nama --------------------------------------------------
            val intent = Intent(this, MainScreen3::class.java)
            intent.putExtra("nama", inputNama)

            // Start Intent ------------------------------------------------------------------------
            startActivity(intent)
        }
    }
}