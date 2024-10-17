package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
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
        supportActionBar?.title = "Anmol Madhav"


        //For Projects

        val project = findViewById<ImageButton>(R.id.proj)
        project.setOnClickListener {
            intent = Intent(this, project::class.java)
            startActivity(intent)
        }

        //For Certifications

        val certificate = findViewById<ImageButton>(R.id.cert)
        certificate.setOnClickListener {
            intent = Intent(this, certificate::class.java)
            startActivity(intent)
        }

        //For Photo Gallery

        val photo = findViewById<ImageButton>(R.id.photog)
        photo.setOnClickListener {
            intent = Intent(this, photo_galary::class.java)
            startActivity(intent)
        }

        //For Skills

        val skill = findViewById<ImageButton>(R.id.skill)
        skill.setOnClickListener {
            intent = Intent(this, skill::class.java)
            startActivity(intent)
        }

        //For Academic

        val academic = findViewById<ImageButton>(R.id.acad)
        academic.setOnClickListener {
            intent = Intent(this, academics::class.java)
            startActivity(intent)
        }

        //For Hobby

        val hobby = findViewById<ImageButton>(R.id.hobb)
        hobby.setOnClickListener {
            intent = Intent(this, hobby::class.java)
            startActivity(intent)
        }

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
               Toast.makeText(this, "anmolmadhav2004@gamil.com", Toast.LENGTH_SHORT).show()
               true
               }
           R.id.contact -> {
               Toast.makeText(this, "+91 908460978", Toast.LENGTH_SHORT).show()
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