package com.vinod.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	RadioGroup rg;
	Button convert,reset;
	EditText et1,et2;
	TextView t1,t2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rg=(RadioGroup) findViewById(R.id.radioGroup1);
        convert=(Button) findViewById(R.id.btnconvert_id);
        reset=(Button) findViewById(R.id.btnreset_id);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        //t1=(EditText) findViewById(R.id.text1);
        //t2=(EditText) findViewById(R.id.text2);
        t1=(TextView) findViewById(R.id.tv1);
        t2=(TextView) findViewById(R.id.tv2);
        
        convert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(rg.isPressed()==false)
					Toast.makeText(MainActivity.this,"Select an option to converrt",Toast.LENGTH_SHORT).show();

			}
		});
        
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			
        	@Override
        	public void onCheckedChanged(RadioGroup rg, int id) 
        	{
        		
        		if(id==R.id.radio0)
        		{
        		et2.setHint("km");
        			t1.setText("Miles");
        			t2.setText("Kilometers");
        				et1.setHint("mi");
        			convert.setOnClickListener(new View.OnClickListener() {
        				
        				@Override
        				public void onClick(View v) 
        				{
        					
        						if(et1.getText().toString().length()==0 && et2.getText().toString().length()==0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()>0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()==0 )
        						{
        							miToKm(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							kmToMi(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

						private void kmToMi(double mi) {
							double km=mi*0.62137119;
							et1.setText(km+"");							
						}

						private void miToKm(double km) {
							double mi=km/0.62137119;
							et2.setText(mi+"");							
						}
        			});
        		}
        		else if(id==R.id.radio1)
        		{
        			et1.setHint("'F");
        			et2.setHint("'C");
        			t1.setText("Fahrenheit");
        			t2.setText("Celsius");
        			convert.setOnClickListener(new View.OnClickListener() {
        				
        				@Override
        				public void onClick(View v) 
        				{
        					
        						if(et1.getText().toString().length()==0 && et2.getText().toString().length()==0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()>0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()==0 )
        						{
        							fToC(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							cToF(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void cToF(double c) {
								double f=c*(9.0/5.0)+32.0;
								et1.setText(f+"");							
							}

							private void fToC(double f) {
								double c=(f-32.0)*(5.0/9.0);
								et2.setText(c+"");						
							}
        				});
        		     }
        		else if(id==R.id.radio2)
        		{
        			et2.setHint("lbs");
        			t1.setText("Killograms");
        			t2.setText("Pounds");
        			et1.setHint("kgs");
        			convert.setOnClickListener(new View.OnClickListener() {
        				
        				@Override
        				public void onClick(View v) 
        				{
        					
        						if(et1.getText().toString().length()==0 && et2.getText().toString().length()==0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()>0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()==0 )
        						{
        							kgsToLbs(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							lbsToKgs(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

        				private void kgsToLbs(double kgs) {
        					double lbs=kgs*2.2046;
        					et2.setText(lbs+"");							
        				}

        				private void lbsToKgs(double lbs) {
        					double kgs=lbs*0.453592;
        					et1.setText(kgs+"");							
        				}
        			});
        		}
        		else if(id==R.id.radio3)
        		{
        			et1.setHint("km/hr");
        			et2.setHint("m/s");
        			t1.setText("kmph");
        			t2.setText("mps");
        			convert.setOnClickListener(new View.OnClickListener() {
        				
        				@Override
        				public void onClick(View v) 
        				{
        					
        						if(et1.getText().toString().length()==0 && et2.getText().toString().length()==0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()>0)
        							Toast.makeText(MainActivity.this,"Enter any one value",Toast.LENGTH_SHORT).show();
        						else if(et1.getText().toString().length()>0 && et2.getText().toString().length()==0 )
        						{
        							kmphToMps(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							mpsToKmph(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void kmphToMps(double kmph) {
								double mps=kmph*(5.0/18.0);
								et2.setText(mps+"");							
							}

							private void mpsToKmph(double mps) {
								double kmph=mps*(18.0/5.0);
								et1.setText(kmph+"");						
							}
        				});
        		     }

        	      }
             });
        
        
        
    
    
        
        reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				et1.setText("");
				et2.setText("");
			}
		});
    }
   
}
        
       

	
	

	


        
        
        
