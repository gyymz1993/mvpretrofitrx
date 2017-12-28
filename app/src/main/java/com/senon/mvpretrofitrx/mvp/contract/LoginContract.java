package com.senon.mvpretrofitrx.mvp.contract;

import com.senon.mvpretrofitrx.mvp.base.BasePresenter;
import com.senon.mvpretrofitrx.mvp.base.BaseResponse;
import com.senon.mvpretrofitrx.mvp.base.BaseView;
import com.senon.mvpretrofitrx.mvp.entity.Login;
import java.util.HashMap;
import java.util.List;

/**
 * 作者：senon on 2017/12/27 10:30
 * 邮箱：a1083911695@163.com
 * LoginContract  V 、P契约类
 */
public interface LoginContract {

    interface View extends BaseView {

        void result(BaseResponse<List<Login>> data);

        void setMsg(String msg);
    }

    abstract class Presenter extends BasePresenter<View> {

        public abstract void login(HashMap<String,String> map,boolean isDialog,boolean cancelable);

    }
}