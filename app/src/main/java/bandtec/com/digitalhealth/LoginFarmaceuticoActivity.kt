package bandtec.com.digitalhealth

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_farmaceutico.*

class LoginFarmaceuticoActivity : AppCompatActivity() {

    var preferencias: SharedPreferences?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_farmaceutico)

        preferencias = getPreferences(Context.MODE_PRIVATE)

        input_cnpj.setText(preferencias?.getString("cpnjFarmaceutico", ""))

    }

    fun salvarDados( v:View){ // associar um onclik para o botao

        val editor = preferencias?.edit()

        editor?.putString("cpnjFarmaceutico", input_cnpj.text.toString())

        editor?.commit()
    }


    val cpnj = "1234567890"
    val senha = "1234"

    fun irtelaPerfilFarmaceutico(v: View) {
        val telaFarmaceuticoHome = Intent(this, PerfilFarmaceuticoActivity::class.java)

        val edtUsuario = findViewById<EditText>(R.id.input_cnpj).text.toString()
        val edtSenha = findViewById<EditText>(R.id.input_senha).text.toString()


//        if(edtUsuario == usuario && edtSenha == senha){
//            Toast.makeText(this, "Login Efetuado com Sucesso", Toast.LENGTH_LONG).show()
//        }else {
//            Toast.makeText(this, "Usuário ou senha INVÁLIDOS!", Toast.LENGTH_LONG).show()
//        }


        if (edtUsuario.equals(cpnj) && edtSenha.equals(senha)) {
            Toast.makeText(this, "Login Efetuado com SUCESSO!!!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Usuário ou senha INVÁLIDOS!!!", Toast.LENGTH_LONG).show()
        }


        startActivity(telaFarmaceuticoHome)


    }
    fun voltarSelecionePerfil(v: View){

        finish()
    }
}
