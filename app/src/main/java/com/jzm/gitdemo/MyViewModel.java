package com.jzm.gitdemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> mNumberLiveData = new MutableLiveData<>();
    private int number;

    public MyViewModel() {
        super();
    }

    public void add() {
        number ++;
        mNumberLiveData.setValue(number);
    }

    public void sub() {
        number --;
        mNumberLiveData.setValue(number);
    }

    public void reset() {
        number = 0;
        mNumberLiveData.setValue(number);
    }

}
