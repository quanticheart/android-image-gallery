package com.quanticheart.imagegallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.galery_activity.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: GaleryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.galery_activity)
        adapter = GaleryAdapter(list)

        val listGalery = getAllImages()
        adapter.addData(listGalery)
    }
}
