package com.example.restaurantemenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.restaurantemenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val precoBolo = 10.0
    private val precoEmpada = 18.0
    private val precoTorta = 20.0
    private val precoHamburguer = 15.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("qtd_bolo", binding.editQuantidadeBolo.text.toString())
            i.putExtra("qtd_empada", binding.editQuantidadeEmpada.text.toString())
            i.putExtra("qtd_torta", binding.editQuantidadeTorta.text.toString())
            i.putExtra("qtd_ham", binding.editQuantidadeHamburguer.text.toString())

            i.putExtra("prc_bolo", precoBolo)
            i.putExtra("prc_empada", precoEmpada)
            i.putExtra("prc_torta", precoTorta)
            i.putExtra("prc_ham", precoHamburguer)

            startActivity(i)
        }

        binding.checkBolo.setOnClickListener {
            if (binding.checkBolo.isChecked()) {
                binding.editQuantidadeBolo.setText("1")
                binding.textPrecoBolo.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeBolo.setText("0")
                binding.textPrecoBolo.visibility = View.GONE
            }
        }

        binding.checkEmpada.setOnClickListener {
            if (binding.checkEmpada.isChecked()) {
                binding.editQuantidadeEmpada.setText("1")
                binding.textPrecoEmpada.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeEmpada.setText("0")
                binding.textPrecoEmpada.visibility = View.GONE
            }
        }

        binding.checkTorta.setOnClickListener {
            if (binding.checkTorta.isChecked()) {
                binding.editQuantidadeTorta.setText("1")
                binding.textPrecoTorta.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeTorta.setText("0")
                binding.textPrecoTorta.visibility = View.GONE
            }
        }

        binding.checkHamburguer.setOnClickListener {
            if (binding.checkHamburguer.isChecked()) {
                binding.editQuantidadeHamburguer.setText("1")
                binding.textPrecoHamburguer.visibility = View.VISIBLE
            } else {
                binding.editQuantidadeHamburguer.setText("0")
                binding.textPrecoHamburguer.visibility = View.GONE
            }
        }
    }
}