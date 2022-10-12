package ni.edu.uca.naveduardjiron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    var txtnombre:TextView=findViewById(R.id.txtNombre)
    var txtpass:TextView=findViewById(R.id.txtPass)

        if(txtnombre.toString().equals("UCA") && txtpass.toString().equals("Nicaragua")){

            var inte:Intent=Intent(this,Menu::class.java)

            startActivity(inte)

        }

    }
}