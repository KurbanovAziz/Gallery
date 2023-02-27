package com.example.gallery

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gallery.databinding.ActivityResultBinding

@Suppress("UNCHECKED_CAST", "DEPRECATION")
class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private val adapter = SelectedAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
        initView()
    }

    private fun initView() {
        binding.rvSelectedImage.adapter = adapter
    }

    private fun initListener() {
        val uri = intent.getSerializableExtra("image")
        if (uri != null){
            adapter.addImage(uri as ArrayList<Uri>)
        }
    }
}