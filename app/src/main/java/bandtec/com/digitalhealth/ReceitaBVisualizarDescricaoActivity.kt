package bandtec.com.digitalhealth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ReceitaBVisualizarDescricaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receita_b_visualizar_descricao)
    }

    fun irTelaResponsavelLegalReceitaB(v: View){
        val telaResponsavelLegal_B = Intent(this, ReceitaBVisualizarDescricaoRespLegalActivity::class.java)
        startActivity(telaResponsavelLegal_B)

    }
}
