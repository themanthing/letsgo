package ru.mobilesoft.piligram.ui.fragments.travels;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import ru.mobilesoft.piligram.R;
import ru.mobilesoft.piligram.ui.fragments.BaseWizardFragment;

/**
 * Created on 10.09.17.
 */

public class TravelTypeFragment extends BaseWizardFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_travel_type;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setActionButtonEnabled(true);
    }

    @Override
    protected void saveValue() {

    }

    @Override
    protected void loadValue() {

    }
}
