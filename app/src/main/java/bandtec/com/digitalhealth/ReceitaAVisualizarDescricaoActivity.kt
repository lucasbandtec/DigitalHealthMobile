package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ReceitaAVisualizarDescricaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receita_a_visualizar_descricao)
    }


    fun irTelaResponsavelLegalReceitaA(v: View){
        val telaResponsavelLegal_A = Intent(this, ReceitaAVisualizarDescricaoRespLegalActivity::class.java)
        startActivity(telaResponsavelLegal_A)

    }
}
