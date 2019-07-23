package epxilon.formula;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import epxilon.formula.R;
import java.lang.Integer;

public class rform extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rform);
		
		int s = Integer.valueOf(getIntent().getStringExtra("DOB")).intValue();
		
		int Y = s%100;
		int C = (s/100)%100;
		int M = (s/10000)%100;
		int D = (s/1000000)%100;

		int grid[][] = new int[4][4];
		TextView tv[][] = new TextView[4][4];
		
		for(int i = 0 ;i<4;i++)
			for(int j = 0 ; j<4;j++)
				grid[i][j] = 0;
		
		Integer g[][] = new Integer[4][4];
		
		tv[0][0] = (TextView) findViewById(R.id.tv11);
		tv[0][1] = (TextView) findViewById(R.id.tv12);
		tv[0][2] = (TextView) findViewById(R.id.tv13);
		tv[0][3] = (TextView) findViewById(R.id.tv14);
		
		tv[1][0] = (TextView) findViewById(R.id.tv21);
		tv[1][1] = (TextView) findViewById(R.id.tv22);
		tv[1][2] = (TextView) findViewById(R.id.tv23);
		tv[1][3] = (TextView) findViewById(R.id.tv24);
		
		tv[2][0] = (TextView) findViewById(R.id.tv31);
		tv[2][1] = (TextView) findViewById(R.id.tv32);
		tv[2][2] = (TextView) findViewById(R.id.tv33);
		tv[2][3] = (TextView) findViewById(R.id.tv34);
		
		tv[3][0] = (TextView) findViewById(R.id.tv41);
		tv[3][1] = (TextView) findViewById(R.id.tv42);
		tv[3][2] = (TextView) findViewById(R.id.tv43);
		tv[3][3] = (TextView) findViewById(R.id.tv44);
	/*	
		tv[0][0].setText(d.toString());
		tv[0][1].setText(m.toString());
		tv[0][2].setText(c.toString());
		tv[0][3].setText(y.toString());
		
		tv[1][0].setText(Integer.valueOf(Y+1).toString());
		tv[1][1].setText(Integer.valueOf(C-1).toString());
		tv[1][2].setText(Integer.valueOf(M-3).toString());
		tv[1][3].setText(Integer.valueOf(D+3).toString());
		
		tv[2][0].setText(Integer.valueOf(M-2).toString());
		tv[2][1].setText(Integer.valueOf(D+2).toString());
		tv[2][2].setText(Integer.valueOf(Y+2).toString());
		tv[2][3].setText(Integer.valueOf(C-2).toString());
		
		tv[3][0].setText(Integer.valueOf(C+1).toString());
		tv[3][1].setText(Integer.valueOf(Y-1).toString());
		tv[3][2].setText(Integer.valueOf(D+1).toString());
		tv[3][3].setText(Integer.valueOf(M-1).toString());
	*/
		g[0][0] = Integer.valueOf(D);
		g[0][1] = Integer.valueOf(M);
		g[0][2] = Integer.valueOf(C);
		g[0][3] = Integer.valueOf(Y);
		
		g[1][0] = Integer.valueOf(Y+1);
		g[1][1] = Integer.valueOf(C-1);
		g[1][2] = Integer.valueOf(M-3);
		g[1][3] = Integer.valueOf(D+3);
		
		g[2][0] = Integer.valueOf(M-2);
		g[2][1] = Integer.valueOf(D+2);
		g[2][2] = Integer.valueOf(Y+2);
		g[2][3] = Integer.valueOf(C-2);
		
		g[3][0] = Integer.valueOf(C+1);
		g[3][1] = Integer.valueOf(Y-1);
		g[3][2] = Integer.valueOf(D+1);
		g[3][3] = Integer.valueOf(M-1);
		
		for(int i = 0 ;i<4;i++)
			for(int j = 0 ; j<4;j++)
				tv[i][j].setText((CharSequence)g[i][j].toString());
	}

}
