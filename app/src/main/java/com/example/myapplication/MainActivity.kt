package com.example.myapplication
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val t: androidx.appcompat.widget.Toolbar = findViewById(R.id.menu)
        setSupportActionBar(t)
    }

    //Function used to inflate the menu bar

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

// Handle action bar item clicks here

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
           R.id.email -> {
               Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show()
               true
               }
           R.id.contact -> {
               Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show()
               true
               }
           R.id.feedback -> {
               Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show()
               true
           }
            else -> super.onOptionsItemSelected(item)
        }
    }
}