package uem.dam.seg.pruebalogin;


import android.app.Activity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView mSignUpTextview;
    Button mLoginButton;
    AutoCompleteTextView mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
