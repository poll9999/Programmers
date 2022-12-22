package Level2;

public class 스킬트리 {
    public static void main(String[] args) {
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD", skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String data : skill_trees){
            String result = data;
            for(int i=0; i< data.length(); i++){
                String s = data.substring(i, i+1);
                if(!skill.contains(s)){
                    result=result.replace(s, "");
                }
            }
            if (skill.indexOf(result)==0) answer++;
        }

        return answer;
    }
}
