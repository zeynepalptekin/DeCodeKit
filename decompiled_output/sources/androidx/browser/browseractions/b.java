package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import b.d.a;
import b.i.c.j.g;
import java.util.List;

/* loaded from: classes.dex */
class b extends BaseAdapter {
    private final List<androidx.browser.browseractions.a> d;
    private final Context e;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        ImageView f222a;

        /* renamed from: b, reason: collision with root package name */
        TextView f223b;

        a() {
        }
    }

    b(List<androidx.browser.browseractions.a> list, Context context) {
        this.d = list;
        this.e = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int r2) {
        return this.d.get(r2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public View getView(int r4, View view, ViewGroup viewGroup) throws Resources.NotFoundException {
        a aVar;
        androidx.browser.browseractions.a aVar2 = this.d.get(r4);
        if (view == null) {
            view = LayoutInflater.from(this.e).inflate(a.g.browser_actions_context_menu_row, (ViewGroup) null);
            aVar = new a();
            aVar.f222a = (ImageView) view.findViewById(a.e.browser_actions_menu_item_icon);
            aVar.f223b = (TextView) view.findViewById(a.e.browser_actions_menu_item_text);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f223b.setText(aVar2.c());
        if (aVar2.b() != 0) {
            aVar.f222a.setImageDrawable(g.c(this.e.getResources(), aVar2.b(), null));
        } else {
            aVar.f222a.setImageDrawable(null);
        }
        return view;
    }
}
