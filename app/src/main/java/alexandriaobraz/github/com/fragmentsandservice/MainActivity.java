package alexandriaobraz.github.com.fragmentsandservice;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import alexandriaobraz.github.com.fragmentsandservice.Fragments.ColorFragment;
import alexandriaobraz.github.com.fragmentsandservice.Fragments.Login;
import alexandriaobraz.github.com.fragmentsandservice.Fragments.TextViewFragment;

public class MainActivity extends AppCompatActivity {

    private Fragment mFrag;
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFragment(new ColorFragment());
        initView();
    }

    public void initView(){

        mLogin=(Button) findViewById(R.id.login);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Login.class);
                startActivity(new Intent(MainActivity.this, Login.class));

            }
        });

    }

    public void setEditText(){
        showFragment(new TextViewFragment());
    }

    public void showFragment(Fragment fragment){
        mFrag=fragment;
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }

    public void hideFragment(){
        FragmentTransaction transaction=getFragmentManager().beginTransaction();
        transaction.hide(mFrag);
        transaction.commit();
    }
}
