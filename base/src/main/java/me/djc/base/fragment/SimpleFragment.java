package me.djc.base.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Des:GruduateDaily - me.djc.base.fragment
 *
 * @author xujichang
 * @date 2019-04-18 - 16:41
 * <p>
 * modify:
 */
public abstract class SimpleFragment extends BaseFragment {


    @Override
    protected void onGetArguments(Bundle arguments) {

    }

    @Override
    public void refresh() {

    }

    protected void showToast(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
