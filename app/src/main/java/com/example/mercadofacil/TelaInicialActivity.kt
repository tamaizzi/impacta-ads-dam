package com.example.mercadofacil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class TelaInicialActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        var params = intent.extras
        val nome = params?.getString("campo_login")
        val senha = params?.getString("campo_senha")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id= item?.itemId
        if(id==R.id.action_buscar){
            Toast.makeText(this,"clicou Buscar", Toast.LENGTH_SHORT).show()
        }
        if(id==R.id.action_atualizar){
            Toast.makeText(this,"clicou Atualizar", Toast.LENGTH_SHORT).show()
        }
        if(id==R.id.action_config){
            Toast.makeText(this,"clicou Config", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
