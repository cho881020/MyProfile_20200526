package kr.co.tjoeun.myprofile_20200526;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import kr.co.tjoeun.myprofile_20200526.databinding.ActivityPhotoViewBinding;

public class PhotoViewActivity extends BaseActivity {

    ActivityPhotoViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_photo_view);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String url = getIntent().getStringExtra("imgUrl");
        Glide.with(mContext).load(url).into(binding.photoView);

    }
}
