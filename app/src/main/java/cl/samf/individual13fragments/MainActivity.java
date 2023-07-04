package cl.samf.individual13fragments;


import cl.samf.individual13fragments.databinding.ActivityMainBinding;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
        private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }


}