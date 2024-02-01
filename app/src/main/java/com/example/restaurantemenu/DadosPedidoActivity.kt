package com.example.restaurantemenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurantemenu.databinding.ActivityDadosPedidoBinding

class DadosPedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDadosPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val qtd_bolo = i.getStringExtra("qtd_bolo").toString().toInt()
        val qtd_empada = i.getStringExtra("qtd_empada").toString().toInt()
        val qtd_torta = i.getStringExtra("qtd_torta").toString().toInt()
        val qtd_ham = i.getStringExtra("qtd_ham").toString().toInt()

        val prc_bolo = i.getDoubleExtra("prc_bolo", 0.0).toDouble()
        val prc_empada = i.getDoubleExtra("prc_empada", 0.0).toDouble()
        val prc_torta = i.getDoubleExtra("prc_torta", 0.0).toDouble()
        val prc_ham = i.getDoubleExtra("prc_ham", 0.0).toDouble()

        val custoBolo = qtd_bolo * prc_bolo
        val custoEmpada = qtd_empada * prc_empada
        val custoTorta = qtd_torta * prc_torta
        val custoHam = qtd_ham * prc_ham
        val total = custoBolo + custoEmpada + custoTorta + custoHam

        val texto = "Resumo do seu pedido: \n---------------\n" +
                "Bolo: $qtd_bolo \n Preço: R$${custoBolo}\n---------------\n" +
                "Empada: $qtd_empada \n Preço: R$${custoEmpada}\n---------------\n" +
                "Torta: $qtd_torta \n Preço: R$${custoTorta}\n---------------\n" +
                "Hambúrguer: $qtd_ham \n Preço: R$${custoHam}\n---------------\n" +
                "Total: R$$total \n"

        binding.textResumo.setText(texto)

        binding.buttonConcluir.setOnClickListener {
            finish()
        }
    }
}