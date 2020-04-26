package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelecionarPerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecionar_perfil)
    }


    fun irTelaPaciente(v: View){

        val telaPaciente = Intent(this, LoginPacienteActivity::class.java)

        startActivity(telaPaciente)
    }


    fun irTelaFarmaceutico(v: View){
        val telaFarmaceutico = Intent(this, LoginFarmaceuticoActivity::class.java)
        startActivity(telaFarmaceutico)

    }

//    fun irloginMedico(v: View){
//        val loginMedico = Intent(this, LoginMedicoActivity::class.java)
//        startActivity(loginMedico)
//
//    }
}
