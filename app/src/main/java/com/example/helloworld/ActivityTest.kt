package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test.*

class ActivityTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        /*val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, "点击了button", Toast.LENGTH_SHORT).show()
        }*/

        var stringExtra = intent.getStringExtra("")
        button.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.action = ""
            startActivity(intent)
        }

        MainActivity::class.java


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate()
        return super.onCreateOptionsMenu(menu)
    }


}