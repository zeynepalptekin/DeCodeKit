package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class h extends a {
    private final ListView L;

    public h(@h0 ListView listView) {
        super(listView);
        this.L = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int r1) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int r8) {
        ListView listView = this.L;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int r5 = firstVisiblePosition + childCount;
        if (r8 > 0) {
            if (r5 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (r8 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void l(int r1, int r2) {
        i.b(this.L, r2);
    }
}
