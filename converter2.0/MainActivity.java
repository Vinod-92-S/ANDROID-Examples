package com.vinod.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Spinner s1;
	Button convert,reset;
	EditText et1,et2;
	TextView t1,t2;
	String units[]={"Select an option to convert","Distance","Temperature","Weight","Speed","Volume","Pressure","USD-INR","GBP-INR","EURO-INR","INR-RMB"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        s1=(Spinner) findViewById(R.id.spinner1);
        convert=(Button) findViewById(R.id.btnconvert_id);
        reset=(Button) findViewById(R.id.btnreset_id);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        
        t1=(TextView) findViewById(R.id.tv1);
        t2=(TextView) findViewById(R.id.tv2);
        
        ArrayAdapter<String> a=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, units);
        s1.setAdapter(a);
        
        convert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(s1.isPressed()==false)
					Toast.makeText(MainActivity.this,"Select an option to convert",Toast.LENGTH_SHORT).show();

			}
		});
        
        s1.setOnItemSelectedListener(new OnItemSelectedListener() 
	   {
			
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) 
			{
				
				if(pos==1)
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
				else if(pos==2)
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
        		else if(pos==3)
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
        		else if(pos==4)
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
        		else if(pos==5)
        		{
        			et1.setHint("l");
        			et2.setHint("gal");
        			t1.setText("Litres");
        			t2.setText("Gallons");
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
        							lToGal(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							galToL(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void lToGal(double l) {
								double gal=l*0.264172;
								et2.setText(gal+"");							
							}

							private void galToL(double gal) {
								double l=gal*3.78541;
								et1.setText(l+"");						
							}
        				});
        		     }
        		else if(pos==6)
        		{
        			et1.setHint("atm");
        			et2.setHint("psi");
        			t1.setText("Atmosphere");
        			t2.setText("Pounds/square inch");
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
        							atmToPsi(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							psiToAtm(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void atmToPsi(double atm) {
								double psi=atm*14.6959;
								et2.setText(psi+"");							
							}

							private void psiToAtm(double psi) {
								double atm=psi*0.068046;
								et1.setText(atm+"");						
							}
        				});
        		     }
        		else if(pos==7)
        		{
        			et1.setHint("USD");
        			et2.setHint("INR");
        			t1.setText("USD");
        			t2.setText("INR");
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
        							usdToInr(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							inrToUsd(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void usdToInr(double usd) {
								double inr=usd*66.59;
								et2.setText(inr+"");							
							}

							private void inrToUsd(double inr) {
								double usd=inr*0.02;
								et1.setText(usd+"");						
							}
        				});
        		     }
        		else if(pos==8)
        		{
        			et1.setHint("GBP");
        			et2.setHint("INR");
        			t1.setText("Great Britan Pounds");
        			t2.setText("INR");
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
        							gbpToInr(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							inrToGbp(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void gbpToInr(double gbp) {
								double inr=gbp*94.91;
								et2.setText(inr+"");							
							}

							private void inrToGbp(double inr) {
								double gbp=inr*0.011;
								et1.setText(gbp+"");						
							}
        				});
        		     }
        		else if(pos==9)
        		{
        			et1.setHint("Euro");
        			et2.setHint("INR");
        			t1.setText("Euros");
        			t2.setText("INR");
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
        							euroToInr(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							inrToEuro(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void euroToInr(double euro) {
								double inr=euro*74.61;
								et2.setText(inr+"");							
							}

							private void inrToEuro(double inr) {
								double euro=inr*0.013;
								et1.setText(euro+"");						
							}
        				});
        		     }
        		else if(pos==10)
        		{
        			et1.setHint("INR");
        			et2.setHint("RMB");
        			t1.setText("INR");
        			t2.setText("Chinese Yuan");
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
        							inrToRmb(Double.parseDouble(et1.getText().toString()));
        						}
        						else if(et1.getText().toString().length()==0 && et2.getText().toString().length()>0)
        						{
        							rmbToInr(Double.parseDouble(et2.getText().toString()));
        						}
        						
        				}

							private void inrToRmb(double inr) {
								double rmb=inr*0.097;
								et2.setText(rmb+"");							
							}

							private void rmbToInr(double rmb) {
								double inr=rmb*10.27;
								et1.setText(inr+"");						
							}
        				});
        		     }
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				Toast.makeText(MainActivity.this,"Select an option to convert",Toast.LENGTH_SHORT).show();

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
        
       

	
	

	


        
        
        
