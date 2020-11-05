package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.firstapplication.R.id.randomizedBtn

class MainActivity : AppCompatActivity() {
    var TAG = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textEdit = findViewById<TextView>(R.id.randomizedText)

        var randomizeBtn = findViewById<Button>(randomizedBtn)

        randomizeBtn.setOnClickListener {
            textEdit.text = listbase()
            Log.d(TAG, "${joinedlist}")
            Toast.makeText(this, "updating text", Toast.LENGTH_SHORT).show()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        //      menu?.getItem(1)?.isEnabled = false
        menu?.getItem(1)?.isEnabled = false
        return super.onPrepareOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_add -> {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Title of Dialog")
                builder.setMessage("Enter some stuff...")
                builder.setPositiveButton("Yes"){_,_ ->
                    Toast.makeText(applicationContext, "Yes we know what we are doing", Toast.LENGTH_SHORT).show()
                }
                builder.setNegativeButton("No"){_,_ ->
                    Toast.makeText(applicationContext, "No selected", Toast.LENGTH_SHORT).show()

                }
                builder.setNeutralButton("Neutral message"){ _,_ ->
                    Toast.makeText(applicationContext, "Neutral Selected", Toast.LENGTH_SHORT).show()

                }
                builder.show()
                true
            }
            R.id.menu_remove -> {
                Toast.makeText(this, "Another toast", Toast.LENGTH_SHORT).show()
                true
            }


            else -> return super.onOptionsItemSelected(item)
        }
    }
}