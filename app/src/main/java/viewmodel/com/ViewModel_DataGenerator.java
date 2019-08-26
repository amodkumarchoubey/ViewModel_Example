package viewmodel.com;

import android.arch.lifecycle.ViewModel;

import java.util.Random;

public class ViewModel_DataGenerator extends ViewModel {
    private String ran_no;


    public String getRan_Number() {
        if (ran_no == null) {
            create_ran_no();
        }
        return ran_no;
    }

    private void create_ran_no() {
        Random random = new Random();
        ran_no = "Random No:--> " + String.valueOf((random.nextInt(1000 - 1) + 1));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }


}
