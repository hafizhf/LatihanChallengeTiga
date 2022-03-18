package andlima.hafizhfy.latihanchallengetiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotoScreen2.setOnClickListener {
            startActivity(Intent(this, MainScreen2::class.java))
            finish()
        }
    }
}