package win.tommy.tusha.base;

import android.content.Context;

/**
 * Created by tommy on 2017/9/21 0021.
 */

public abstract class BasePresenter<T,E> {
    public Context mContext;
    public E mModel;
    public T mView;

    public void setVM(T v, E m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }
    public void onStart(){
    };
    public void onDestroy() {

    }
}
