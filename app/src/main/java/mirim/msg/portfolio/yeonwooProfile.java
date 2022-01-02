package mirim.msg.portfolio;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;


public class yeonwooProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_yeonwoo);

        //버튼 누를 시 프로젝트 페이지로 이동
        Button goProjectBtn = (Button)findViewById(R.id.go_project_btn);
        goProjectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),yeonwooProject.class);
                startActivity(intent);
            }
        });

        //툴바 설정
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기
        //getSupportActionBar().setHomeAsUpIndicator(R.drawable.home_btn); //icon 변경

    }

    //액션 버튼 메뉴 액션바에 넣기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_nav_menu, menu);
        return true;
    }

    //액션 버튼 클릭 이벤트
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case android.R.id.home:{
                finish();
            }
            case R.id.nextBtn:{
                Log.d("TAG", "다음버튼");
                startActivity(new Intent(this, nahyunProfile.class));
            }
        }
        return super.onOptionsItemSelected(item);
    }


}
