package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by kaili on 2018-01-13.
 */

public class BodyPartFragment extends Fragment {
	public BodyPartFragment() {

	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		// Inflate the Android-me fragment layout
		View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

		// get reference to the ImageView in the fragment layout
		ImageView imageView = (ImageView)rootView.findViewById(R.id.body_part_image_view);

		//set imageview
		imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
		return rootView;
	}
}
