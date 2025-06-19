package com.gp7.easycalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class z extends BaseExpandableListAdapter {
    private List<String> d;
    private HashMap<String, List<String>> e;
    private Context f;

    z(Context context, List<String> list, HashMap<String, List<String>> map) {
        this.f = context;
        this.d = list;
        this.e = map;
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getChild(int r3, int r4) {
        return this.e.get(this.d.get(r3)).get(r4);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int r1, int r2) {
        return r2;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int r1, int r2, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getChild(r1, r2);
        if (view == null) {
            view = ((LayoutInflater) this.f.getSystemService("layout_inflater")).inflate(R.layout.child_faq, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.faqChild)).setText(str);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int r3) {
        return this.e.get(this.d.get(r3)).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int r2) {
        return this.d.get(r2);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.d.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int r3) {
        return r3;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int r2, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getGroup(r2);
        if (view == null) {
            view = ((LayoutInflater) this.f.getSystemService("layout_inflater")).inflate(R.layout.parent_faq, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(R.id.faqParent);
        textView.setTypeface(null, 1);
        textView.setText(str);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int r1, int r2) {
        return false;
    }
}
