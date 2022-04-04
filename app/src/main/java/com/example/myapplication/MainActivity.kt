package com.example.myapplication

import android.icu.text.NumberFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun amount() {
        val stringInTextField = binding.CupcakeAmount.text.toString()
        val ccamount = stringInTextField.toDoubleOrNull()
        if (ccamount == null || ccamount = 0.0) {
            displayccamount(0.0)
            return
        }
        val stringInTextField2 = binding.DonutAmount.text.toString()
        val damount = stringInTextField2.toDoubleOrNull()
        if (damount == null || damount = 0.0) {
            displaydoamount(0.0)
            return
        }
        val stringInTextField3 = binding.EclairAmount.text.toString()
        val eamount = stringInTextField3.toDoubleOrNull()
        if (eamount == null || eamount = 0.0) {
            displayecamount(0.0)
            return
        }
        val stringInTextField4 = binding.FroyoAmount.text.toString()
        val famount = stringInTextField4.toDoubleOrNull()
        if (famount == null || famount = 0.0) {
            displayfyamount(0.0)
            return
        }
        val stringInTextField5 = binding.GingerBreadAmount.text.toString()
        val gamount = stringInTextField5.toDoubleOrNull()
        if (gamount == null || gamount = 0.0) {
            displaygbamount(0.0)
            return
        }
        val stringInTextField6 = binding.HoneyCombAmount.text.toString()
        val hamount = stringInTextField6.toDoubleOrNull()
        if (hamount == null || hamount = 0.0) {
            displayhcamount(0.0)
            return
        }
        val stringInTextField7 = binding.IceCreamSandwichAmount.text.toString()
        val iamount = stringInTextField7.toDoubleOrNull()
        if (iamount == null || iamount = 0.0) {
            displayicamount(0.0)
            return
        }
        val stringInTextField8 = binding.JellyBeanAmount.text.toString()
        val jamount = stringInTextField8.toDoubleOrNull()
        if (jamount == null || jamount = 0.0) {
            displayjbamount(0.0)
            return
        }
        val stringInTextField9 = binding.KitKatAmount.text.toString()
        val kamount = stringInTextField9.toDoubleOrNull()
        if (kamount == null || kamount = 0.0) {
            displaykkamount(0.0)
            return
        }
        val stringInTextField10 = binding.LollipopAmount.text.toString()
        val lamount = stringInTextField10.toDoubleOrNull()
        if (lamount == null || lamount = 0.0) {
            displayllamount(0.0)
            return
        }
        val stringInTextField11 = binding.MarshmallowAmount.text.toString()
        val mamount = stringInTextField11.toDoubleOrNull()
        if (mamount == null || mamount = 0.0) {
            displaymmamount(0.0)
            return
        }
        var noamount = 0.0
        val stringInTextField12 = binding.NougatAmount.text.toString()
        val namount = stringInTextField12.toDoubleOrNull()
        if (namount == null || namount = 0.0) {
            displaynoamount(0.0)
            return
        }

    }

    private fun displaynoamount(a: Double) {
        NumberFormat.getNumberInstance().format(a)
    }

    private fun displayllamount(b: Double) {
        NumberFormat.getNumberInstance().format(b)
    }

    private fun displayecamount(c: Double) {
        NumberFormat.getNumberInstance().format(c)
    }

    private fun displaymmamount(d: Double) {
        NumberFormat.getNumberInstance().format(d)
    }

    private fun displayfyamount(e: Double) {
        NumberFormat.getNumberInstance().format(e)
    }

    private fun displaygbamount(f: Double) {
        NumberFormat.getNumberInstance().format(f)
    }

    private fun displayicamount(g: Double) {
        NumberFormat.getNumberInstance().format(g)
    }

    private fun displayjbamount(h: Double) {
        NumberFormat.getNumberInstance().format(h)
    }

    private fun displaykkamount(i: Double) {
        NumberFormat.getNumberInstance().format(i)
    }

    private fun displayhcamount(j: Double) {
        NumberFormat.getNumberInstance().format(j)
    }

    private fun displaydoamount(k: Double) {
        NumberFormat.getNumberInstance().format(k)
    }

    private fun displayccamount(l: Double) {
        NumberFormat.getNumberInstance().format(l)
    }



}