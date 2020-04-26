package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PerfilPacienteFarmaceuticoReceitasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_paciente_farmaceutico_receitas)
    }


    fun irTelaPacienteFarmaceuticoReceita_A(v: View){
        val telaPacienteFarmaceuticoReceitaA = Intent(this, ReceitaAVisualizarDescricaoActivity::class.java)
        startActivity(telaPacienteFarmaceuticoReceitaA)

    }

    fun irTelaPacienteFarmaceuticoReceita_B(v: View){
        val telaPacienteFarmaceuticoReceitaB = Intent(this, ReceitaBVisualizarDescricaoActivity::class.java)
        startActivity(telaPacienteFarmaceuticoReceitaB)
    }

    fun irTelaPacienteFarmaceuticoReceita_C(v: View){
        val telaPacienteFarmaceuticoReceitaC = Intent(this, ReceitaCVisualizarDescricaoActivity::class.java)
        startActivity(telaPacienteFarmaceuticoReceitaC)

    }
}
