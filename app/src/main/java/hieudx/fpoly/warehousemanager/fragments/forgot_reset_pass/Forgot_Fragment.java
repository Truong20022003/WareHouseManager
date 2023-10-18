package hieudx.fpoly.warehousemanager.fragments.forgot_reset_pass;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hieudx.fpoly.warehousemanager.R;
import hieudx.fpoly.warehousemanager.databinding.FragmentForgotBinding;

public class Forgot_Fragment extends Fragment {
    private FragmentForgotBinding binding;
    private FragmentManager fragmentManager;
    float v = 0;

    public Forgot_Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentForgotBinding.inflate(inflater, container, false);

        fragmentManager = requireActivity().getSupportFragmentManager();

        onAnimation();

        binding.imgBack.setOnClickListener(view -> {
//            fragmentManager.popBackStack();
            getActivity().onBackPressed();
        });

        binding.btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.frag_container, new Reset_Fragment()).addToBackStack(null).commit();
            }
        });
        return binding.getRoot();
    }

    private void onAnimation() {
        binding.imgBack.setTranslationY(100);
        binding.tv1.setTranslationY(100);
        binding.tv2.setTranslationY(100);

        binding.edEmail.setTranslationX(800);
        binding.edEmail.setTranslationX(800);
        binding.btnVerify.setTranslationX(800);

        binding.imgBack.setAlpha(v);
        binding.tv2.setAlpha(v);
        binding.tv1.setAlpha(v);
        binding.edPhoneNumber.setAlpha(v);
        binding.edEmail.setAlpha(v);
        binding.btnVerify.setAlpha(v);

        binding.imgBack.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(400).start();
        binding.tv1.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(400).start();
        binding.tv2.animate().translationY(0).alpha(1).setDuration(2000).setStartDelay(400).start();

        binding.edEmail.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        binding.edPhoneNumber.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        binding.btnVerify.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();
    }
}