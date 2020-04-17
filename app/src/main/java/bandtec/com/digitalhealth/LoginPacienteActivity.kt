package bandtec.com.digitalhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import br.com.concretesolutions.canarinho.formatador.FormatadorCPFCNPJ
import kotlinx.android.synthetic.main.activity_login_paciente.*

class LoginPacienteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_paciente)

        findViewById<AppCompatButton>(R.id.btn_entrar).setOnClickListener {  }
        val cpf = findViewById<AppCompatTextView>(R.id.input_cpf)
        cpf.addTextChangedListener(object: TextWatcher{

            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                cpf.setText(FormatadorCPFCNPJ.CPF.formata(s.toString()))
            }

        })

    }


}
