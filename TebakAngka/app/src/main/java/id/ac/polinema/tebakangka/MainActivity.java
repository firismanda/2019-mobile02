package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

	private int tebakan;
	private EditText inputan;
//	Scanner s = new Scanner(System.in);
	//  TODO: deklarasikan variabel di sini

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		inputan = findViewById(R.id.number_input);
		initRandomNumber();
	}


	private void initRandomNumber() {
		Random random = new Random();
		int r = random.nextInt(50);
		tebakan = r;
		// TODO: generate angka random di sini
	}

	public void handleGuess(View view) {
		String angka = inputan.getText().toString();
		int input = Integer.parseInt(angka);

		if (input==tebakan){
			Toast.makeText(this,"Tebakan anda benar!", Toast.LENGTH_SHORT).show();
		}else if(input>tebakan){
			Toast.makeText(this,"Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
		}else if(input<tebakan){
			Toast.makeText(this,"Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
		}else
			Toast.makeText(this,"Wrong type dude!", Toast.LENGTH_SHORT).show();
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
	}

	public void handleReset(View view) {
		inputan.setText("");
		initRandomNumber();
		// TODO: Reset tampilan
	}
}
