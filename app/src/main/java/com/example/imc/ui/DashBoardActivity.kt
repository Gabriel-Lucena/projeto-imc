package com.example.imc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imc.R

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}

private fun carregarDash() {
    val arquivo = getSharedPreferences("usuario", MODE_PRIVATE)

    tvNome.text = arquivo.getString("nome", "")
    tvProfissao.text = arquivo.getString("profissao", "")
    tvAltura.text = arquivo.getFloat("altura", 0.0f).toString()
}