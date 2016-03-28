package com.example.simplecalculator;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
 
public class MainActivity extends Activity {
     
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bclr,badd,bsub,bmul,bdiv,beq;
	EditText et;
	double val1,val2;
	Character op = 'q';
	boolean add,sub,div,mul;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	  
	  b1=(Button) findViewById(R.id.Btn1_id);
	  b2=(Button) findViewById(R.id.Btn2_id);
	  b3=(Button) findViewById(R.id.Btn3_id);
	  b4=(Button) findViewById(R.id.Btn4_id);
	  b5=(Button) findViewById(R.id.Btn5_id);
	  b6=(Button) findViewById(R.id.Btn6_id);
	  b7=(Button) findViewById(R.id.Btn7_id);
	  b8=(Button) findViewById(R.id.Btn8_id);
	  b9=(Button) findViewById(R.id.Btn9_id);
	  b0=(Button) findViewById(R.id.Btn0_id);
	  bdot=(Button) findViewById(R.id.Btndot_id);
	  badd=(Button) findViewById(R.id.Btnplus_id);
	  bsub=(Button) findViewById(R.id.Btnminus_id);
	  bmul=(Button) findViewById(R.id.Btnmulti_id);
	  bdiv=(Button) findViewById(R.id.Btndivide_id);
	  beq=(Button) findViewById(R.id.Btnequal_id);
	  bclr=(Button) findViewById(R.id.Btnclear_id);
	  et=(EditText) findViewById(R.id.result_id);
	  
	  
	  Typeface face = Typeface.createFromAsset(getAssets(),"digital-7 (mono).ttf");
	  et.setTypeface(face);
	  
	  b1.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"1");
	   }
	  });
	  b2.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"2");
	   }
	  });
	  b3.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"3");
	   }
	  });
	  b4.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"4");
	   }
	  });
	  b5.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"5");
	   }
	  });
	  b6.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"6");
	   }
	  });
	  b7.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"7");
	   }
	  });
	  b8.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"8");
	   }
	  });
	  b9.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"9");
	   }
	  });
	  b0.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+"0");
	   }
	  });
	  bdot.setOnClickListener(new View.OnClickListener() {
	   @Override
	   public void onClick(View v) {
	    et.setText(et.getText()+".");
	   }
	  });
	  
	 badd.setOnClickListener(new View.OnClickListener() {
	  
	  @Override
	  public void onClick(View v) {
		  if(et.getText().toString().length()==0)
			  et.setText("Enter values");
		  else
		  {
			  try
			  {
				  val1=Double.parseDouble(et.getText()+"");
				  add=true;
				  et.setText(null);
			  }catch(Exception e)
			  {
				  et.setText("Invalid Number");
			  }
			  
			  
		  }
		
	   
	  }
	 });
	bsub.setOnClickListener(new View.OnClickListener() {
	  
	  @Override
	  public void onClick(View v) {
		  if(et.getText().toString().length()==0)
			  et.setText("Enter values");
		  else
		  {
			  try
			  {
				  val1=Double.parseDouble(et.getText()+"");
				  sub=true;
				  et.setText(null);
			  }catch(Exception e)
			  {
				  et.setText("Invalid Number");
			  }			  
		  }
	   
	  }
	 });
	bdiv.setOnClickListener(new View.OnClickListener() {
	 
	 @Override
	 public void onClick(View v) {
		 if(et.getText().toString().length()==0)
			  et.setText("Enter values");
		 else
		 {
			 try
			  {
				  val1=Double.parseDouble(et.getText()+"");
				  div=true;
				  et.setText(null);
			  }catch(Exception e)
			  {
				  et.setText("Invalid Number");
			  }			 
		 }
			 
	  
	 }
	});
	bmul.setOnClickListener(new View.OnClickListener() {
	 
	 @Override
	 public void onClick(View v) {
		 if(et.getText().toString().length()==0)
			 et.setText("Enter values");
		 else
		 {
			 try
			  {
				  val1=Double.parseDouble(et.getText()+"");
				  mul=true;
				  et.setText(null); 
			  }catch(Exception e)
			  {
				  et.setText("Invalid Number");
			  }			 
		 }
	  
	 }
	});

	beq.setOnClickListener(new View.OnClickListener() {
	 
	 @Override
	 public void onClick(View v) {
		 if(et.getText().toString().length()==0)
			 et.setText("Enter values");
		 else
		 {
			 try
			 {
				 val2=Double.parseDouble(et.getText()+"");
			 }catch(Exception e)
			 {
				 et.setText("Invalid Number");
			 }
			  if (add==true) {
			   et.setText(val1+"+"+val2+"="+"\n"+(val1+val2)+"");
			   add=false; 
			  }
			  if (sub==true) {
			   et.setText(val1+"-"+val2+"="+"\n"+(val1-val2)+"");
			   sub=false; 
			  }
			  if (mul==true) {
			   et.setText(val1+"*"+val2+"="+"\n"+(val1*val2)+"");
			   mul=false; 
			  }
			  if (div==true) {
				  if(val2==0)
				  {  et.setText("DIVIDE BY 0 ERROR");
				  	 div=false;
				  }
				  else
				  {  et.setText(val1+"/"+val2+"="+"\n"+(val1/val2)+"");
				     div=false; 
				  }
		 }
	  
	  }
	 }
	 
	});
	bclr.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
		
			val1 = 0;
			val2 = 0;
			et.setText("");			
		}
	});
	 
	 
	 }
	 
	}
     
