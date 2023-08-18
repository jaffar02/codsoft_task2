package com.alphadev.codsoft_task2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alphadev.codsoft_task2.databinding.ActivityMainBinding
import org.mozilla.javascript.Scriptable


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var data: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button0.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "0")
            }
        })

        binding.button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.text.toString()
                binding.inputTxt.setText(data + "1")
            }
        })

        binding.button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "2")
            }
        })


        binding.button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "3")
            }
        })

        binding.button4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "4")
            }
        })

        binding.button5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "5")
            }
        })

        binding.button6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "6")
            }
        })

        binding.button7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "7")
            }
        })

        binding.button8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "8")
            }
        })

        binding.button9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText(data + "9")
            }
        })

        binding.buttonAc.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.inputTxt.setText("")
                binding.outputTxt.setText("")
            }
        })

        binding.buttonDot.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText("$data.")
            }
        })

        binding.buttonPlus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText("$data+")
            }
        })

        binding.buttonMinus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText("$data-")
            }
        })

        binding.btnModulus.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText("$data%")
            }
        })

        binding.buttonMultiplication.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.getText().toString()
                binding.inputTxt.setText("$data×")
            }
        })

        binding.buttonEqual.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                data = binding.inputTxt.text.toString()
                data = data!!.replace("×".toRegex(), "*")
                data = data!!.replace("%".toRegex(), "/100")
                data = data!!.replace("÷".toRegex(), "/")
                val rhino: org.mozilla.javascript.Context = org.mozilla.javascript.Context.enter()
                rhino.setOptimizationLevel(-1)
                var finalResult = ""
                val scriptable: Scriptable = rhino.initStandardObjects()
                finalResult =
                    rhino.evaluateString(scriptable, data, "Javsscript", 1, null).toString()
                binding.outputTxt.setText(finalResult)
            }
        })

    }
}