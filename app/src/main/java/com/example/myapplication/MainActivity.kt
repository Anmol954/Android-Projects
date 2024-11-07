package com.example.myapplication
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

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
            intent = Intent(this, project_file::class.java)
            startActivity(intent)
        }

        //For Certifications

        val certificate = findViewById<ImageButton>(R.id.cert)
        certificate.setOnClickListener {
            intent = Intent(this, certificate_file::class.java)
            startActivity(intent)
        }

        //For Photo Gallery

        val photo = findViewById<ImageButton>(R.id.photog)
        photo.setOnClickListener {
            intent = Intent(this, photo_galary_file::class.java)
            startActivity(intent)
        }

        //For Skills

        val skill = findViewById<ImageButton>(R.id.skill)
        skill.setOnClickListener {
            intent = Intent(this, skill_file::class.java)
            startActivity(intent)
        }

        //For Academic

        val academic = findViewById<ImageButton>(R.id.acad)
        academic.setOnClickListener {
            intent = Intent(this, academic_file::class.java)
            startActivity(intent)
        }

        //For Hobby

        val hobby = findViewById<ImageButton>(R.id.hobb)
        hobby.setOnClickListener {
            intent = Intent(this, hobby_file::class.java)
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
                intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("mailto:anmolmadhav2004@gamil.com")
                startActivity(intent)
                Toast.makeText(this, "anmolmadhav2004@gamil.com", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.contact -> {
                intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("tel:9084609780")
                startActivity(intent)
                Toast.makeText(this, "+91 9084609780", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.feedback -> {
                intent = Intent(Intent.ACTION_SENDTO)
                intent.data = Uri.parse("smsto:+919084609780")
                startActivity(intent)

                Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.logout -> {
                AlertDialog.Builder(this)
                    .setTitle("Exit")
                    .setMessage("Do you really want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes") { dialog, _ ->
                        finishAffinity()
                    }
                    .setNegativeButton("No") { dialog, _ ->dialog.dismiss()
                    }
                    .show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}