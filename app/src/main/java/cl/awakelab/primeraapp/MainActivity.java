package cl.awakelab.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView text = findViewById(R.id.mainText);
//        int result = calcular("1,2");
//
//        text.setText("El resultado es: " + String.valueOf(result));



    }

    private int calcular(String numeros) {

        Log.d("MainActivity", "estamos en el método calcular");
        if(numeros.isEmpty()) {
            System.out.println("No has ingresado números");
        }
        String[] nums = numeros.split(",");
        int suma = 0;
        for (int i = 0;i<nums.length; i++) {
            suma += Integer.valueOf(nums[i]);
        }
        return suma;
    }

}