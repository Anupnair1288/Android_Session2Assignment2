package com.acadgild.anup.vibgyor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button but1, but2, but3, but4, but5, but6, but7;

    public void press(){
                but1=(Button)findViewById(R.id.but1);
                but2=(Button)findViewById(R.id.but2);
                but3=(Button)findViewById(R.id.but3);
                but4=(Button)findViewById(R.id.but4);
                but5=(Button)findViewById(R.id.but5);
                but6=(Button)findViewById(R.id.but6);
                but7=(Button)findViewById(R.id.but7);

                but1.setOnClickListener(new View.OnClickListener()
                                            {
                                            @Override
                                            public void onClick(View view)
                                            {
                                                Intent clickred = new Intent(MainActivity.this, clickred.class);
                                                startActivity(clickred);
                                            }
                                            }
                                        );

                but2.setOnClickListener(new View.OnClickListener()
                                        {
                                        @Override
                                        public void onClick(View view)
                                            {
                                            Intent clickorange = new Intent(MainActivity.this, clickorange.class);
                                            startActivity(clickorange);
                                            }
                                        }
                                        );
                but3.setOnClickListener(new View.OnClickListener()
                                        {
                                        @Override
                                        public void onClick(View view)
                                            {
                                            Intent clickyellow = new Intent(MainActivity.this, clickyellow.class);
                                            startActivity(clickyellow);
                                            }
                                        }
                                        );
                but4.setOnClickListener(new View.OnClickListener()
                                        {
                                        @Override
                                        public void onClick(View view)
                                            {
                                            Intent clickgreen = new Intent(MainActivity.this, clickgreen.class);
                                            startActivity(clickgreen);
                                            }
                                        }
                                        );
                but5.setOnClickListener(new View.OnClickListener()
                                        {
                                        @Override
                                        public void onClick(View view)
                                            {
                                            Intent clickblue = new Intent(MainActivity.this, clickblue.class);
                                            startActivity(clickblue);
                                            }
                                        }
                                        );
                but6.setOnClickListener(new View.OnClickListener()
                                        {
                                        @Override
                                        public void onClick(View view)
                                            {
                                            Intent clickindigo = new Intent(MainActivity.this, clickindigo.class);
                                            startActivity(clickindigo);
                                            }
                                        }
                                        );
                but7.setOnClickListener(new View.OnClickListener()
                                        {
                                        @Override
                                        public void onClick(View view)
                                            {
                                            Intent clickviolet = new Intent(MainActivity.this, clickviolet.class);
                                            startActivity(clickviolet);
                                            }
                                        }
                                        );


                }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        press();
    }
}
