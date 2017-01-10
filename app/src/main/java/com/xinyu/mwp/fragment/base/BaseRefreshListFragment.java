package com.xinyu.mwp.fragment.base;

import android.view.View;

import com.xinyu.mwp.activity.base.RefreshListController;
import com.xinyu.mwp.adapter.IListAdapter;
import com.xinyu.mwp.listener.OnRefreshPageListener;

/**
 * 下拉与加载更多列表Fragment
 * Created by yaowang on 16/3/31.
 */
public abstract  class BaseRefreshListFragment<TView extends View,TModel > extends BaseRefreshFragment {


    @Override
    public RefreshListController<TView,TModel> getRefreshController() {
        return (RefreshListController<TView,TModel>)super.getRefreshController();
    }

    /**
     * 设置分页刷新监听 自动启用分页模式
     * @param onRefreshPageListener
     */
    public void setOnRefreshPageListener(OnRefreshPageListener onRefreshPageListener) {
        getRefreshController().setOnRefreshPageListener(onRefreshPageListener);
    }

    protected abstract IListAdapter<TModel> createAdapter();
}
