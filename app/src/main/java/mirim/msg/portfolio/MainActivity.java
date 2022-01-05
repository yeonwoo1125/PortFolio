package mirim.msg.portfolio;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper v_fllipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // spalsh 실행 코드
        Intent intent = new Intent(this, Splash.class);
        startActivity(intent);

        int images[] = {
                R.drawable.profile_1,
                R.drawable.profile_2,
                R.drawable.profile_3,
                R.drawable.profile_4,
                R.drawable.profile_5,
                R.drawable.profile_6,
                R.drawable.profile_7,
        };
//        String Names[] = {
//                "가연우",
//                "조나현",
//                "이선우",
//                "이주완",
//                "인소리",
//                "김태연",
//                "이하나"
//        };
        v_fllipper = findViewById(R.id.image_slide);

        for(int image:images) {
            fllipperImages(image);
        }
        v_fllipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (v_fllipper.getDisplayedChild()){
                    case 0:
                        intent = new Intent(getApplicationContext(), yeonwooProfile.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), nahyunProfile.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), sunwooProfile.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), juwanProfile.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), soriProfile.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), taeyeonProfile.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), hanaProfile.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    public void fllipperImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_fllipper.addView(imageView);      // 이미지 추가
        v_fllipper.setFlipInterval(4000);       // 자동 이미지 슬라이드 딜레이시간(1000 당 1초)
        v_fllipper.setAutoStart(true);          // 자동 시작 유무 설정

        // animation
        v_fllipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_fllipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}