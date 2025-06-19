package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ea2 extends u72<String> implements ha2, RandomAccess {
    private static final ea2 f;
    private static final ha2 g;
    private final List<Object> e;

    static {
        ea2 ea2Var = new ea2();
        f = ea2Var;
        ea2Var.w();
        g = f;
    }

    public ea2() {
        this(10);
    }

    public ea2(int r2) {
        this((ArrayList<Object>) new ArrayList(r2));
    }

    private ea2(ArrayList<Object> arrayList) {
        this.e = arrayList;
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof a82 ? ((a82) obj).t() : o92.j((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final void M(a82 a82Var) {
        c();
        this.e.add(a82Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final List<?> R() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r2, Object obj) {
        c();
        this.e.add(r2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final boolean addAll(int r2, Collection<? extends String> collection) {
        c();
        if (collection instanceof ha2) {
            collection = ((ha2) collection).R();
        }
        boolean zAddAll = this.e.addAll(r2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r3) {
        Object obj = this.e.get(r3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof a82) {
            a82 a82Var = (a82) obj;
            String strT = a82Var.t();
            if (a82Var.u()) {
                this.e.set(r3, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = o92.j(bArr);
        if (o92.i(bArr)) {
            this.e.set(r3, strJ);
        }
        return strJ;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.x92
    public final /* synthetic */ x92 k(int r2) {
        if (r2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(r2);
        arrayList.addAll(this.e);
        return new ea2((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.ads.u72, com.google.android.gms.internal.ads.x92
    public final /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final ha2 p() {
        return m() ? new sc2(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r2) {
        c();
        Object objRemove = this.e.remove(r2);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.u72, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r2, Object obj) {
        c();
        return h(this.e.set(r2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }

    @Override // com.google.android.gms.internal.ads.ha2
    public final Object z(int r2) {
        return this.e.get(r2);
    }
}
