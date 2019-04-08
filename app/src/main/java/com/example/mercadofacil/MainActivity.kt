package com.example.mercadofacil

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        botao_login.setOnClickListener {
            val campoUsuario = campo_login.text.toString()
            val valorSenha = campo_senha.text.toString()

            if (campoUsuario == "aluno" && valorSenha == "impacta") {
                val intent = Intent(this, TelaInicialActivity::class.java)
                val param = Bundle()
                param.putString("campo_login", "")
                param.putString("campo_senha","")
                intent.putExtras(param)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Nome ou senha inválidos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onPause() {
        super.onPause()


    }

}
