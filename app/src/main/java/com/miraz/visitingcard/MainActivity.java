package com.miraz.visitingcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.miraz.visitingcard.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnfindRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(v.getContext(), FindRouteActivity.class);
                startActivity(intent1);
            }
        });


        binding.tvName.setText("Md Miraz Hossain");
        binding.tvDesignation.setText("Software Engineer");
        binding.tvPhoneNo.setText("+880 1521432621");
        binding.tvEmail.setText("miraz.anik@gmail.com");
        binding.tvAddress.setText("West Nakhalpara Dhaka-1215");
        binding.tvWebsite.setText("www.mirazanik.com");

        binding.profileImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.propic));
    }

    public void onClickMobileNo(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + Uri.parse(binding.tvPhoneNo.getText().toString())));
        startActivity(intent);
    }

    public void onClickEmail(View v) {
        Log.e("TAG", "onClickEmail: ");
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{binding.tvEmail.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void onClickAddress(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:<23.771038>,<90.395698>?q=<23.771038>,<90.395698>(Md Miraz Hossain)"));
        startActivity(intent);
    }

    public void onClickWebsite(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://" + binding.tvWebsite.getText().toString()));
        startActivity(intent);
    }
}