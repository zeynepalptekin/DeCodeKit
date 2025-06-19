package b.j.b;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.p0;
import b.j.b.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    @Deprecated
    public static final int m = 1;
    public static final int n = 2;

    @p0({p0.a.LIBRARY_GROUP})
    protected boolean d;

    @p0({p0.a.LIBRARY_GROUP})
    protected boolean e;

    @p0({p0.a.LIBRARY_GROUP})
    protected Cursor f;

    @p0({p0.a.LIBRARY_GROUP})
    protected Context g;

    @p0({p0.a.LIBRARY_GROUP})
    protected int h;

    @p0({p0.a.LIBRARY_GROUP})
    protected C0077a i;

    @p0({p0.a.LIBRARY_GROUP})
    protected DataSetObserver j;

    @p0({p0.a.LIBRARY_GROUP})
    protected b.j.b.b k;

    @p0({p0.a.LIBRARY_GROUP})
    protected FilterQueryProvider l;

    /* renamed from: b.j.b.a$a, reason: collision with other inner class name */
    private class C0077a extends ContentObserver {
        C0077a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.k();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.d = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.d = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        g(context, cursor, 1);
    }

    public a(Context context, Cursor cursor, int r3) {
        g(context, cursor, r3);
    }

    public a(Context context, Cursor cursor, boolean z) {
        g(context, cursor, z ? 1 : 2);
    }

    public CharSequence a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public void b(Cursor cursor) {
        Cursor cursorM = m(cursor);
        if (cursorM != null) {
            cursorM.close();
        }
    }

    @Override // b.j.b.b.a
    public Cursor c() {
        return this.f;
    }

    public Cursor d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.l;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public FilterQueryProvider f() {
        return this.l;
    }

    void g(Context context, Cursor cursor, int r6) {
        b bVar;
        if ((r6 & 1) == 1) {
            r6 |= 2;
            this.e = true;
        } else {
            this.e = false;
        }
        boolean z = cursor != null;
        this.f = cursor;
        this.d = z;
        this.g = context;
        this.h = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((r6 & 2) == 2) {
            this.i = new C0077a();
            bVar = new b();
        } else {
            bVar = null;
            this.i = null;
        }
        this.j = bVar;
        if (z) {
            C0077a c0077a = this.i;
            if (c0077a != null) {
                cursor.registerContentObserver(c0077a);
            }
            DataSetObserver dataSetObserver = this.j;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.d || (cursor = this.f) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r2, View view, ViewGroup viewGroup) {
        if (!this.d) {
            return null;
        }
        this.f.moveToPosition(r2);
        if (view == null) {
            view = i(this.g, this.f, viewGroup);
        }
        e(view, this.g, this.f);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.k == null) {
            this.k = new b.j.b.b(this);
        }
        return this.k;
    }

    @Override // android.widget.Adapter
    public Object getItem(int r2) {
        Cursor cursor;
        if (!this.d || (cursor = this.f) == null) {
            return null;
        }
        cursor.moveToPosition(r2);
        return this.f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
        Cursor cursor;
        if (this.d && (cursor = this.f) != null && cursor.moveToPosition(r4)) {
            return this.f.getLong(this.h);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int r2, View view, ViewGroup viewGroup) {
        if (!this.d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f.moveToPosition(r2)) {
            if (view == null) {
                view = j(this.g, this.f, viewGroup);
            }
            e(view, this.g, this.f);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + r2);
    }

    @Deprecated
    protected void h(Context context, Cursor cursor, boolean z) {
        g(context, cursor, z ? 1 : 2);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return j(context, cursor, viewGroup);
    }

    public abstract View j(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void k() {
        Cursor cursor;
        if (!this.e || (cursor = this.f) == null || cursor.isClosed()) {
            return;
        }
        this.d = this.f.requery();
    }

    public void l(FilterQueryProvider filterQueryProvider) {
        this.l = filterQueryProvider;
    }

    public Cursor m(Cursor cursor) {
        Cursor cursor2 = this.f;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0077a c0077a = this.i;
            if (c0077a != null) {
                cursor2.unregisterContentObserver(c0077a);
            }
            DataSetObserver dataSetObserver = this.j;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f = cursor;
        if (cursor != null) {
            C0077a c0077a2 = this.i;
            if (c0077a2 != null) {
                cursor.registerContentObserver(c0077a2);
            }
            DataSetObserver dataSetObserver2 = this.j;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.h = cursor.getColumnIndexOrThrow("_id");
            this.d = true;
            notifyDataSetChanged();
        } else {
            this.h = -1;
            this.d = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
