package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val irtelaSelecionarPerfil = Intent(this, SelecionarPerfilActivity::class.java)
        startActivity(irtelaSelecionarPerfil)
    }


}
