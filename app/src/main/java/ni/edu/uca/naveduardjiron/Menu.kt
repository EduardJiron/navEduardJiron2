package ni.edu.uca.naveduardjiron

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnKm:Button=findViewById(R.id.btnkm)
        var btnraiz:Button=findViewById(R.id.btnraiz)
        var btnpotencia:Button=findViewById(R.id.btnEntero)

        btnKm.setOnClickListener(){

            var intento:Intent= Intent(this,Kmmetros::class.java)

            startActivity(intento)


        }
        btnraiz.setOnClickListener(){

            var intento:Intent= Intent(this,Potencia::class.java)

            startActivity(intento)


        }
        btnpotencia.setOnClickListener(){

            var intento:Intent= Intent(this,Raiz::class.java)

            startActivity(intento)


        }

    }


}