package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PesquisarPacienteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisar_paciente)
    }


    fun irTelaPacienteFarmaceutico(v: View){
        val telaPcienteFarmaceutico = Intent(this, PerfilPacienteFarmaceuticoEntrarActivity::class.java)
        startActivity(telaPcienteFarmaceutico)

    }
}
