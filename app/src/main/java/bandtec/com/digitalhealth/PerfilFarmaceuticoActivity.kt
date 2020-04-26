package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PerfilFarmaceuticoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_farmaceutico)
    }



    fun irtelaPesquisarPacienteFarmaceutico(v: View){
        val telaPesquisarPacienteFarmaceutico = Intent(this, PesquisarPacienteActivity::class.java)
        startActivity(telaPesquisarPacienteFarmaceutico)

    }
}
