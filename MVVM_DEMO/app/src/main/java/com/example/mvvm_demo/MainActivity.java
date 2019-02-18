package com.example.mvvm_demo;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mvvm_demo.Interface.LoginResultCallbacks;
import com.example.mvvm_demo.ViewModel.LoginViewModel;
import com.example.mvvm_demo.ViewModel.LoginViewModelFactory;
import com.example.mvvm_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements LoginResultCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        activityMainBinding.setViewModel(ViewModelProviders.of(this, new LoginViewModelFactory(this))
//        .get(LoginViewModel.class));
    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this, "Login is Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String message) {
        Toast.makeText(this, "Login is Error", Toast.LENGTH_SHORT).show();
    }
}
