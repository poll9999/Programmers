package Level1;

public class NotFullMoney {
    public static void main(String[] args) {

    }

    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum=0;
        for(int i=price; i<=price*count; i+=price){
            sum+=i;
        }
        answer=sum-money;
        if(answer<0){
            return 0;
        }
        return answer;
    }
}
