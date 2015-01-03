package com.hbt;

public interface UnionInterface {

    public int[] merge(int[] rightArray, int[] leftArray);

    public int[] inner(int[] rightArray, int[] leftArray);

    public int[] leftUnion(int[] rightArray, int[] leftArray);

    public int[] outer(int[] rightArray, int[] leftArray);

}
