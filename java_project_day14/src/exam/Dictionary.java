package exam;

import java.util.Arrays;

public class Dictionary extends PairMap{
    private int count;

    public Dictionary(int i) {
        super();
        keyArray = new String[i];
        valueArray = new String[i];

    }
    //키 값으로 value를 검색
    public String get(String key){
        for(int i = 0; i<count;i++){
            if(keyArray[i].equals(key)){
                return valueArray[i];
            }
        }
        return "없음";
    };

    //key와 vaule를 쌍으로 저장
    public void put(String key, String value){
        keyArray[count] = key;
        valueArray[count] = value;
        count++;
    };

    //key 값을 가진 아이템(value와 함께)을 삭제, 삭제된 value 리턴
    public String delete(String key){
        int deletedIndex = 0;
        for(int i = 0; i<count;i++){
            if(keyArray[i].equals(key)){
                deletedIndex = i;
            }
        }

        for(int i = 0; i<count;i++){
            keyArray[deletedIndex] = keyArray[++deletedIndex];
            valueArray[--deletedIndex] = valueArray[++deletedIndex];
        }
        count--;
        return get(key);
    };

    //현제 저장된 아이템의 개수 리턴
    public int length(){
        return count;
    };

    public void printAllArray(){
        System.out.println(Arrays.toString(keyArray));
        System.out.println(Arrays.toString(valueArray));
    }
}
