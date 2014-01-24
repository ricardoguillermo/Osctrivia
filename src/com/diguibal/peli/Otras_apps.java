package com.diguibal.peli;


import com.diguibal.trivia.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class Otras_apps extends Activity implements OnClickListener {
	/*ListView list;
	Button button;
	EditText editText;
	String[] web = {
			"Mundiales. Aca va a ir una pequena descripcion de esta aplicacion"
					+ " que va a ocupar 3 renglones por lo menos",
			"Imagenes. Aca va a ir una pequena descripcion de esta aplicacion"
					+ " que va a ocupar 3 renglones por lo menos",
			"Windows.Aca va a ir una pequena descripcion de esta aplicacion ",
			"Bing. Aca va a ir una pequena descripcion de esta aplicacion",
			"Itunes.Aca va a ir una pequena descripcion de esta aplicacion " };
	Integer[] imageId = { R.drawable.image1, R.drawable.image2,
			R.drawable.image3, R.drawable.image4, R.drawable.image5

	};
*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// elimina barra 
		setContentView(R.layout.otras_provisorio);
		
		 /*button=(Button) findViewById(R.id.buttonopp1); editText=(EditText)
		 findViewById(R.id.editTextopp1);
		 button.setOnClickListener(this);
		 */

		/*CustomList adapter = new CustomList(Otras_apps.this, web, imageId);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(Otras_apps.this,
						"You Clicked at " + web[+position], Toast.LENGTH_SHORT)
						.show();

			}
		});
*/
	}

	@Override
	public void onClick(View v) {
		
		/*
		  switch (v.getId()) { case R.id.buttonopp1: Intent i = new
		  Intent(this, Cancha_para_testar.class); i.putExtra("numeropregunta",
		  editText.getText().toString());
		  startActivity(i); break;
		  
		  default: break; }*/
		 

	}

}
