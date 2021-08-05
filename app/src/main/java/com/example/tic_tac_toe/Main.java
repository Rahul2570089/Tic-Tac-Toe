package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    public ImageView[] imageView = new ImageView[9];
    public int[] n = new int[9];
    TextView textView2;
    Button button;
    public int num=0;


    public void def(){
        for(int j=0;j<9;j++){
            imageView[j].setImageResource(R.drawable.filename);
        }
    }

    public void def1(){
        for(int j=0;j<9;j++){
            imageView[j].setEnabled(true);
        }
    }

    public void init(){
        for(int i=0;i<9;i++){
            n[i]=0;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        textView2 = findViewById(R.id.textView2);
        imageView[0] = findViewById(R.id.imageView);
        imageView[1] = findViewById(R.id.imageView2);
        imageView[2] = findViewById(R.id.imageView3);
        imageView[3] = findViewById(R.id.imageView4);
        imageView[4] = findViewById(R.id.imageView5);
        imageView[5] = findViewById(R.id.imageView6);
        imageView[6] = findViewById(R.id.imageView7);
        imageView[7] = findViewById(R.id.imageView8);
        imageView[8] = findViewById(R.id.imageView9);
        button = findViewById(R.id.button);

        init();

        imageView[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[0].setImageResource(R.drawable.circle);
                    num++;
                    n[0]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[0].setImageResource(R.drawable.cross);
                    num--;
                    n[0]=n[0]+2;
                }
               if((n[0]==n[4] && n[0]==n[7]) || (n[0]==n[1] && n[0]==n[2]))
               {
                   new Handler().postDelayed(new Runnable() {
                       @Override
                       public void run() {
                           Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                           def();
                           textView2.setText("Circle's turn");
                           init();
                           num = 0;
                           def1();
                       }
                   },500);

                }
               imageView[0].setEnabled(false);

            }
        });

        imageView[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[1].setImageResource(R.drawable.circle);
                    num++;
                    n[1]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[1].setImageResource(R.drawable.cross);
                    num--;
                    n[1]=n[1]+2;
                }
                if((n[1]==n[3] && n[1]==n[6]) || (n[1]==n[0] && n[1]==n[2]) || (n[1]==n[4] && n[1]==n[8]) || (n[1]==n[7] && n[1]==n[5]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[1].setEnabled(false);
            }
        });

        imageView[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[2].setImageResource(R.drawable.circle);
                    num++;
                    n[2]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[2].setImageResource(R.drawable.cross);
                    num--;
                    n[2]=n[2]+2;
                }
               if((n[2]==n[5] && n[2]==n[8]) || (n[2]==n[1] && n[2]==n[0]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[2].setEnabled(false);
            }
        });

        imageView[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[3].setImageResource(R.drawable.circle);
                    num++;
                    n[3]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[3].setImageResource(R.drawable.cross);
                    num--;
                    n[3]=n[3]+2;
                }
                if((n[3]==n[4] && n[3]==n[5]) || (n[3]==n[1] && n[3]==n[6]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[3].setEnabled(false);

            }
        });

        imageView[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[4].setImageResource(R.drawable.circle);
                    num++;
                    n[4]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[4].setImageResource(R.drawable.cross);
                    num--;
                    n[4]+=2;
                }
                if((n[4]==n[0] && n[4]==n[7]) || (n[4]==n[3] && n[4]==n[5]) || (n[4]==n[1] && n[4]==n[8]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[4].setEnabled(false);

            }
        });

        imageView[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num == 0) {
                    textView2.setText("Cross's turn");
                    imageView[5].setImageResource(R.drawable.circle);
                    num++;
                    n[5]++;
                } else if (num == 1) {
                    textView2.setText("Circle's turn");
                    imageView[5].setImageResource(R.drawable.cross);
                    num--;
                    n[5]+=2;
                }
                if((n[5]==n[3] && n[5]==n[4]) || (n[5]==n[2] && n[5]==n[8]) || (n[5]==n[1] && n[5]==n[7]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[5].setEnabled(false);
            }
        });

        imageView[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[6].setImageResource(R.drawable.circle);
                    num++;
                    n[6]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[6].setImageResource(R.drawable.cross);
                    num--;
                    n[6]+=2;
                }
                if((n[6]==n[7] && n[6]==n[8]) || (n[6]==n[1] && n[6]==n[3]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[6].setEnabled(false);
            }
        });

        imageView[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[7].setImageResource(R.drawable.circle);
                    num++;
                    n[7]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[7].setImageResource(R.drawable.cross);
                    num--;
                    n[7]+=2;
                }
                if((n[7]==n[6] && n[7]==n[8]) || (n[7]==n[0] && n[7]==n[4]) || (n[7]==n[1] && n[7]==n[5]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[7].setEnabled(false);
            }
        });

        imageView[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num==0) {
                    textView2.setText("Cross's turn");
                    imageView[8].setImageResource(R.drawable.circle);
                    num++;
                    n[8]++;
                }
                else if(num==1) {
                    textView2.setText("Circle's turn");
                    imageView[8].setImageResource(R.drawable.cross);
                    num--;
                    n[8]+=2;
                }
                if((n[8]==n[6] && n[8]==n[7]) || (n[8]==n[2] && n[8]==n[5]) || (n[8]==n[1] && n[8]==n[4]))
                {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Main.this, "GAME OVER!", Toast.LENGTH_SHORT).show();
                            def();
                            textView2.setText("Circle's turn");
                            init();
                            num = 0;
                            def1();
                        }
                    },500);
                }
                imageView[8].setEnabled(false);
            }
        });
         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                def();
                textView2.setText("Circle's turn");
                init();
                num = 0;
                def1();
           }
        });
    }
}