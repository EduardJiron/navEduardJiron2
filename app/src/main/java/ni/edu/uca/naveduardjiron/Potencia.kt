package ni.edu.uca.naveduardjiron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Potencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_potencia)

        var txtpont:EditText=findViewById(R.id.txtPoten)
        var btnpot:Button=findViewById(R.id.btnpoten)
        var txtresp:TextView=findViewById(R.id.txtresp)

        btnpot.setOnClickListener(){

            var potencia:Double=txtpont.text.toString().toDouble()
            var potencia2:Double=potencia*potencia
            txtresp.text=potencia2.toString()

        }

    }
}