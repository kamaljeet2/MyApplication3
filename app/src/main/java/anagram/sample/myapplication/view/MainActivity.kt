package anagram.sample.myapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import anagram.sample.myapplication.R
import anagram.sample.myapplication.databinding.ActivityMainBinding
import anagram.sample.myapplication.viewmodel.AnagramViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: AnagramViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /*data binding with so the data direct access in view model*/
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        /*get viewmodel */
        viewModel = ViewModelProvider(this).get(AnagramViewModel::class.java)

        val button:Button = findViewById<Button>(R.id.bt_validate)
        binding.anagramViewModel=viewModel
        button.setOnClickListener(View.OnClickListener {
            val status:Int=viewModel.isBothTextAnagram()
            when(status){
                1-> {
                    (Toast.makeText(this,"Please enter first text",Toast.LENGTH_SHORT)).show()
                }
                2-> {
                    (Toast.makeText(this,"Please enter second text",Toast.LENGTH_SHORT)).show()
                }
                3-> {
                    (Toast.makeText(this,"These are Anagram",Toast.LENGTH_SHORT)).show()
                }
                4-> {
                    (Toast.makeText(this,"These are not Anagram",Toast.LENGTH_SHORT)).show()
                }
            }

        })
    }
}
