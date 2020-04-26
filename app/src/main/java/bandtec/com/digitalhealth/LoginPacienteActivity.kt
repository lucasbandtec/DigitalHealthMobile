package bandtec.com.digitalhealth

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginPacienteActivity : AppCompatActivity() {
        lateinit var edtUsuario : EditText;
        lateinit var edtSenha : EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_paciente)


    }

    val  usuario = "123456789"
    val senha = "1234"

    fun irtelaPerfilPaciente (v: View){
        val telaPacienteHome = Intent(this, PerfilPacienteActivity:: class.java)

        val edtUsuario = findViewById<EditText>(R.id.input_cpf).text.toString()
        val edtSenha = findViewById<EditText>(R.id.input_senha).text.toString()


//        if(edtUsuario == usuario && edtSenha == senha){
//            Toast.makeText(this, "Login Efetuado com Sucesso", Toast.LENGTH_LONG).show()
//        }else {
//            Toast.makeText(this, "Usuário ou senha INVÁLIDOS!", Toast.LENGTH_LONG).show()
//        }


        if(edtUsuario.equals(usuario) && edtSenha.equals(senha)){
            Toast.makeText(this, "Login Efetuado com Sucesso", Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(this, "Usuário ou senha INVÁLIDOS!", Toast.LENGTH_LONG).show()
        }


        startActivity(telaPacienteHome)
    }




    fun voltarSelecionePerfil(v: View){

        finish()
    }


}
