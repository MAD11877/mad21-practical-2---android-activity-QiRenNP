package sg.edu.np.mad.madexcercise2;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.fButton);
        User usr = initUser();
        setText(usr,btn);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usr.followed == false){
                    usr.followed = true;
                }
                else{
                    usr.followed = false;
                }
                setText(usr,btn);
            }
        });
    }

    //method to initialise user
    public User initUser(){
        User usr = new User("username","desc",1,false);
        return usr;
    }

    //method to set the text based on the condition
    public void setText(User usr,Button btn){
        TextView txt = btn;
        if(usr.followed == false){
            txt.setText("Follow");
        }
        else{
            txt.setText("Unfollow");
        }
    }
}


