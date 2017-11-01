package alexandriaobraz.github.com.fragmentsandservice.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Fragment;

import alexandriaobraz.github.com.fragmentsandservice.MainActivity;
import alexandriaobraz.github.com.fragmentsandservice.R;


public class ColorFragment extends Fragment{

    private TextView result;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_color, null);
        result=view.findViewById(R.id.result);
        view.findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(R.string.edit1);
                ((MainActivity)getActivity()).setEditText();
            }
        });
        view.findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(R.string.edit2);
                ((MainActivity)getActivity()).setEditText();
            }
        });
        view.findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(R.string.edit3);
                ((MainActivity)getActivity()).setEditText();
            }
        });
        view.findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(R.string.edit4);
                ((MainActivity)getActivity()).setEditText();
            }
        });
        view.findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(R.string.edit5);
                ((MainActivity)getActivity()).setEditText();
            }
        });
        view.findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(R.string.edit6);
                ((MainActivity)getActivity()).setEditText();
            }
        });
        return view;

    }



}
