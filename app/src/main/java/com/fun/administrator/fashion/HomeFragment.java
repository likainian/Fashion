package com.fun.administrator.fashion;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.fun.administrator.fashion.bean.HomeBean;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private Context context;
    private RecyclerView mRecycleHome;
    private ArrayList<HomeBean.FocusBean> focusList = new ArrayList<>();
    private ArrayList<HomeBean.BlocksBean> blocksList = new ArrayList<>();
    private MyAdapter myAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecycleHome = (RecyclerView) view.findViewById(R.id.recycle_home);
        initData();
        initAdapter();
    }

    private void initData() {
        OkHttpUtils.newInstance().get(getActivity(), HomeBean.class,
                "http://po.funshion.com/v7/config/homepage",
                new OkHttpUtils.TextCallBack<HomeBean>() {

                    @Override
                    public void getText(HomeBean homeBean) {
                        focusList.addAll(homeBean.getFocus());
                        blocksList.addAll(homeBean.getBlocks());
                        myAdapter.notifyDataSetChanged();
                    }
                });

    }

    private void initAdapter() {
        mRecycleHome.setLayoutManager(new LinearLayoutManager(context));
        myAdapter = new MyAdapter();
        mRecycleHome.setAdapter(myAdapter);

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyHolder(LayoutInflater.from(context).inflate(R.layout.item_recycle, null));
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {
            holder.gridTitle.setText(blocksList.get(position).getName());
            MyGridAdapter GridAdapter = new MyGridAdapter(position);
            holder.gridHome.setAdapter(GridAdapter);
        }

        @Override
        public int getItemCount() {
            return blocksList.size();
        }

        class MyHolder extends RecyclerView.ViewHolder {
            public View rootView;
            public TextView gridTitle;
            public GridView gridHome;

            public MyHolder(View itemView) {
                super(itemView);
                this.rootView = itemView;
                this.gridTitle = (TextView) rootView.findViewById(R.id.grid_title);
                this.gridHome = (GridView) rootView.findViewById(R.id.grid_home);
            }
        }

    }

    class MyGridAdapter extends BaseAdapter {
        private int mposition;
        public MyGridAdapter(int position) {
            this.mposition = position;
        }
        @Override
        public int getCount() {
            return blocksList.get(mposition).getContents().size();
        }

        @Override
        public Object getItem(int position) {
            return blocksList.get(mposition).getContents().get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            GridHolder gridHolder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_grid, null);
                gridHolder = new GridHolder(convertView);
                convertView.setTag(gridHolder);
            } else{
                gridHolder = (GridHolder) convertView.getTag();
            }
            gridHolder.tvGridFirst.setText(blocksList.get(mposition).getContents().get(position).getName());
            gridHolder.tvGridSecond.setText(blocksList.get(mposition).getContents().get(position).getAword());
//            Glide.with(context).load("").into(gridHolder.ivGrid);
            return convertView;
        }

        public class GridHolder {
            public View rootView;
            public ImageView ivGrid;
            public TextView tvGridFirst;
            public TextView tvGridSecond;

            public GridHolder(View rootView) {
                this.rootView = rootView;
                this.ivGrid = (ImageView) rootView.findViewById(R.id.iv_grid);
                this.tvGridFirst = (TextView) rootView.findViewById(R.id.tv_grid_first);
                this.tvGridSecond = (TextView) rootView.findViewById(R.id.tv_grid_second);
            }

        }
    }

}
