package com.ngks.ngks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class EstoqueActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estoque)

        supportActionBar?.title = "Estoque"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        var id = item?.itemId

        if (id == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}