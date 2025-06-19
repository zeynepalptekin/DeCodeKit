package b.j.b;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {
    private int o;
    private int p;
    private LayoutInflater q;

    @Deprecated
    public c(Context context, int r2, Cursor cursor) {
        super(context, cursor);
        this.p = r2;
        this.o = r2;
        this.q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int r2, Cursor cursor, int r4) {
        super(context, cursor, r4);
        this.p = r2;
        this.o = r2;
        this.q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public c(Context context, int r2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.p = r2;
        this.o = r2;
        this.q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // b.j.b.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.q.inflate(this.p, viewGroup, false);
    }

    @Override // b.j.b.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.q.inflate(this.o, viewGroup, false);
    }

    public void n(int r1) {
        this.p = r1;
    }

    public void o(int r1) {
        this.o = r1;
    }
}
