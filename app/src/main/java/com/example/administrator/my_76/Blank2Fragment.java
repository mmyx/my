package com.example.administrator.my_76;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Blank2Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_blank2, null);
        ImageView viewById = (ImageView)inflate.findViewById(R.id.image_f);
        viewById.setImageResource(R.mipmap.ic_launcher_round);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Main3Activity.class);
                startActivity(intent);
            }
        });
        return inflate;
    }
}
