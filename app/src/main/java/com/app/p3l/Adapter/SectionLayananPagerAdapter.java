package com.app.p3l.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.app.p3l.R;
import com.app.p3l.ui.CRUDdata.CreateLayananFragment;
import com.app.p3l.ui.CRUDdata.CreateProdukFragment;
import com.app.p3l.ui.CRUDdata.DeleteLayananFragment;
import com.app.p3l.ui.CRUDdata.DeleteProdukFragment;
import com.app.p3l.ui.CRUDdata.EditLayananFragment;
import com.app.p3l.ui.CRUDdata.EditProdukFragment;

public class SectionLayananPagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;


    public SectionLayananPagerAdapter(Context mContext, FragmentManager fm) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch(position){
            case 0:
                fragment = new CreateLayananFragment();
                break;
            case 1:
                fragment = new EditLayananFragment();
                break;
            case 2:
                fragment = new DeleteLayananFragment();
                break;
        }
        return  fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
