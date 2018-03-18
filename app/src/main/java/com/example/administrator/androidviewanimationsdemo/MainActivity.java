package com.example.administrator.androidviewanimationsdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    private LinearLayout coordinatePosition00LinearLayout;
    private LinearLayout coordinatePosition01LinearLayout;
    private LinearLayout coordinatePosition02LinearLayout;
    private LinearLayout coordinatePosition10LinearLayout;
    private LinearLayout coordinatePosition11LinearLayout;
    private LinearLayout coordinatePosition12LinearLayout;
    private LinearLayout coordinatePosition20LinearLayout;
    private LinearLayout coordinatePosition21LinearLayout;
    private LinearLayout coordinatePosition22LinearLayout;
    private int currentRandomNumber;
    private Handler handler;
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                currentRandomNumber = (int) (Math.random() * 9 + 1);
                displayRandomlyAssigned(currentRandomNumber);
                handler.postDelayed(this, 3000);
            }
        };
        handler.postDelayed(runnable, 3000);                                             // 每三秒執行一次runnable

        allHidInTheCave();
        initCoordinatePositionLinearLayoutView();
    }

    private void initCoordinatePositionLinearLayoutView() {

        coordinatePosition00LinearLayout = findViewById(R.id.coordinatePosition00LinearLayout);
        coordinatePosition00LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition00ImageView));
            }
        });

        coordinatePosition01LinearLayout = findViewById(R.id.coordinatePosition01LinearLayout);
        coordinatePosition01LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition01ImageView));
            }
        });

        coordinatePosition02LinearLayout = findViewById(R.id.coordinatePosition02LinearLayout);
        coordinatePosition02LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition02ImageView));
            }
        });

        coordinatePosition10LinearLayout = findViewById(R.id.coordinatePosition10LinearLayout);
        coordinatePosition10LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition10ImageView));
            }
        });

        coordinatePosition11LinearLayout = findViewById(R.id.coordinatePosition11LinearLayout);
        coordinatePosition11LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition11ImageView));
            }
        });

        coordinatePosition12LinearLayout = findViewById(R.id.coordinatePosition12LinearLayout);
        coordinatePosition12LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition12ImageView));
            }
        });

        coordinatePosition20LinearLayout = findViewById(R.id.coordinatePosition20LinearLayout);
        coordinatePosition20LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition20ImageView));
            }
        });

        coordinatePosition21LinearLayout = findViewById(R.id.coordinatePosition21LinearLayout);
        coordinatePosition21LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition21ImageView));
            }
        });

        coordinatePosition22LinearLayout = findViewById(R.id.coordinatePosition22LinearLayout);
        coordinatePosition22LinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "嘶 ~", Toast.LENGTH_SHORT).show();
                YoYo.with(Techniques.RubberBand)
                        .duration(300)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition22ImageView));
            }
        });

        coordinatePosition00LinearLayout.setClickable(false);
        coordinatePosition01LinearLayout.setClickable(false);
        coordinatePosition02LinearLayout.setClickable(false);
        coordinatePosition10LinearLayout.setClickable(false);
        coordinatePosition11LinearLayout.setClickable(false);
        coordinatePosition12LinearLayout.setClickable(false);
        coordinatePosition20LinearLayout.setClickable(false);
        coordinatePosition21LinearLayout.setClickable(false);
        coordinatePosition22LinearLayout.setClickable(false);
    }

    private void displayRandomlyAssigned(int currentRandomNumber) {

        switch (currentRandomNumber) {
            case 1:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition00ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition00LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition00LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition00ImageView));
                    }
                }, 1500);
                break;

            case 2:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition01ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition01LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition01LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition01ImageView));
                    }
                }, 1500);
                break;

            case 3:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition02ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition02LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition02LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition02ImageView));
                    }
                }, 1500);
                break;

            case 4:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition10ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition10LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition10LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition10ImageView));
                    }
                }, 1500);
                break;

            case 5:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition11ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition11LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition11LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition11ImageView));
                    }
                }, 1500);
                break;

            case 6:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition12ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition12LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition12LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition12ImageView));
                    }
                }, 1500);
                break;

            case 7:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition20ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition20LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition20LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition20ImageView));
                    }
                }, 1500);
                break;

            case 8:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition21ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition21LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition21LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition21ImageView));
                    }
                }, 1500);
                break;

            case 9:
                YoYo.with(Techniques.SlideInUp)
                        .duration(200)
                        .repeat(0)
                        .playOn(findViewById(R.id.coordinatePosition22ImageView));
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition22LinearLayout.setClickable(true);
                    }
                }, 200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        coordinatePosition22LinearLayout.setClickable(false);
                    }
                }, 1200);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        YoYo.with(Techniques.SlideOutDown)
                                .duration(200)
                                .repeat(0)
                                .playOn(findViewById(R.id.coordinatePosition22ImageView));
                    }
                }, 1500);
                break;
        }
    }

    private void allHidInTheCave() {
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition00ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition01ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition02ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition10ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition11ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition12ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition20ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition21ImageView));
        YoYo.with(Techniques.SlideOutDown)
                .duration(200)
                .repeat(0)
                .playOn(findViewById(R.id.coordinatePosition22ImageView));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}