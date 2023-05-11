package exam;

public abstract class PairMap {
    //key들을 저장하는 배열
    protected String keyArray[];

    //value들을 저장하는 배열
    protected String valueArray[];

    //키 값으로 value를 검색
    public abstract String get(String key);

    //key와 vaule를 쌍으로 저장
    public abstract void put(String key, String value);

    //key 값을 가진 아이템(value와 함께)을 삭제, 삭제된 value 리턴
    public abstract String delete(String key);

    //현제 저장된 아이템의 개수 리턴
    public abstract int length();
}
