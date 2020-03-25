package a1824jj.jp.ac.aiit.corutine_sampel1

import a1824jj.jp.ac.aiit.corutine_sampel1.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            btnCount.setOnClickListener {
                tvCount.text = count++.toString()
            }

            btnDownLoadUserData.setOnClickListener {
                downLoadUserData()
            }

        }

    }

    private fun downLoadUserData() {
        for (i in 1..200000){
            Log.w("MyTag","Downloading user $i in ${Thread.currentThread().name}")
        }
    }
}
