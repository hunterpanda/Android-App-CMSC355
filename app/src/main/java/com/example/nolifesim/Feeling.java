package com.example.nolifesim;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Feeling {

    int x, y;
    Bitmap feeling1, feelign2;

    Feeling (int screenX, Resources res) {
        feeling1 = BitmapFactory.decodeResource(res, R.drawable.pixel_heart);
    }
}
