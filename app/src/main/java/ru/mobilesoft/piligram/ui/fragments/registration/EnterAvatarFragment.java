package ru.mobilesoft.piligram.ui.fragments.registration;

import ru.mobilesoft.piligram.R;

/**
 * Created on 8/14/17.
 */

public class EnterAvatarFragment extends BaseWizardFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_reg_avatar;
    }

    @Override
    protected boolean validate() {
        return true;
    }

    @Override
    protected void saveValue() {

    }

    @Override
    protected void loadValue() {

    }
}