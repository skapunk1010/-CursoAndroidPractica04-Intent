package com.example.p4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
		
		TextView mostrarMensaje = (TextView) findViewById(R.id.textView1); 
		
		Intent intencion = this.getIntent();
		String msg = intencion.getStringExtra("mensajeActivity1");
		
		mostrarMensaje.setText(msg);
		
		setResult(RESULT_OK);
		finish();
	}

}
