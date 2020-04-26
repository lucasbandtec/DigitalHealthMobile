package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PerfilPacienteFarmaceuticoEntrarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_paciente_farmaceutico)
    }




    fun irTelaPacienteFarmaceuticoReceitas(v: View){
        val telaPacienteFarmaceuticoReceitas = Intent(this, PerfilPacienteFarmaceuticoReceitasActivity::class.java)
        startActivity(telaPacienteFarmaceuticoReceitas)

    }
}
