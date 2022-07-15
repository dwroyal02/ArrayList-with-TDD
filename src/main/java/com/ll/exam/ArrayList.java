package com.ll.exam;

public class ArrayList {
    int size;
    Object[] groupOfData;

    ArrayList(){
        this.size = 0;
        groupOfData = new Object[2];
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        expandSize();
        groupOfData[size] = value;
            size++;
    }

    private void expandSize() {
        if(size == groupOfData.length){
            Object[] tmp = new Object[groupOfData.length*2];

            for(int i = 0; i<size; i++){
                tmp[i] = groupOfData[i];
            }
            groupOfData = tmp;
        }
    }


    public Integer get(int index) {

        return (Integer) groupOfData[index];
    }

    public void removeAt(int i) {
        size--;
    }

    public int getArrayLength() {
            return groupOfData.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i = 0; i< size;i++){
            System.out.printf("%d : %d\n", i, groupOfData[i]);
        }
    }

    public void add(int value, int index) {
            expandSize();
            for(int i = size; i>index;i-- ){
                groupOfData[i] = groupOfData[i-1];
            }
            groupOfData[index] = value;
            size++;
    }
}

