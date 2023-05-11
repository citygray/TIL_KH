package exam;

public class StringStack implements Stack{
    public int size;
    public String[] stack;
    private int capacity;

    StringStack(int size){
        this.size = size;
        stack = new String[size];
        capacity = size;
    }

    //현재 스택에 저장된 개수 리턴
    @Override
    public int length(){
        return stack.length;
    };
    //스택의 전체 저장 가능한 개수 리턴
    @Override
    public int capacity(){
        return capacity;
    };
    //현재스택의 값 리턴
    @Override
    public String pop(){
        return stack[length()-capacity()];
    };

    //현재 스택에 데이터 추가
    @Override
    public boolean push(String val){

        if(capacity==0){
            return false;
        }else{
            stack[length()-capacity()] = val;
            capacity--;
            return true;
        }

    };
}
