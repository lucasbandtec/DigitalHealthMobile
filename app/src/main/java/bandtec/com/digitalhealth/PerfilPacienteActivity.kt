package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import de.hdodenhof.circleimageview.CircleImageView;

class PerfilPacienteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_paciente)
    }



    fun irTelaMinhasReceitas(v: View){
        val telaMinhasReceitasPaciente = Intent(this, MinhasReceitasPacienteActivity::class.java)
        startActivity(telaMinhasReceitasPaciente)

    }

    fun irTelaMeuHistoricoPaciente(v: View){
        val telaMeuHistoricoPaciente = Intent(this, MeuHistoricoPacienteActivity::class.java)
        startActivity(telaMeuHistoricoPaciente)

    }
}

