package ctec.usape.controller;

import ctec.usape.model.androidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EuropeanActivity extends Activity
{
	private androidAppState appState;
	private TextView comboText;
	private Button homeButt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_european);
		
		appState = (androidAppState) getApplication();
		comboText = (TextView) findViewById(R.id.combinedTextView);
		homeButt = (Button) findViewById(R.id.homeButton);
		
		comboText.setText(appState.getName() + " is " +
						  appState.getAge() + " and says " +
						  appState.getOtherThings() + " about " +
						  appState.getPhrase());
		
		setHeyListens();
	}

	private void setHeyListens()
	{
		homeButt.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
		
	}
}
