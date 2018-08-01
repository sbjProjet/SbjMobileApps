package com.project.rezasaputra.sbjmobileapps;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by Muhammad on 7/31/2018.
 */

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context = context;

    }


    //array image
    public int[] slide_image = {

            R.drawable.code_icon,
            R.drawable.eat_icon,
            R.drawable.sleep_icon

    };


    //array heading
    public String[] slide_head = {

            "CODING",
            "EAT",
            "SLEEP"

    };


    //array desc
    public String[] slide_desc = {

            "The loren ipdusm dymm text is the most lore in isum dmm exty is the most loreis ipsume text is t6he most the loren is the lore ipsum ts",
            "The loren ipdusm dymm text is the most lore in isum dmm exty is the most loreis ipsume text is t6he most the loren is the lore ipsum ts",
            "The loren ipdusm dymm text is the most lore in isum dmm exty is the most loreis ipsume text is t6he most the loren is the lore ipsum ts"

    };

    @Override
    public int getCount() {
        return slide_head.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }
}
