package com.miraz.visitingcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.miraz.visitingcard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.tvName.setText("Md Miraz Hossain");
        binding.tvDesignation.setText("Software Engineer");
        binding.tvPhoneNo.setText("+880 1521432621");
        binding.tvEmail.setText("miraz.anik@gmail.com");
        binding.tvAddress.setText("West Nakhalpara Dhaka-1215");
        binding.tvWebsite.setText("www.mirazanik.com");

        binding.profileImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.propic));
    }
}