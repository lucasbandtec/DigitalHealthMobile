package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ReceitaCVisualizarDescricaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receita_c_visualizar_descricao)
    }

    fun irTelaResponsavelLegalReceitaC(v: View){
        val telaResponsavelLegal_C = Intent(this, ReceitaCVisualizarDescricaoRespLegalActivity::class.java)
        startActivity(telaResponsavelLegal_C)

    }
}
