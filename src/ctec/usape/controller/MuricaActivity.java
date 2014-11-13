package ctec.usape.controller;

import ctec.usape.model.androidAppState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MuricaActivity extends Activity
{
	private EditText ageField, nameField, phraseField, stuffField;
	private Button changeButton;
	private androidAppState appState;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_murica);
		
		ageField = (EditText) findViewById(R.id.ageEditText);
		nameField = (EditText) findViewById(R.id.nameEditText);
		phraseField = (EditText) findViewById(R.id.phraseEditText);
		stuffField = (EditText) findViewById(R.id.otherEditText);
		changeButton = (Button) findViewById(R.id.swapButt);
		
		appState = (androidAppState) getApplication();
		
		setHeyListens();
	}

	private void setHeyListens()
	{
		changeButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				appState.setName(nameField.getText().toString());
				appState.setAge(ageField.getText().toString());
				appState.setPhrase(phraseField.getText().toString());
				appState.setOtherThings(stuffField.getText().toString());
				
				Intent myIntent = new Intent(currentView.getContext(), EuropeanActivity.class);
				startActivityForResult(myIntent, 0);
				
			}
		});
		
	}
}
