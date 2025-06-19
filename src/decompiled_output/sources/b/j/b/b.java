package b.j.b;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f1295a;

    interface a {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    b(a aVar) {
        this.f1295a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1295a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorD = this.f1295a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorD != null) {
            filterResults.count = cursorD.getCount();
        } else {
            filterResults.count = 0;
            cursorD = null;
        }
        filterResults.values = cursorD;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorC = this.f1295a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorC) {
            return;
        }
        this.f1295a.b((Cursor) obj);
    }
}
