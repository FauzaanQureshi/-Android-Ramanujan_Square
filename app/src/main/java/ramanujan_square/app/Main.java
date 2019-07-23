package epxilon.formula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import epxilon.formula.R;

public class Main extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		final EditText et = findViewById(R.id.editText1);
		
		Button go = findViewById(R.id.button1);
		
		go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(Main.this, rform.class).putExtra("DOB", et.getText().toString()));
				
			}
		});
		
	}

}
